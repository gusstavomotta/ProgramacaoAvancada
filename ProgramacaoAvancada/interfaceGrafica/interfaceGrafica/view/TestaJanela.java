import javax.swing.*;

public class TestaJanela extends JFrame {

    public TestaJanela (){
        super("Primeira interface em java");
        
        this.setBounds(100, 100, 400, 500);

        JPanel pnl = new JPanel();

        for (int i = 0; i < 10; i++) {
            pnl.add(new JButton("Botão " + i));
        }
        pnl.add(new JButton("Botao de rotulo maior"));

        this.setContentPane(pnl);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

}