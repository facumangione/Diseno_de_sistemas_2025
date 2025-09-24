import lombok.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Esquiador {
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private int edad;
    private Federacion federacion;
}
