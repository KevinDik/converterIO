import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //Menu de seleção dos conversores//
        Object[] itens = { "currency converter", "temperature converter", "distance converter" };
        Object selectedValue = JOptionPane.showInputDialog(null,
                "Please, select a item", "Opçao",
                JOptionPane.INFORMATION_MESSAGE, null,
                itens, itens[0]);

        if (selectedValue == "currency converter") {
            //menu de selecao para as moedas//
            Object[] opcoes = { "Dolar", "Libra", "Euro", "Real", "Pesos" };
            Object coins = JOptionPane.showInputDialog(null,
                    "Please, select a item", "Opçao",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    opcoes, opcoes[0]);
            System.out.println(coins);

        } else if (selectedValue == "temperature converter") {
            //menu de selecao para temperaturas//
            Object[] opcoes = { "Celsius", "Farenheit", "Kelvin"};
            Object temp = JOptionPane.showInputDialog(null,
                    "Please, select a item", "Opçao",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    opcoes, opcoes[0]);
            System.out.println(temp);

        } else if (selectedValue == "distance converter") {
            //menu de selecao para as distancias//
            Object[] opcoes = { "Decâmetro", "Hectômetro", "Quilômetro", "Decímetro", "Centímetro", "Milímetro"};
            Object temp = JOptionPane.showInputDialog(null,
                    "Please, select a item", "Opçao",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    opcoes, opcoes[0]);
            System.out.println(temp);
        }
    }
}
