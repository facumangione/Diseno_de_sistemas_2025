import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public abstract class Poligono {
    protected List<Lado> lados = new ArrayList<>();

    public int cantidadLados() {
        return lados.size();
    }

    @Override
    public String toString() {
        return "Polígono con " + cantidadLados() + " lados.";
    }
}
