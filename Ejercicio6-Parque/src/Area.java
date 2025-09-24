import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Area {
    private String nombre;
    private int km2;
    private List<Especie> especies = new ArrayList<>();

    public void agregarEspecie(Especie e) { especies.add(e); }
}