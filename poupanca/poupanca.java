import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class poupanca {

    public static void main(String[] args) {

        JFrame frame = new JFrame(" $ Poupex $ ");
        frame.setSize(400, 230);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        BackgroundPanel panel = new BackgroundPanel("background.png");
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel jurosLabel = new JLabel("Juros ao mes %:");
        JLabel anosLabel = new JLabel("Numero de anos:");
        JLabel depositoLabel = new JLabel("Deposito mensal R$:");
        JLabel totalLabel = new JLabel("Total poupado R$:");

        JTextField jurosField = new JTextField(15);
        jurosField.setBackground(new Color(240, 182, 230));
        JTextField anosField = new JTextField(15);
        anosField.setBackground(new Color(240, 182, 230));
        JTextField depositoField = new JTextField(15);
        depositoField.setBackground(new Color(240, 182, 230));
        JTextField totalField = new JTextField(15);
        totalField.setBackground(new Color(240, 182, 230));
        totalField.setEditable(false);

        JButton okButton = new JButton("OK");
        okButton.setPreferredSize(new Dimension(200, 30));
        okButton.setBackground(new Color(173, 204, 255));
        okButton.setFocusPainted(false);

        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double juros = Double.parseDouble(jurosField.getText());
                    int anos = Integer.parseInt(anosField.getText());
                    double deposito = Double.parseDouble(depositoField.getText());

                    double total = calculo.calcularPoupanca(juros, anos, deposito);
                    totalField.setText(String.format("R$ %.2f", total));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "preencha todos os campos corretamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(jurosLabel, gbc);
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(jurosField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(anosLabel, gbc);
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(anosField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(depositoLabel, gbc);
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(depositoField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(totalLabel, gbc);
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(totalField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(okButton, gbc);

        frame.add(panel);
        frame.setVisible(true);
    }
}
