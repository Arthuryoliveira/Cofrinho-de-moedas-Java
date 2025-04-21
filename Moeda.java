public abstract class Moeda {
    protected double valor;
    protected String pais;

    public Moeda(double valor, String pais) {
        this.valor = valor;
        this.pais = pais;
    }

    public double getValor() {
        return valor;
    }

    public String getPais() {
        return pais;
    }

    // Metodo para conversao para Real
    public abstract double getValorEmReal();
}
