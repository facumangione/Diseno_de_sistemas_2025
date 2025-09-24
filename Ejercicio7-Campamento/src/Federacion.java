import lombok.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Federacion {
    private String nombre;
    private int numeroFederados;
    private List<Estacion> estaciones;
}
