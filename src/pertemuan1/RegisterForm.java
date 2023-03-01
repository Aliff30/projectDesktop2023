package pertemuan1;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class RegisterForm{
    public static void main(String[] args) {
        JFrame j = new JFrame("Register Form");
        
        JLabel nama = new JLabel();
        nama.setText("Nama");
        nama.setBounds(50, 100, 100, 30);
        j.add(nama);
        
        JLabel username = new JLabel();
        username.setText("Username");
        username.setBounds(50, 140, 100, 30);
        j.add(username);
        
        JLabel password = new JLabel();
        password.setText("Password");
        password.setBounds(50, 180, 100, 30);
        j.add(password);
        
        JLabel email = new JLabel();
        email.setText("Email");
        email.setBounds(50, 220, 100, 30);
        j.add(email);
        
        JLabel noHP = new JLabel();
        noHP.setText("No HP");
        noHP.setBounds(50, 260, 100, 30);
        j.add(noHP);
        
        JTextField namaTxt = new JTextField();
        namaTxt.setBounds(150, 100, 300, 30);
        j.add(namaTxt);
        
        JTextField usernameTxt = new JTextField();
        usernameTxt.setBounds(150, 140, 300, 30);
        j.add(usernameTxt);
        
        JPasswordField passwordTxt = new JPasswordField();
        passwordTxt.setBounds(150, 180, 300, 30);
        j.add(passwordTxt);
        
        JTextField emailTxt = new JTextField();
        emailTxt.setBounds(150, 220, 300, 30);
        j.add(emailTxt);
        
        JTextField noHPTxt = new JTextField();
        noHPTxt.setBounds(150, 260, 300, 30);
        j.add(noHPTxt);
        
        JButton regisButton = new JButton();
        regisButton.setText("Register");
        regisButton.setBounds(350, 340, 100, 30);
        j.add(regisButton);
        
        
        
        
        
        
        
        
        j.setSize(800, 800);
        j.setLayout(null);
        j.setVisible(true);
    }
}
