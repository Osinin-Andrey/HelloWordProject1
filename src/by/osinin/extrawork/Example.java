package by.osinin.extrawork;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example extends JFrame {
    private JButton okButton;
    private JTextField loginPasswordField;
    private JPasswordField passwordField2;
    private JPanel panel;

    public Example() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Someone clicked"); //при нажатии на кнопку - надпись
                JOptionPane.showMessageDialog(okButton, "Oyyyaaa" + loginPasswordField.getText()); // что бы выскочило окно с надписью + то что пишу в строчку

            }
        });
    }

    public static void main (String[] args) {
        Example form = new Example();
        form.setTitle("THIS IS MY APP"); // название приложения
        form.setContentPane(form.panel); // вставить окошко которое мы нарисовали
        form.setDefaultCloseOperation(EXIT_ON_CLOSE); //закроется тогда, когда нажмём крестик
        form.setVisible(true); // для того что бы запустить
        form.setSize(300,300); // размер окна при запуске


    }
}
