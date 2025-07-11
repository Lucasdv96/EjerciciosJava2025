import java.util.HashSet;

public abstract class Domicilio {
    public boolean visitable;
    HashSet<Habitante> habitantes = new HashSet<>();
    private Barrio barrio;

    public Domicilio(boolean visitable, Barrio barrio) {
        this.barrio = barrio;
        barrio.agregarDomicilio(this);
        this.visitable = visitable;
    }

    public Barrio getBarrio() {
        return barrio;
    }


    public void agregarHabitante(Habitante habitante){
        habitantes.add(habitante);
        habitante.setDomicilio(this);
    }

    public void sacarHabitante(Habitante habitante){
        habitantes.remove(habitante);
    }

    public HashSet<Habitante> getHabitantes() {
        return habitantes;
    }

    public abstract boolean esVisitable();
}
