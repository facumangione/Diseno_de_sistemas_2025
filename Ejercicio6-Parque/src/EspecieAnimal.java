
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class EspecieAnimal extends Especie {
    private String dieta; // herbívoro, carnívoro, omnívoro
}
