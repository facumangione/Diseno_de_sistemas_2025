import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Visita {
    private Visitante visitante;
    private int habitacion;
    private String fechaInicio;
    private String fechaFin;
    private Alojamiento alojamiento;
}