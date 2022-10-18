import javax.swing.JOptionPane;

public class ExemploEstruturaDeDesisao {
    public static void main(String entrada[]) {
        int num;
        char op = 0;
        String msg = "", msgEntr = "Digite 1 para par/impar\nDigite 2 para positivo/negativo";

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        op = (JOptionPane.showInputDialog((msgEntr))).charAt(0);

        switch (op) {
            case '1':{
                if(num % 2 == 0) {
                    msg = msg + num + "é par.\n";
                } else {
                    msg = msg + num + "é impar.\n";
                }
                break;
            }
            case '2':{
                if(num > 0) {
                    msg = msg + num + "é par.\n";
                } else {
                    msg = msg + num + "é impar.\n";
                }
                break;
            }
                
        
            default: JOptionPane.showMessageDialog(null, "Opção invalida, calculos não realizdos");
        }

        if (op == '1' || op == '2') {
            JOptionPane.showMessageDialog(null, msg);
        }
        System.exit(0);
    }
}
