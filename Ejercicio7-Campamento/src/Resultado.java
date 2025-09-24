import lombok.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resultado {
    private Participante participante;
    private Prueba prueba;
    private LocalDate fecha;
    private double tiempoEmpleado;
    private int posicion;
}
