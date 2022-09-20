import java.util.ArrayList;

public class Soma {

    public double somar(ArrayList<Double> listNumero) {
        double soma = 0;
        for (int i = 0; i < listNumero.size(); i++) {
            soma += listNumero.get(i);
        }
        return soma;
    }
}
