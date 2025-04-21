public class Euro extends Moeda {
    private static final double COTACAO_EURO = 6.36;   // Cotacao do Euro para Real

    public Euro(double valor) {
        super(valor, "Euro");
    }

    @Override
    public double getValorEmReal() {
        return valor * COTACAO_EURO;  // Converte o valor do Euro para Real
    }
}
