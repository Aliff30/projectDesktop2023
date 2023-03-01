
package pertemuan1;

import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class Tugas {
    public static void main(String[] args) {
        JFrame j = new JFrame("Pendaftaran Seminar Online");
        ButtonGroup bg = new ButtonGroup();  
         
        JLabel nama = new JLabel();
        nama.setText("Nama");
        nama.setBounds(50, 40, 100, 30);
        j.add(nama);
        
        JLabel nim = new JLabel();
        nim.setText("NIM");
        nim.setBounds(50, 120, 100, 30);
        j.add(nim);
        
        JLabel email = new JLabel();
        email.setText("Email");
        email.setBounds(50, 200, 100, 30);
        j.add(email);
        
        JLabel aSekol = new JLabel();
        aSekol.setText("Asal Sekolah");
        aSekol.setBounds(50, 280, 100, 30);
        j.add(aSekol);
        
        JLabel jKel = new JLabel();
        jKel.setText("Jenis Kelamin");
        jKel.setBounds(50, 360, 100, 30);
        j.add(jKel);
        
        JLabel stat = new JLabel();
        stat.setText("Status");
        stat.setBounds(50, 450, 80, 30);
        j.add(stat);
        
        JLabel semi = new JLabel();
        semi.setText("Seminar yang ingin diikuti");
        semi.setBounds(50, 500, 250, 30);
        j.add(semi);
        
        JTextField namaTxt = new JTextField();
        namaTxt.setBounds(50, 80, 200, 30);
        j.add(namaTxt);
        
        JTextField nimTxt = new JTextField();
        nimTxt.setBounds(50, 160, 200, 30);
        j.add(nimTxt);
        
        JTextField emailTxt = new JTextField();
        emailTxt.setBounds(50, 240, 200, 30);
        j.add(emailTxt);
        
        JTextField sekolTxt = new JTextField();
        sekolTxt.setBounds(50, 320, 200, 30);
        j.add(sekolTxt);
        
        
        JRadioButton r1 = new JRadioButton("A) Laki-laki");
        JRadioButton r2 = new JRadioButton("B) Perempuan");
        r1.setBounds(50,400,100,30);    
        r2.setBounds(150,400,200,30);    
        bg.add(r1);bg.add(r2);    
        j.add(r1);j.add(r2);  
        
        String status[]={"Dosen","Mahasiswa","Umum"};        
        JComboBox st = new JComboBox(status);    
        st.setBounds(130, 450,120,30);    
        j.add(st); 
        
        JCheckBox checkBox1 = new JCheckBox("FrontEnd");  
        checkBox1.setBounds(50,540, 100,50);  
        JCheckBox checkBox2 = new JCheckBox("Java");  
        checkBox2.setBounds(150,540, 80,50); 
        JCheckBox checkBox3 = new JCheckBox("BackEnd");  
        checkBox3.setBounds(240,540, 100,50);
        JCheckBox checkBox4 = new JCheckBox("Database");  
        checkBox4.setBounds(350,540, 100,50); 
        j.add(checkBox1);  
        j.add(checkBox2);
        j.add(checkBox3);  
        j.add(checkBox4);  
        
        JButton regisButton = new JButton();
        regisButton.setText("Daftar");
        regisButton.setBounds(250, 600, 100, 30);
        j.add(regisButton);
      
        j.setSize(800, 1600);
        j.setLayout(null);
        j.setVisible(true);
    }
}
