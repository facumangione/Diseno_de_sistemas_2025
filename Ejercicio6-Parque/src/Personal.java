
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personal {
    private String dni;
    private String nombre;
    private String puesto; // Celador, Guarda, Investigador...
}
