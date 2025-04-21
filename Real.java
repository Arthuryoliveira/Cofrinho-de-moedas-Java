public class Real extends Moeda {
    public Real(double valor) {
        super(valor, "Brasil");
    }

    @Override
    public double getValorEmReal() {
        return valor; // Ja esta em Real
    }
}
