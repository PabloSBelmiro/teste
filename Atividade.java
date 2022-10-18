import javax.swing.JOptionPane;

public class Atividade {
    public static void main(String entrada[]) {


        int n1, n2 , mod, div;
        double raiz1, raiz2, pot;
        String msg = "";

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro", "Entrada de dados" ));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro inteiro", "Entrada de dados"));

        div = (int)n1 / (int)n2;
        mod = n1 % n2;
        raiz1 = Math.sqrt(n1);
        raiz2 = Math.sqrt(n2);
        pot = Math.pow(n1, n2);

        msg = msg + "resto da divisão de " + n1 + " por " + n2 + " = " + mod + "\n";
        msg = msg + "quociente da divisão de n1 por n2 = " + div + "\n";
        msg = msg + "raiz quadra de " + n1 + " = " + raiz1 + "\n";
        msg = msg + "raiz quadra de " + n2 + " = " + raiz2 + "\n";
        msg = msg + "potencia de n1 e n2 = " + pot + "\n";
        JOptionPane.showMessageDialog(null, msg);
        
        System.exit(0);

    }
}
