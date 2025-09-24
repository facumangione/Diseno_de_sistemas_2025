import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Proyecto {
    private String nombre;
    private int presupuesto;
    private String fechaInicio;
    private String fechaFin;
    private String especies;
}
