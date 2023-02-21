import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Object[] itens = { "currency converter", "temperature converter", "distance converter"};
        Object selectedValue = JOptionPane.showInputDialog(null,
          "Please, select a item", "Opçao",
              JOptionPane.INFORMATION_MESSAGE, null,
                  itens, itens [0]);

        System.out.println(selectedValue);
    }
}
