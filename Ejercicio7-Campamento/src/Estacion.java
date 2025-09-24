import lombok.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Estacion {
    private String codigo;
    private String nombre;
    private String contacto;
    private String direccion;
    private String telefono;
    private double kmEsquiables;
    private int numeroPistas;
    private List<Pista> pistas;
}
