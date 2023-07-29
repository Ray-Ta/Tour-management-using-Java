package travour;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Dash extends JFrame {

    Dash(){
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        JPanel p1= new JPanel();
        p1.setLayout(null);
        p1.setBounds(0,0,1400,100);
        p1.setBackground(new Color(176,196,222));
        add(p1);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("img/logo1.png"));
        Image i2= i1.getImage().getScaledInstance(100,90,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel icon= new JLabel(i3);
        icon.setBounds(10,5,100,90);
        p1.add(icon);

        JLabel L1=new JLabel("Travel And Tourism Project");
        L1.setBounds(120,15,700,80);
        L1.setFont(new Font("Segoe UI Emoji",Font.BOLD,50));
        L1.setForeground(Color.WHITE);
        p1.add(L1);

        JPanel p2= new JPanel();
        p2.setLayout(null);
        p2.setBounds(0,100,300,750);
        p2.setBackground(new Color(176,196,222));
        add(p2);

        JButton b1=new JButton("Profile");
        b1.setBounds(10,0,280,50);
        b1.setBackground(Color.WHITE);
        b1.setFont(new Font("Segoe UI Emoji",Font.PLAIN,20));
        p2.add(b1);

        JButton b2=new JButton("Packages");
        b2.setBounds(10,55,280,50);
        b2.setBackground(Color.WHITE);
        b2.setFont(new Font("Segoe UI Emoji",Font.PLAIN,20));
        p2.add(b2);

        JButton b3=new JButton("Book Package");
        b3.setBounds(10,110,280,50);
        b3.setBackground(Color.WHITE);
        b3.setFont(new Font("Segoe UI Emoji",Font.PLAIN,20));
        p2.add(b3);

        JButton b4=new JButton("Book Hotel");
        b4.setBounds(10,165,280,50);
        b4.setBackground(Color.WHITE);
        b4.setFont(new Font("Segoe UI Emoji",Font.PLAIN,20));
        p2.add(b4);

        JButton b5=new JButton("Update Details");
        b5.setBounds(10,220,280,50);
        b5.setBackground(Color.WHITE);
        b5.setFont(new Font("Segoe UI Emoji",Font.PLAIN,20));
        p2.add(b5);

        JButton b6=new JButton("Show Details");
        b6.setBounds(10,275,280,50);
        b6.setBackground(Color.WHITE);
        b6.setFont(new Font("Segoe UI Emoji",Font.PLAIN,20));
        p2.add(b6);

        JButton b7=new JButton("Contact Us");
        b7.setBounds(1070,70,100,30);
        b7.setBackground(new Color(176,196,222));
        b7.setFont(new Font("Segoe UI Emoji",Font.PLAIN,15));
        b7.setBorder(new LineBorder(new Color(176,196,222)));
        p1.add(b7);

        JButton b8=new JButton("About Us");
        b8.setBounds(1170,70,90,30);
        b8.setBackground(new Color(176,196,222));
        b8.setFont(new Font("Segoe UI Emoji",Font.PLAIN,15));
        b8.setBorder(new LineBorder(new Color(176,196,222)));
        p1.add(b8);

        JButton b9=new JButton("Log Out");
        b9.setBounds(1250,70,100,30);
        b9.setBackground(new Color(176,196,222));
        b9.setFont(new Font("Segoe UI Emoji",Font.PLAIN,15));
        b9.setBorder(new LineBorder(new Color(176,196,222)));
        p1.add(b9);



        JPanel p3= new JPanel();
        p3.setLayout(null);
        p3.setBounds(300,100,1100,650);
        add(p3);
        ImageIcon c1= new ImageIcon(ClassLoader.getSystemResource("img/cov 2.jpg"));
        Image c2= c1.getImage().getScaledInstance(1100,650,Image.SCALE_DEFAULT);
        ImageIcon c3= new ImageIcon(c2);
        JLabel img= new JLabel(c3);
        img.setBounds(0,0,1100,650);
        p3.add(img);

        setVisible(true);
    }

    public static void main(String[] args){
        new Dash();
    }

}
