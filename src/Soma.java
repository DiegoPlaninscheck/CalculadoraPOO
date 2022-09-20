import java.util.ArrayList;

public class Soma {
    private double resultado;

    public void somar(ArrayList<Double> listNumero) {
        for (int i = 0; i < listNumero.size(); i++) {
            setResultado(getResultado() + listNumero.get(i));
        }
    }

    @Override
    public String toString() {
        return "Soma{" +
                "resultado=" + resultado +
                '}';
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
