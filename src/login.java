import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class login implements ActionListener {
    JFrame frame = new JFrame("Ozzy Restaurant");
    JButton loginbutton = new JButton("Giriş");
    JButton resetbutton = new JButton("Reset");
    JPasswordField password = new JPasswordField();
    JLabel attention = new JLabel("Şifre 4 haneli olmalıdır. Şifrenizi unutmayınız. ");
    JTextField idfield = new JTextField();
    JPasswordField passwordfield = new JPasswordField();
    JLabel userid = new JLabel("İsim");
    JLabel userpass = new JLabel("Şifre");
    JLabel messagelb = new JLabel();
    JLabel messagelb2 = new JLabel();

    HashMap<String , String> logininfo = new HashMap<String  ,String>();
    login(HashMap<String,String> logininfoOriginal){
        logininfo = logininfoOriginal;
        userid.setBounds(70,140,75,25);
        userpass.setBounds(70,190,75,25);
        messagelb.setBounds(150,80,250,50);
        idfield.setBounds(150,140,200,25);
        passwordfield.setBounds(150,190,200,25);
        attention.setBounds(120,228,290,25);
        attention.setFont(new Font("Arial", Font.PLAIN , 11));
        loginbutton.setBounds(120,270,100,25);
        loginbutton.addActionListener(this);
        resetbutton.setBounds(240,270,100,25);
        resetbutton.addActionListener(this);
        loginbutton.setFocusable(false);
        resetbutton.setFocusable(false);
        messagelb.setText("Kullanıcı Girişi ");
        messagelb.setFont(new Font(null,Font.BOLD,15));
        messagelb2.setBounds(150,320,200,25);
        messagelb2.setFont(new Font(null,Font.BOLD,14));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,450);
        frame.setLayout(null);
        frame.setVisible(true );
        frame.add(userid);
        frame.add(userpass);
        frame.add(messagelb);
        frame.add(idfield);
        frame.add(passwordfield);
        frame.add(loginbutton);
        frame.add(resetbutton);
        frame.add(messagelb2);
        frame.add(attention);
        frame.setIconImage(img.getImage());



        frame.getContentPane().setBackground(new Color(245,240,255));
        loginbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(password.getPassword().length == 4)
                JOptionPane.showMessageDialog(null , "Lütfen şifrenizi unutmayınız! " );

            }
        });



    }
    ImageIcon img = new ImageIcon((Main.class.getResource("/tabakk.png")));
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == resetbutton){
            idfield.setText("");
            passwordfield.setText("");
        }
        if(e.getSource() == loginbutton){
            String userid = idfield.getText();
            String password = String.valueOf(passwordfield.getPassword());
            if(password.length() != 4 ){
                messagelb2.setText("Lütfen 4 haneli şifre girin. ");
                messagelb2.setForeground(new Color(204,0,0));


            }
            else{
                messagelb2.setText("Giriş başarılı. ");
                messagelb2.setForeground(new Color(0,102,0));
                frame.dispose();
                anamenu a = new anamenu(userid,password);

            }
        }

    }
}
