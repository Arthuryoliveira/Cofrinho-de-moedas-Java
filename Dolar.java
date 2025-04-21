public class Dolar extends Moeda {
    private static final double COTACAO_DOLAR = 6.09;  // Cotacao do dolar para Real

    public Dolar(double valor) {
        super(valor, "Estados Unidos");
    }

    @Override
    public double getValorEmReal() {
        return valor * COTACAO_DOLAR;  // Converte o valor do Dolar para Real
    }
}
