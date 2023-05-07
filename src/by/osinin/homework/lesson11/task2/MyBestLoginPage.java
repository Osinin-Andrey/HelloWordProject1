package by.osinin.homework.lesson11.task2;

import by.osinin.classwork.lesson11.WrongLoginException;
import by.osinin.classwork.lesson11.WrongPasswordException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyBestLoginPage extends JFrame {
    private JPanel panel;
    private JTextField loginField;
    private JPasswordField passwordField;
    private JButton button1;

    public MyBestLoginPage() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    checkCredentials(loginField.getText(), passwordField.getText());
                    JOptionPane.showMessageDialog (MyBestLoginPage.this, "Login and password are correct");
                } catch (WrongLoginException ex) {
                    JOptionPane.showMessageDialog (MyBestLoginPage.this, ex.getMessage(), "Oops, something bad with login", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                } catch (WrongPasswordException ex) {
                    JOptionPane.showMessageDialog (MyBestLoginPage.this, ex.getMessage(), "Oops, something bad with password", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog (MyBestLoginPage.this, ex.getMessage(), "Access denied", JOptionPane.WARNING_MESSAGE);
                    ex.printStackTrace();

                }
            }
        });
    }

    public static void main(String[] args) {
        MyBestLoginPage form = new MyBestLoginPage();
        form.setTitle("THIS IS MY APP"); // название приложения
        form.setContentPane(form.panel); // вставить окошко которое мы нарисовали
        form.setDefaultCloseOperation(EXIT_ON_CLOSE); //закроется тогда, когда нажмём крестик
        form.setVisible(true); // для того что бы запустить
        form.setSize(300,250); // размер окна при запуске
        form.setResizable(false); //запретить растягивать форму
        form.setLocation(500, 250); // по центру поставить форму

    }
    private static boolean checkCredentials (String login, String password) throws Exception {
        String correctLogin = "Super";
        String correctPassword = "Puper";
        if (login.length()<3) throw new WrongLoginException("Login is too short");
        if (password.length()<3) throw new WrongPasswordException("Password is too short");
        if (login.equals(correctLogin) && password.equals(correctPassword)) return true;
        throw new Exception("Login or password are incorrect");

    }
}
