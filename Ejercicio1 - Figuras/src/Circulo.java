import lombok.Data;

@Data
public class Circulo {
    private Punto centro;
    private double radio;

    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    public double getArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Círculo con centro en " + centro + " y radio " + radio +
                " (área=" + getArea() + ", perímetro=" + getPerimetro() + ")";
    }
}
