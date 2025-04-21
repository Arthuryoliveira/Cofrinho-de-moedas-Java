import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
    private List<Moeda> moedas; // Lista de moedas dentro do cofrinho

    public Cofrinho() {
        moedas = new ArrayList<>(); 
    }

    // Adicionar uma moeda ao cofrinho
    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
    }

    // Remove moeda do cofrinho
    public boolean removerMoeda(Moeda moeda) {
        for (int i = 0; i < moedas.size(); i++) {
            Moeda m = moedas.get(i);
            // Verifica se a moeda tem o mesmo valor e tipo
            if (m.getClass().equals(moeda.getClass()) && m.getValor() == moeda.getValor()) {
                moedas.remove(i);
                System.out.println("Moeda removida: " + m.getClass().getSimpleName() + " - " + m.getValor());
                return true;
            }
        }
        
        return false;
    }

    // Lista moedas no cofrinho
    public void listarMoedas() {
        if (moedas.isEmpty()) {
            System.out.println("Cofrinho vazio.");
        } else {
            for (Moeda moeda : moedas) {
                System.out.println(moeda.getClass().getSimpleName() + " - " + moeda.getValor());
            }
        }
    }

    // Calcula o total em Real no cofrinho
    public double totalConvertido() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.getValorEmReal();
        }
        return total;
    }
}
