
import lombok.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Equipo {
    private String codigo;
    private String entrenador;
    private List<Esquiador> esquiadores;
}
