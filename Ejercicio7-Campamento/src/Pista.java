import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pista {
    private String codigoEstacion;
    private int numero;
    private double longitudKm;
    private String dificultad; // verde, azul, roja, negra
}
