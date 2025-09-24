import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Participante {
    private String codigo;       // prueba + dorsal
    private Esquiador esquiador; // si es individual
    private Equipo equipo;       // si es por equipo
}
