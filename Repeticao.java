import javax.swing.JOptionPane;

public class Repeticao {
    public static void main(String entrada[]) {
       int tabuada;
       char op = 0;
       String msg = "", MsgEntr = "Digite 1 repetição for\nDigite 2 par repetição while\nDigite 3 para repetição do/while";
       
       tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
       op = (JOptionPane.showInputDialog((MsgEntr))).charAt(0);

       switch (op) {
        case '1': {
            msg = msg + "Tabuada do " + tabuada + " pelo for: \n\n";
            for(int i=1 ; i<= 10; i++) {
                msg = msg + tabuada + " x " + i+ " = " + tabuada*i + "\n";
            }
            break;
        }  
        case '2':{
            msg = msg + "Tabudada de " + tabuada + " = " + " pelo while:" + "\n\n";
            int i = 1;
            while (i<=10) {
                msg = msg + tabuada + " x " + i + tabuada*i + "\n";
                i++;  
            }
            break;
        }
        case '3':{
            msg = msg + "Tabudada de " + tabuada + " = " + " pelo do/while:" + "\n\n";
            int i = 1;
            do {
                msg = msg + tabuada + " x " + i + tabuada*i + "\n";
                i++;  
            }
            while (i<=10);
            break;
        }
       
        default: JOptionPane.showMessageDialog(null, "Opção invalida, calculo não realizado");
       }

       if (op >= '1' && op <='3'){
        JOptionPane.showMessageDialog(null, msg);
       }
    }
}
