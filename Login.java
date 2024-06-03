import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JButton rules,back;
    JTextField tfname;

    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("login.jpeg"));
        JLabel image= new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);


        JLabel heading=new JLabel("Simple Minds");
        heading.setBounds(760,60,300,45);
        heading.setFont(new Font("Mongolian Baiti",Font.BOLD,48));
        heading.setForeground(Color.BLUE);
        add(heading);


        JLabel name=new JLabel("Enter your name");
        name.setBounds(785,150,300,45);
        name.setFont(new Font("Ariel Black",Font.BOLD,28));
        name.setForeground(Color.BLACK);
        add(name);


        tfname=new JTextField();
        tfname.setBounds(750,210,300,25);
        tfname.setFont(new Font("Ariel Black",Font.PLAIN,22));
        add(tfname);


        rules=new JButton("Rules");
        rules.setBounds(750,280,120,25);
        rules.setBackground(new Color(30,144,255));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);


        back=new JButton("Back");
        back.setBounds(930,280,120,25);
        back.setBackground(new Color(30,144,255));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);



        setSize(1200,500);
        setLocation(350,200);
        setVisible(true);

    }

    public static void main (String args[])
    {
        new Login(); //Anonymous object


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==rules) {
            String name= tfname.getText();
            setVisible(false);
            new Rules(name);

        } else if (e.getSource()==back) {
            setVisible(false);
        }
    }
}
