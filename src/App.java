import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        Currency curr = new Currency();
        Distance dist = new Distance();
        Temperature temp = new Temperature();

        String entrada = JOptionPane.showInputDialog("Insira um valor:");
        while (entrada == null) {
            entrada = JOptionPane.showInputDialog("Favor informar um valor valido");
            if (entrada != null) {
                break;
            }
        }
        double insertValue = Double.parseDouble(entrada);
        String mensagem = "";

        String[] opcoes = { "Real para Dolar", "Real para Euro", "Real para Libra", "Real para peso" };
        String escolhido = (String) JOptionPane.showInputDialog(null,
                "Escolha a moeda para a qual você deseja converter", "Moedas", -1, null, opcoes, args);

        switch (escolhido) {
            case "Real para Dolar":
                System.out.println("Opção 1: " + insertValue);
                mensagem = "Valor convertido: R$ " + String.valueOf(curr.convertRealtoDolar(insertValue));
                break;

            case "Real para Euro":
                System.out.println("Opção 2: " + insertValue);
                mensagem = "Valor convertido: R$ " + String.valueOf(curr.convertRealToEuro(insertValue));
                break;

            case "Real para Libra":
                System.out.println("Opção 3: " + insertValue);
                mensagem = "Valor convertido: R$ " + String.valueOf(curr.convertRealToLibra(insertValue));
                break;

            case "Real para peso":
                System.out.println("Opção 4: " + insertValue);
                mensagem = "Valor convertido: R$ " + String.valueOf(curr.convertRealToPesoArgentino(insertValue));
                break;

            default:
                break;
        }

        JOptionPane.showMessageDialog(null, mensagem);
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja inserir outro valor?");
        if (resposta == JOptionPane.YES_OPTION) {

            main(args);
        }

        JOptionPane.showMessageDialog(null, "Ate logo!");

    }
}
