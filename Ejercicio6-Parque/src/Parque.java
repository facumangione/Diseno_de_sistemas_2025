
import lombok.*;
import java.util.List;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parque {
    private String nombre;
    private CiudadAutonoma ciudad;
    private List<Visitante> visitantes = new ArrayList<>();
    private List<Personal> personal = new ArrayList<>();
    private List<Alojamiento> alojamientos = new ArrayList<>();
    private List<Especie> especies = new ArrayList<>();
    private List<Excursion> excursiones = new ArrayList<>();
}
