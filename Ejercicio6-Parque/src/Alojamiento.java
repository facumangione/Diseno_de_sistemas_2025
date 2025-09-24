
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alojamiento {
    private String tipo;     // hotel, cabaña, camping
    private int capacidad;
    private double precio;
}
