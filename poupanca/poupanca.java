import java.awt.*;
import javax.swing.*;

    public class poupanca {

        public static void main(String[] args){

            JFrame frame = new JFrame("POUPANÇA");
            frame.setSize(400,300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            panel.setBackground(Color.lightGray);
            panel.setLayout(new BorderLayout());

            JButton button = new JButton("OK");
            button.setBackground(Color.black);
            button.setForeground(Color.white);
            button.setPreferredSize(new Dimension(200, 50));

            JTextField jurosField = new JTextField(10);
            jurosField.setFont(new Font("Serif", Font.BOLD, 15));

            JTextField anosField = new JTextField(10);
            anosField.setFont(new Font("Serif", Font.BOLD, 15));

            JTextField depositoField = new JTextField(10);
            depositoField.setFont(new Font("Serif", Font.BOLD, 15));

            JLabel label = new JLabel("Juros ao mes %: ");
            label.setFont(new Font("Serif", Font.BOLD, 15));

            JLabel label2 = new JLabel("Numero de anos: ");
            label.setFont(new Font("Serif", Font.BOLD, 15));

            JLabel label3 = new JLabel("Deposito mensal: ");
            label.setFont(new Font("Serif", Font.BOLD, 15));


            JPanel formPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
            formPanel.add(label);
            formPanel.add(jurosField);

            JPanel formPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
            formPanel.add(label2);
            formPanel.add(anosField);

            JPanel formPanel3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
            formPanel.add(label3);
            formPanel.add(depositoField);

            panel.add(formPanel, BorderLayout.NORTH);
            panel.add(formPanel2, BorderLayout.CENTER);
            panel.add(formPanel3, BorderLayout.SOUTH);
            panel.add(button, BorderLayout.SOUTH);
            frame.add(panel);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

        }
    
}
