import java.util.HashSet;

public class PapaNoel {
    HashSet<Domicilio> domicilios = new HashSet<>();
    HashSet<Domicilio> domiciliosPendientes = new HashSet<>();
    HashSet<Domicilio> domiciliosVisitados = new HashSet<>();
    HashSet<Domicilio> domiciliosBloqueados = new HashSet<>();


    @Override
    public String toString() {
        return "domiciliosPendientes=" + domiciliosPendientes;
    }

    public void agregarDomicilio(Domicilio domicilio){
        domicilios.add(domicilio);
    }

    public void agregarDomicilioPendiente(Domicilio dom){
        if(!domiciliosPendientes.contains(dom) && !domiciliosVisitados.contains(dom)){
            domiciliosPendientes.add(dom);
        }else {
            throw new NoSePudoAgregar("No se pudo agregar porque el domicilio ya fue visitado o esta pendiente");
        }
    }

    public HashSet<Domicilio> getDomiciliosPendientes() {
        return domiciliosPendientes;
    }

    public void agregarDomicilioVisitado(Domicilio domicilio){
        domiciliosVisitados.add(domicilio);
    }

    public void agregarDomicilioBloqueado(Domicilio domicilio){
        domiciliosBloqueados.add(domicilio);
    }



}
