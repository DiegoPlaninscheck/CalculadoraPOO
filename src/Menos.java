import java.util.ArrayList;

public class Menos {

    public double subtrair(ArrayList<Double> listNumero) {
        double sub = 0;
        for (int i = 0; i < listNumero.size(); i++) {
            sub -= listNumero.get(i);
        }
        return sub;
    }
}
