import javax.swing.*;
import java.awt.FlowLayout;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Converter IO");
        frame.setVisible(true);
        frame.setSize(450, 200);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] menu = {"Currency", "Temperature", "Distance"};
        JComboBox menuPrincipal = new JComboBox(menu);
        menuPrincipal.addActionListener(menuPrincipal);
        frame.add(menuPrincipal);

        if(menuPrincipal.getSelectedIndex() == 0) {
            String[] coins = {"Euro", "Libra", "Dolar", "Peso"};
            JComboBox subMenu = new JComboBox(coins);
            subMenu.addActionListener(subMenu);
            frame.add(subMenu);
        } else if (menuPrincipal.getSelectedIndex() == 1) {
            String[] temp = {"Celsius", "Farenheit", "Kelvin"};
            JComboBox subMenu = new JComboBox(temp);
            subMenu.addActionListener(subMenu);
            frame.add(subMenu);
        } else if (menuPrincipal.getSelectedIndex() == 1) {
            String[] dist = {"dam", "hm", "m", "km"};
            JComboBox subMenu = new JComboBox(dist);
            subMenu.addActionListener(subMenu);
            frame.add(subMenu);
        }

        JTextField value = new JTextField(10);
        frame.add(value);
       
        JButton btnCalc = new JButton("Calcular");
        frame.add(btnCalc);

        //escolher entre as opcoes currency, distance, temperature//
        //if("currency") {
            //solicitar o usuario que insira os valores via input//
            //selecionar a conversao com base no pedido//
            //chamada da funcao de execucao passando o parametro//
            //realiza conversao e monstra na tela//

        //} else if ("distance") {
            //solicitar o usuario que insira os valores via input//
            //selecionar a conversao com base no pedido//
            //chamada da funcao de execucao passando o parametro//
            //realiza conversao e monstra na tela//

        //} else if ("temperature") {
            //solicitar o usuario que insira os valores via input//
            //selecionar a conversao com base no pedido//
            //chamada da funcao de execucao passando o parametro//
            //realiza conversao e monstra na tela//

        //}

        //perguntar se quer solicitar uma nova conversao//
        //caso sim, limpar os campos e pedir para que seja preenchido//
        //caso nao encerrar o programa//
    }
}
