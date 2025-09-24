import lombok.*;
import java.util.List;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Excursion {
    private String nombre;
    private List<Visitante> visitantes = new ArrayList<>();
}
