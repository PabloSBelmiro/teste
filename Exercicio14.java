import javax.swing.*;

public class Exercicio14 {
    public static void main(String entrada[]) {


        int n1, n2 , mod;
        double raiz1, raiz2;
        String msg = "";

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro", "Entrada de dados" ));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro inteiro", "Entrada de dados"));

        mod = n1 % n2;
        raiz1 = Math.sqrt(n1);
        raiz2 = Math.sqrt(n2);

        msg = msg + "resto da divisão de " + n1 + " por " + n2 + " = " + mod + "\n";
        msg = msg + "raiz quadra de " + n1 + " = " + raiz1 + "\n";
        msg = msg + "raiz quadra de " + n2 + " = " + raiz2 + "\n";
        JOptionPane.showMessageDialog(null, msg);
        
        System.exit(0);

    }
}
