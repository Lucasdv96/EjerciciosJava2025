import java.util.*;
import java.util.stream.Collectors;

public class PapaNoel {
    private ArrayList<Domicilio> domiciliosPendientes = new ArrayList<>();
    private HashSet<Domicilio> domiciliosVisitados = new HashSet<>();
    private ArrayList<Domicilio> domiciliosBloqueados = new ArrayList<>();
    private HashSet<Habitante> regalosEntregados = new HashSet<>();
    private Map<Barrio, Integer> barriosVisitados = new HashMap<>();


    private void entregarRegalos(Domicilio domcilioAVisitaiar){
        domcilioAVisitaiar.getHabitantes().stream()
                .filter(Habitante::puedeRecibirRegalo).forEach(habitante -> regalosEntregados.add(habitante));
    }

    public void agregarDomicilioPendiente(Domicilio dom){
        if(!domiciliosPendientes.contains(dom) && !domiciliosVisitados.contains(dom)) {
            domiciliosPendientes.add(dom);
        }else{
            throw new ExceptionDeNegocio("Este domicilio ya fue visitado/o esta pendiente");
        }

    }

    public void visitarDomicilioPendiente(){
        Domicilio domcilioAVisitaiar = domiciliosPendientes.get(0);
        if(domcilioAVisitaiar.esVisitable()) {
            entregarRegalos(domcilioAVisitaiar);
            domiciliosPendientes.remove(domcilioAVisitaiar);
            domiciliosVisitados.add(domcilioAVisitaiar);
            barriosVisitados.put(domcilioAVisitaiar.getBarrio(), barriosVisitados.getOrDefault(domcilioAVisitaiar.getBarrio(),0)+1);
        }else domiciliosBloqueados.add(domcilioAVisitaiar);
    }

    public void visitarDomicilioPendienteBloqueado(){
        Domicilio domicilioBloqueadp = domiciliosBloqueados.get(0);
        entregarRegalos(domicilioBloqueadp);
    }

    public Habitante habitanteMasViejo(){
        return regalosEntregados.stream().max(Comparator.comparing(Habitante::getEdad)).orElse(null);
    }

    public ArrayList<Domicilio> domiciliosAburridosVisitados(){
        return (ArrayList<Domicilio>) domiciliosVisitados.stream()
                .filter(domicilio -> domicilio.getHabitantes().stream().anyMatch(habitante -> !habitante.puedeRecibirRegalo())).collect(Collectors.toList());
    }

    public ArrayList<Domicilio> domiciliosAburridosPendientes(){
        return (ArrayList<Domicilio>) domiciliosPendientes.stream()
                .filter(domicilio -> domicilio.getHabitantes().stream().anyMatch(habitante -> !habitante.puedeRecibirRegalo())).collect(Collectors.toList());
    }
}
