import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Menu de seleção dos conversores//
        Object[] itens = { "currency converter", "temperature converter", "distance converter" };
        Object selectedValue = JOptionPane.showInputDialog(null,
                "Please, select a item", "Opçao",
                JOptionPane.QUESTION_MESSAGE, null,
                itens, itens[0]);

        if (selectedValue == "currency converter") {
            // menu de selecao para as moedas//
            Object[] opcoes = { "Dolar", "Libra", "Euro", "Real", "Pesos" };
            Object coin = JOptionPane.showInputDialog(null,
                    "Please, select a item", "Opçao",
                    JOptionPane.QUESTION_MESSAGE, null,
                    opcoes, opcoes[0]);
            
            while (true) {
                try {
                    String inputValue = JOptionPane.showInputDialog("Favor informe o valor em REAL a ser convertido:");
                    double valor = Double.parseDouble(inputValue);
                    if(coin == "Dolar") {
                        Double resultado = valor / 5.16789;
                        System.out.println(valor);
                        JOptionPane.showMessageDialog(null, valor + "R$ convertidos em " + coin + " = " + Math.round(resultado) + "Dolars" , "Conversão", JOptionPane.INFORMATION_MESSAGE);
                    } else if(coin == "Libra") {
                        Double resultado = valor / 6.25562;
                        JOptionPane.showMessageDialog(null, valor + "R$ convertidos em " + coin + " = " + Math.round(resultado) + "Libras" , "Conversão", JOptionPane.INFORMATION_MESSAGE);

                    } else if (coin == "Euro") {
                        Double resultado = valor / 5.49784;
                        JOptionPane.showMessageDialog(null, valor + "R$ convertidos em " + coin + " = " + Math.round(resultado) + "Euros" , "Conversão", JOptionPane.INFORMATION_MESSAGE);

                    } else if (coin == "Real") {
                        JOptionPane.showMessageDialog(null, valor + "R$ convertidos em " + coin + " = " + valor + "Reais" , "Conversão", JOptionPane.INFORMATION_MESSAGE);

                    } else if (coin == "Pesos Argentinos") {
                        Double resultado = valor / 0.0267604;
                        JOptionPane.showMessageDialog(null, valor + "R$ convertidos em " + coin + " = " + Math.round(resultado) + "Pesos Argentinos" , "Conversão", JOptionPane.INFORMATION_MESSAGE);
                    } else{
                        JOptionPane.showMessageDialog(null, "Erro na conversão de valores","Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("");
                    JOptionPane.showMessageDialog(null, "Valor inserido não é uma opção válida","Attention", JOptionPane.ERROR_MESSAGE);
                }
            }

        } else if (selectedValue == "temperature converter") {
            // menu de selecao para temperaturas//
            Object[] opcoes = { "Celsius", "Farenheit", "Kelvin" };
            Object temp = JOptionPane.showInputDialog(null,
                    "Please, select a item", "Opçao",
                    JOptionPane.QUESTION_MESSAGE, null,
                    opcoes, opcoes[0]);
            System.out.println(temp);

        } else if (selectedValue == "distance converter") {
            // menu de selecao para as distancias//
            Object[] opcoes = { "Decâmetro", "Hectômetro", "Quilômetro", "Decímetro", "Centímetro", "Milímetro" };
            Object distance = JOptionPane.showInputDialog(null,
                    "Please, select a item", "Opçao",
                    JOptionPane.QUESTION_MESSAGE, null,
                    opcoes, opcoes[0]);
            System.out.println(distance);
        }
    }
}
