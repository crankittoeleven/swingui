package co.anastasiou;

import javax.swing.*;

public class App extends JFrame {
    public App() {
        this.setTitle("swing_app");
        this.setSize(300, 200);

        JTextField txtName = new JTextField();
        txtName.setBounds(20, 20, 140, 40);

        this.add(txtName);

        JButton btn = new JButton("Click here!");
        btn.setBounds(20, 80, 100, 40);

        btn.addActionListener((e) -> JOptionPane.showMessageDialog(this, String.format("Hello, %s!", txtName.getText())));

        this.add(btn);

        this.setLayout(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    }
}
