package by.osinin.extrawork2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloForm extends JFrame {
    private JPanel panel1;
    private JLabel label;
    private JButton backToLoginButton;
    private LoginForm loginForm; //для связки

    public HelloForm(LoginForm loginForm, String text) {
        this.setTitle("THIS IS MY APP"); // название приложения
        this.setContentPane(this.panel1); // вставить окошко которое мы нарисовали
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //закроется тогда, когда нажмём крестик
        this.setVisible(true); // для того что бы запустить
        this.setSize(250,250); // размер окна при запуске
        this.setResizable(false); //запретить растягивать форму
        this.setLocation(500, 250); // по центру поставить форму
        this.label.setText(text);
        this.loginForm = loginForm;
        backToLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HelloForm.super.setVisible(false);
                loginForm.setVisible(true);

            }
        });
    }
}
