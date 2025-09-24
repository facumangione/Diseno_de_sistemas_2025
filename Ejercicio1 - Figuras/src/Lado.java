import lombok.Data;

@Data
public class Lado {
    private Punto inicio;
    private Punto fin;

    public Lado(Punto inicio, Punto fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public double getLongitud() {
        return inicio.distancia(fin);
    }

    @Override
    public String toString() {
        return "Lado de " + inicio + " a " + fin + " con longitud " + getLongitud();
    }
}
