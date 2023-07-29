package travour;


import javax.swing.*;
import java.awt.*;

    public class login extends JFrame {
        login() {

            setSize(900, 400);
            setLocation(350,200);
            setLayout(null);
            getContentPane().setBackground(Color.white);

            JPanel p1= new JPanel();
            p1.setBackground(new Color(	230, 230, 250));
            p1.setBounds(0,0,400,400);
            p1.setLayout(null);
            add(p1);


            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("img/logo.jpg"));
            Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel img = new JLabel(i3);

            img.setBounds(100,100,200,200);
            p1.add(img);

            JPanel p2= new JPanel();
            p2.setLayout(null);
            p2.setBackground(Color.WHITE);
            p2.setBounds(400,30,450,300);
            add(p2);

            JLabel user= new JLabel("Username");
            user.setBounds(60,20,100,25);
            user.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
            p2.add(user);

            JTextField t1 = new JTextField();
            t1.setBounds(60, 60, 330, 30);

            p2.add(t1);

            JLabel pass= new JLabel("Password");
            pass.setBounds(60,90,100,25);
            pass.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
            p2.add(pass);

            JTextField t2 = new JTextField();
            t2.setBounds(60, 150, 330, 30);
            p2.add(t2);

            JButton login = new JButton("Login");
            login.setBounds(60,200,130,30);
            login.setBackground(new Color		(112,128,144));
            login.setBorder(BorderFactory.createEmptyBorder());
            p2.add(login);

            JButton signup = new JButton("Sign Up");
            signup.setBounds(255,200,130,30);
            signup.setBackground(new Color		(255,240,245));
            signup.setBorder(BorderFactory.createEmptyBorder());
            p2.add(signup);

            setVisible(true);


        }

        public static void main(String[] args) {
            new login();
        }
    }




