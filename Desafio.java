import javax.swing.JOptionPane;

public class Desafio {
    public static void main(String entrada[]) {
        int n1, n2, multi=0;
        char op = 0;
        String msg = "", msgEntr = "Digite 1 para multiplicação\nDigite 2 para somatorio\n";


        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));
        op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);

        switch (op) {
            case '1': {
                if (n1%2==0 && n2%2==0) {
                    multi = n1 * n2;
                    msg = msg + "A multiplicação de " + n1 +  " por n2 " + multi + "\n\n";
                }
                break;
            }
            case '2':{
                for (Integer i=1; i<=2; i++) {
                    multi += n1;
                }
                msg = msg + "Somatorio de " + n1 + ", " + n2 + " vezes é: " + multi + "\n\n";
            }
                break;
        
            default: JOptionPane.showMessageDialog(null, "Opção invalida, claculos não realizados");
        }

        if (op >= '1' && op <= '3') {
            JOptionPane.showMessageDialog(null, msg);
        }
        System.exit(0);
    }
}
