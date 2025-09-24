import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prueba {
    private String nombre;
    private String tipo; // fondo, slalom, salto...
    private List<LocalDate> fechas;
    private Estacion estacion;
    private List<Pista> pistas;
    private Participante vencedor;
    private double tiempoVencedor;
    private List<Resultado> resultados;
}
