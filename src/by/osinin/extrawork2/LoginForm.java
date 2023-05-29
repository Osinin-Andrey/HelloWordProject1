package by.osinin.extrawork2;

import by.osinin.extrawork.Example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JTextField textField1;
    private JPanel panel1;
    private JButton loginButton;
    private HelloForm helloForm;
    //связь между 2мя объектами

    public LoginForm() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField1.getText();
                System.out.println(text);

                    LoginForm.super.setVisible(false);//что бы окно спряталось
                    helloForm = new HelloForm(LoginForm.this, getDoctorByPlan(text));//что бы показалось 2 окно которое сделали


            }
        });
    }

    public static void main(String[] args) {
        LoginForm form = new LoginForm();
        form.setTitle("THIS IS MY APP"); // название приложения
        form.setContentPane(form.panel1); // вставить окошко которое мы нарисовали
        form.setDefaultCloseOperation(EXIT_ON_CLOSE); //закроется тогда, когда нажмём крестик
        form.setVisible(true); // для того что бы запустить
        form.setSize(300,250); // размер окна при запуске
        form.setResizable(false); //запретить растягивать форму
        form.setLocation(500, 250); // по центру поставить форму
    }

    private static String getDoctorByPlan(String plan) {
        if (plan.equals("1")) return "You need to visit our Terapist";
        if (plan.equals("2")) return "You need to visit our Dentist";
        if (plan.equals("3")) return "You need to visit our Surgeon";
        return "you need to go Okulist, there is not a correct optoin";

    }
}
