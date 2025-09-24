import lombok.*;
import java.util.List;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CiudadAutonoma {
    private String nombre;
    private List<Parque> parques = new ArrayList<>();
}
