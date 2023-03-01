package pertemuan1;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class NewMain {
    public static void main(String[] args) {
        JFrame j = new JFrame("Pertemuan pertamaku");
        
        JLabel username = new JLabel();
        username.setText("Username");
        username.setBounds(50, 100, 100, 30);
        j.add(username);
        
        JLabel password = new JLabel();
        password.setText("Password");
        password.setBounds(50, 140, 100, 30);
        j.add(password);
        
        JTextField usernameTxt = new JTextField();
        usernameTxt.setBounds(150, 100, 100, 30);
        j.add(usernameTxt);
        
        JPasswordField passwordTxt = new JPasswordField();
        passwordTxt.setBounds(150, 140, 100, 30);
        j.add(passwordTxt);
        
        JButton login = new JButton();
        login.setText("Login");
        login.setBounds(150, 180, 100, 30);
        j.add(login);
        
        
        
        
        j.setSize(800, 800);
        j.setLayout(null);
        j.setVisible(true);
    }
}
