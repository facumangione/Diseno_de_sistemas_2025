import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class Cuadrilatero extends Poligono {
    public Cuadrilatero() {
        super();
    }

    @Override
    public String toString() {
        return "Cuadrilátero con 4 lados.";
    }
}
