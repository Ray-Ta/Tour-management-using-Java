package travour;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener {
    JButton create;
    JButton signin;
    JTextField t5;
    JTextField t4;
    JTextField t3;
    JTextField t2;
    JTextField t1;
    Signup(){
    setBounds(450,175,500,400);
    setLayout(null);
    getContentPane().setBackground(Color.white);

    JPanel p1= new JPanel();
    p1.setBackground(new Color(	230, 230, 250));
    p1.setBounds(0,0,500,400);
    p1.setLayout(null);
    add(p1);
        JLabel user= new JLabel("Username");
        user.setBounds(50,20,120,25);
        user.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p1.add(user);

        t1 = new JTextField();
        t1.setBounds(190, 20, 180, 25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t1);

        JLabel name= new JLabel("Name");
        name.setBounds(50,60,120,25);
        name.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p1.add(name);

         t2 = new JTextField();
        t2.setBounds(190, 60, 180, 25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t2);

        JLabel pass= new JLabel("Password");
        pass.setBounds(50,100,120,25);
        pass.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p1.add(pass);

        t3 = new JTextField();
        t3.setBounds(190, 100, 180, 25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t3);

        JLabel contact= new JLabel("Contact No");
        contact.setBounds(50,140,120,25);
        contact.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p1.add(contact);

        t4 = new JTextField();
        t4.setBounds(190, 140, 180, 25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t4);

        JLabel email= new JLabel("Email");
        email.setBounds(50,180,120,25);
        email.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p1.add( email);

        t5 = new JTextField();
        t5.setBounds(190, 180, 180, 25);
        t5.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t5);

      create = new JButton("Create");
        create.setBounds(80,250,100,30);
        create.setBackground(new Color	(176,196,222));
        create.setBorder(BorderFactory.createEmptyBorder());
        create.addActionListener(this);
        p1.add(create);

         signin = new JButton("Sign in");
        signin.setBounds(240 ,250,100,30);
        signin.setBackground(new Color	(176,196,222));
        signin.setBorder(BorderFactory.createEmptyBorder());
       signin.addActionListener(this);

        p1.add(signin);

        setVisible(true);
}
public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==create){
        String user= t1.getText();
        String name= t2.getText();
        String pass= t3.getText();
        String contact= t4.getText();
        String email= t5.getText();
        String query= "insert into account values('"+user+"','"+name+"','"+pass+"','"+contact+"','"+email+"')";
        try{
            Connect c= new Connect();
            //c.s.executeQuery();
            JOptionPane.showMessageDialog(null, "account Created Successfully");
            setVisible(false);
            new login();
        }
        catch(Exception e){

        }
    }
    else if(ae.getSource()==signin){
        setVisible(false);
        new login();
    }
}
    public static void main(String[] args) {
        new Signup();
    }
}

