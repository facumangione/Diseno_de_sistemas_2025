
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Visitante {
    private String dni;
    private String nombre;
    private int edad;
    private Alojamiento alojamiento;
}
