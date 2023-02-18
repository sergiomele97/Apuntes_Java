package SwingPack;

import javax.swing.*;

public class MainForm {
    private JTextPane pricePane;
    private JPanel taxPanel;
    private JButton buttonCalculate;


    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingTax");
        frame.setContentPane(new MainForm().pricePane);
        frame.setVisible(true);
    }
}
