import java.util.ArrayList;

public class Multiplicar {

    public double multiplicar(ArrayList<Double> listNumeros) {
        double multi = 1;
        for (int i = 0; i < listNumeros.size(); i++) {
            multi *= listNumeros.get(i);
        }
        return multi;
    }
}
