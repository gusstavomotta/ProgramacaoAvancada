import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestaLayout extends JFrame{
    
    public TestaLayout (){

        super("Janela com layout");
        this.setBounds(50, 100, 400, 500);

        // BoxLayout k = new BoxLayout(pnl, BoxLayout.PAGE_AXIS);
        // FlowLayout l = new FlowLayout(FlowLayout.RIGHT);
        // pnl.setLayout(k);

        JPanel pnl = new JPanel();
        pnl.add(new JLabel("Clique aqui!"));
        pnl.add(new JButton("Botão"));
        pnl.add(new JLabel("Informe seu nome: "));
        pnl.add(new JTextField(10));      
        this.setContentPane(pnl);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
