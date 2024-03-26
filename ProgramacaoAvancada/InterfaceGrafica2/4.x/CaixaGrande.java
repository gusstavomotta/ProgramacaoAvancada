import javax.swing.JFrame;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

public class CaixaGrande extends JFrame {

    public CaixaGrande() {

        JFrame painel = new JFrame("Exercício 4.1");

        painel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        painel.setSize(400, 400);

        JTextField textField = new JTextField();
        JTextArea textArea = new JTextArea();

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append(textField.getText() + "\n");
                textField.setText("");
            }
        });

        painel.setLayout(new BorderLayout());
        painel.add(textField, BorderLayout.NORTH);
        painel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        painel.setVisible(true);

    }
}
