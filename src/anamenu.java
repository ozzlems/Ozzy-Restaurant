import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.Locale;

public class anamenu {

    JFrame j = new JFrame("Menü Sayfası");
    DefaultListModel<String> listModel = new DefaultListModel<>();
    JList<String> list = new JList<>(listModel);
    public int totalPrice = 0;
    int maxvalue = 0;
    String userPassword;
    DefaultListModel<String> listModel1 = new DefaultListModel<>();

    JList<String> list2 = new JList<>(listModel1);
    DefaultListModel<String> listModel2 = new DefaultListModel<>();
    JList<String> list3 = new JList<>(listModel2);
    JButton btn = new JButton("Seçiniz ");
    JButton btn2 = new JButton("Seçiniz ");
    JButton btn3 = new JButton("Seçimi Onayla");
    JButton btn4 = new JButton("Onayla ");
    JButton btn6 = new JButton("Ödemeye geç ");
   JPasswordField ps = new JPasswordField(4);
    JLabel lb = new JLabel();
    JLabel lb2 = new JLabel();
    JLabel lb3 = new JLabel();
    JLabel lb4 = new JLabel();
    JLabel lb5 = new JLabel();
    JLabel lb6 = new JLabel();
    JLabel lb7 = new JLabel();
    JLabel lb8 = new JLabel();
    JLabel lb11 = new JLabel();
    JLabel lb12 = new JLabel();
    JLabel lb13 = new JLabel();
    JLabel lb14 = new JLabel();
    JLabel lb15 = new JLabel();
    JLabel lb16 = new JLabel();
    JLabel lb17 = new JLabel();
    JLabel lb18 = new JLabel();
    JLabel lb19 = new JLabel();
    JLabel lb20 = new JLabel();

    ImageIcon icon = new ImageIcon(Main.class.getResource("/tikk.png"));
    JMenuBar bar = new JMenuBar();
    JMenu m = new JMenu("Yiyecekler");
    JMenu m1 = new JMenu("İçecekler");

    JMenuItem i1 = new JMenuItem("Pizza");
    JMenuItem i2 = new JMenuItem("Hamburger");
    JMenuItem i3 = new JMenuItem("Döner");
    JMenuItem i4 = new JMenuItem("Salata");
    JMenuItem i5 = new JMenuItem("Mantı");
    JMenuItem i6 = new JMenuItem("Sprite");
    JMenuItem i7 = new JMenuItem("Ayran");
    JMenuItem i8 = new JMenuItem("Çay");
    JMenuItem i9 = new JMenuItem("Su");
    JMenuItem i10 = new JMenuItem("Limonata");
    String buttons[] = {"Evet" , "Hayır"};

    JPopupMenu p = new JPopupMenu();
    JMenuItem item = new JMenuItem("Geri");



    public anamenu(String userid, String password){
        JFrame j = new JFrame("Menü Sayfası");
        JLabel lb9 = new JLabel("Hoşgeldin " + userid.substring(0,1).toUpperCase(Locale.ROOT) + userid.substring(1).toLowerCase(Locale.ROOT) + " !" );
        lb9.setFont(new Font(null,Font.LAYOUT_RIGHT_TO_LEFT,14));
        lb9.setForeground(new Color(0,0,0));
        lb9.setBounds(245,10,200,30);
        JLabel lb8 = new JLabel();
        lb8.setBounds(600,30,249,246);
        ImageIcon img = new ImageIcon((Main.class.getResource("/tabakk.png")));
        lb8.setIcon(new ImageIcon(img.getImage()));
        userPassword = password;
        j.getContentPane().setBackground(new Color(225,215,210));



        String[] listModel = new String[5];
        listModel[0] = "Pizza";
        listModel[1] = "Hamburger";
        listModel[2] = "Döner";
        listModel[3] = "Salata";
        listModel[4] = "Mantı";

        String[] listModel1 = new String[5];
        listModel1[0] = "Sprite";
        listModel1[1] = "Çay";
        listModel1[2] = "Su";
        listModel1[3] = "Ayran";
        listModel1[4] = "Limonata";

        String[] listModel2 = new String[5];
        listModel2[0] = "Baklava";
        listModel2[1] = "Künefe";
        listModel2[2] = "Dondurma";
        listModel2[3] = "Brownie";
        listModel2[4] = "Cheesecake";







        JList<String> list = new JList<>(listModel);
        list.setBorder(new LineBorder(Color.BLACK , 3, false));
        list.setOpaque(true);

        list.setVisibleRowCount(5);
                list2.setVisibleRowCount(5);
                list3.setVisibleRowCount(5);
        JLabel lb = new JLabel();
        lb.setBounds(80,60,120,50);
        lb.setText("Yiyecek Listesi");
        lb.setForeground(new Color(204,0,0));
        list.setSelectionForeground(Color.red);
        list.setSelectionBackground(Color.lightGray);
        list.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);

        list.setBounds(80,100,95,110);


        JList<String> list2 = new JList<>(listModel1);
        list2.setBorder(new LineBorder(Color.BLACK , 3, false));
        list2.setOpaque(true);
        JLabel lb2 = new JLabel();
        list2.setSelectionForeground(Color.red);
        list2.setSelectionBackground(Color.lightGray);
        list2.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
        lb2.setText("İçecek Listesi");
        lb2.setForeground(new Color(204,0,0));
        lb2.setBounds(80,210,80,50);
        list2.setBounds(80,250,95,110);
        JButton btn = new JButton("Seçiniz ");


        JList<String> list3 = new JList<>(listModel2);
        list3.setBorder(new LineBorder(Color.BLACK , 3, false));
        list3.setOpaque(true);
        JLabel lb10 = new JLabel("Tatlı Listesi");
        list3.setSelectionForeground(Color.red);
        list3.setSelectionBackground(Color.lightGray);
        list3.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
        lb10.setForeground(new Color(204,0,0));
        lb10.setBounds(390,65,80,50);
        list3.setBounds(390,105,95,110);
        JButton btn5 = new JButton("Seçiniz");
        btn5.setBounds(490,125,90,30);


        btn.setBounds(180,120,90,30);
        JButton btn2 = new JButton("Seçiniz ");
        btn2.setBounds(180,270,90,30);
        JLabel lb3 = new JLabel();
        lb3.setBounds(300,140,250,50);
        lb3.setFont(lb3.getFont().deriveFont(Font.TRUETYPE_FONT));
        JLabel lb4 = new JLabel();
        lb4.setBounds(200, 290,250,50);
        lb4.setFont(lb4.getFont().deriveFont(Font.TRUETYPE_FONT));

        JButton btn3 = new JButton("Sepeti sıfırla");
        btn3.setBackground(new Color(204,0,0));
        btn3.setForeground(Color.white);
        btn3.setFont(btn3.getFont().deriveFont(Font.BOLD));
        btn3.setBounds(398,282,120,30);
        JLabel lb5 = new JLabel();
        lb5.setBounds(140,350, 300,60);
        JLabel lb6 = new JLabel();
        lb6.setBounds(150,400,400,40);
        JLabel lb7 = new JLabel();
        lb7.setBounds(320,400,250,100);
        lb7.setForeground(new Color(0,111,0));

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn3.setFocusable(false);

                list.clearSelection();
                list2.clearSelection();
                list3.clearSelection();
              if(list.isSelectionEmpty() == true){
                  lb5.setVisible(false);
                  lb19.setVisible(false);
                  lb12.setVisible(false);
                  btn6.setVisible(false);
                  ps.setVisible(false);
                  btn4.setVisible(false);
                  lb6.setVisible(false);
                  lb15.setVisible(false);
                  lb16.setVisible(false);
                  lb18.setVisible(false);
                  lb20.setVisible(false);
                  String text6 = "";
                  lb16.setText(text6);
                  totalPrice = 0;

              }
                if(list2.isSelectionEmpty() == true){
                    lb5.setVisible(false);
                    lb12.setVisible(false);
                    btn6.setVisible(false);
                    ps.setVisible(false);
                    btn4.setVisible(false);
                    lb6.setVisible(false);
                    lb15.setVisible(false);
                    lb16.setVisible(false);
                    lb18.setVisible(false);
                    lb20.setVisible(false);
                    String text3 = "";
                    lb5.setText(text3);
                    totalPrice = 0;
                }
                if(list3.isSelectionEmpty() == true){
                    lb5.setVisible(false);
                    lb12.setVisible(false);
                    btn6.setVisible(false);
                    ps.setVisible(false);
                    btn4.setVisible(false);
                    lb6.setVisible(false);
                    lb15.setVisible(false);
                    lb16.setVisible(false);
                    lb18.setVisible(false);
                    lb20.setVisible(false);
                    String text3 = "";
                    lb5.setText(text3);
                    totalPrice = 0;

                }

            }
        });




        lb11.setBounds(585,320,120,40);
        lb11.setFont(new Font(null,Font.CENTER_BASELINE,16));
        lb11.setText("    SEPETİM");
        lb11.setBorder(BorderFactory.createLineBorder(Color.RED , 4,true));
        lb12.setBounds(585,430,190,20);
        lb12.setFont(new Font("Display" ,Font.CENTER_BASELINE, 14));
        lb13.setBounds(585,440 ,190,20);
        lb13.setFont(new Font("Display" ,Font.CENTER_BASELINE, 14));
        lb14.setBounds(585,470,190,20);
        lb14.setFont(new Font("Display" ,Font.CENTER_BASELINE, 14));
        lb15.setBounds(585,445,190,20);
        lb15.setFont(new Font("Display" ,Font.CENTER_BASELINE, 14));
        lb16.setBounds(585,350,190,150);
        lb16.setFont(new Font("Display" ,Font.CENTER_BASELINE, 14));
        lb18.setBounds(670,540, 200,20);
        lb18.setFont(new Font("Arial" ,Font.BOLD, 15));
        lb19.setBounds(585, 540 , 150 , 15);

        lb19.setVisible(false);
        lb19.setFont(new Font("Display" , Font.BOLD, 15));
        lb19.setForeground(new Color(204,0,0));
        lb20.setBounds(160 , 540 , 250 , 20);
        lb20.setVisible(false);


        lb17.setBounds(495,500,200,20);
        lb17.setFont(new Font("Display" ,Font.BOLD, 14));
        lb17.setVisible(false);



        btn6.setBounds(585,600,130,30);
        btn6.setBorder(BorderFactory.createLineBorder(Color.BLACK , 3,true));
        btn6.setForeground(Color.WHITE);
        btn6.setBackground(new Color(204,0,0));
        btn6.setVisible(false);
        btn6.setFocusable(false);
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ps.setVisible(true);
                btn4.setVisible(true);
                lb6.setVisible(true);
                String text4 = "Ödeme için şifrenizi giriniz.";
                lb6.setText(text4);
                lb20.setVisible(true);




            }
        });




       btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(list.getSelectedIndex() == 0 ){
                  int    x =JOptionPane.showOptionDialog(j,"Pizza 50 TL , sepetinize eklensin mi ?" , " " , JOptionPane.NO_OPTION , JOptionPane.PLAIN_MESSAGE , null , buttons , buttons[0]);
                if(x == JOptionPane.YES_OPTION){
                  AddOrder("Pizza" , 50);



                }}
                if(list.getSelectedIndex() == 1){
                    int    x =    JOptionPane.showOptionDialog(j,"Hamburger 60 TL , sepetinize eklensin mi ?" , " " , JOptionPane.NO_OPTION , JOptionPane.PLAIN_MESSAGE , null , buttons , buttons[0]);
                    if(x == JOptionPane.YES_OPTION){
                       AddOrder("Hamburger"  ,60);
                        } }
                        if(list.getSelectedIndex() == 2){
                            int    x =   JOptionPane.showOptionDialog(j,"Döner 35 TL , sepetinize eklensin mi ?" , " " , JOptionPane.NO_OPTION , JOptionPane.PLAIN_MESSAGE , null , buttons , buttons[0]);
                            if(x == JOptionPane.YES_OPTION){
                                AddOrder("Döner" , 35);
                                } }
                if(list.getSelectedIndex() == 3){

                    int    x =     JOptionPane.showOptionDialog(j,"Salata 25 TL , sepetinize eklensin mi ?" , " " , JOptionPane.NO_OPTION , JOptionPane.PLAIN_MESSAGE , null , buttons , buttons[0]);
                    if(x == JOptionPane.YES_OPTION){
                       AddOrder("Salata" , 25);
                        } }
                if(list.getSelectedIndex() == 4){
                    int    x =      JOptionPane.showOptionDialog(j,"Mantı 40 TL , sepetinize eklensin mi ?" , " " , JOptionPane.NO_OPTION , JOptionPane.PLAIN_MESSAGE , null , buttons , buttons[0]);
                    if(x == JOptionPane.YES_OPTION){
                        AddOrder("Mantı" , 40);

                    }}}
       });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(list2.getSelectedIndex() == 0){
                   int y =  JOptionPane.showOptionDialog(j,"Sprite 10 TL , sepetinize eklensin mi ?" , " " , JOptionPane.NO_OPTION , JOptionPane.PLAIN_MESSAGE , null , buttons , "evet");
                    if(y == JOptionPane.YES_OPTION){
                        AddOrder("Sprite" , 10);
                        } }
                if(list2.getSelectedIndex() == 1){
                 int y =    JOptionPane.showOptionDialog(j,"Çay  7 TL , sepetinize eklensin mi ?" , " " , JOptionPane.NO_OPTION , JOptionPane.PLAIN_MESSAGE , null , buttons , "evet");
                    if(y == JOptionPane.YES_OPTION){
                       AddOrder("Çay"  , 7);
                        } }
                if(list2.getSelectedIndex() == 2){
                 int y =    JOptionPane.showOptionDialog(j,"Su  4 TL , sepetinize eklensin mi ?" , " " , JOptionPane.NO_OPTION , JOptionPane.PLAIN_MESSAGE , null , buttons , "evet");
                    if(y == JOptionPane.YES_OPTION){
                       AddOrder("Su" , 4);
                        } }
                if(list2.getSelectedIndex() == 3){
                int y =    JOptionPane.showOptionDialog(j,"Ayran  5 TL , sepetinize eklensin mi ?" , " " , JOptionPane.NO_OPTION , JOptionPane.PLAIN_MESSAGE , null , buttons , "evet");
                    if(y == JOptionPane.YES_OPTION){
                       AddOrder("Ayran" , 5);
                        } }
                if(list2.getSelectedIndex() == 4){
              int y =      JOptionPane.showOptionDialog(j,"Limonata 18 TL , sepetinize eklensin mi ?" , " " , JOptionPane.NO_OPTION , JOptionPane.PLAIN_MESSAGE , null , buttons , "evet");
                    if(y == JOptionPane.YES_OPTION){
                        AddOrder("Limonata" , 18);
                        } }
            }
        });
           btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(list3.getSelectedIndex() == 0){
                  int z =  JOptionPane.showOptionDialog(j,"Baklava 30 TL , sepetinize eklensin mi ?" , " " , JOptionPane.NO_OPTION , JOptionPane.PLAIN_MESSAGE , null , buttons , "evet");
                    if(z == JOptionPane.YES_OPTION){
                        AddOrder("Baklava",30);
                        }    }
                if(list3.getSelectedIndex() == 1){
                int z =    JOptionPane.showOptionDialog(j,"Künefe  50 TL , sepetinize eklensin mi ?" , " " , JOptionPane.NO_OPTION , JOptionPane.PLAIN_MESSAGE , null , buttons , "evet");
                    if(z == JOptionPane.YES_OPTION){
                        AddOrder("Künefe",50);
                       } }
                if(list3.getSelectedIndex() == 2){
                    int z =      JOptionPane.showOptionDialog(j,"Dondurma 20 TL , sepetinize eklensin mi ?" , " " , JOptionPane.NO_OPTION , JOptionPane.PLAIN_MESSAGE , null , buttons , "evet");
                    if(z == JOptionPane.YES_OPTION){
                        AddOrder("Dondurma",20);
                       } }
                if(list3.getSelectedIndex() == 3){
                    int z = JOptionPane.showOptionDialog(j,"Brownie 25 TL , sepetinize eklensin mi ?" , " " , JOptionPane.NO_OPTION , JOptionPane.PLAIN_MESSAGE , null , buttons , "evet");
                    if(z == JOptionPane.YES_OPTION){
                        AddOrder("Brownie",25);
                     } }
                if(list3.getSelectedIndex() == 4){
                    int z =  JOptionPane.showOptionDialog(j,"Cheesecake 40 TL , sepetinize eklensin mi ?" , " " , JOptionPane.NO_OPTION , JOptionPane.PLAIN_MESSAGE , null , buttons , "evet");
                    if(z == JOptionPane.YES_OPTION){
                       AddOrder("Cheesecake" , 40,list.getSelectedValue(),list2.getSelectedValue(),list3.getSelectedValue());
                        System.out.println(list3.getSelectedValue());
                       } }
            }
        });



        list.addMouseListener(new MouseAdapter() {
            int lastSelectedIndex;
            public void mouseClicked(MouseEvent e){
                int index = list.locationToIndex(e.getPoint());
                if(index == lastSelectedIndex ){
                    list.clearSelection();
                }
                lastSelectedIndex = list.getSelectedIndex();
                list.setFocusable(false );
            }

        });
         list2.addMouseListener(new MouseAdapter() {
            int lastSelectedIndex;
            public void mouseClicked(MouseEvent e){
                int index = list2.locationToIndex(e.getPoint());
                if( index == lastSelectedIndex ){
                    list2.clearSelection();
                }
                lastSelectedIndex = list2.getSelectedIndex();
                list2.setFocusable(false );
            }

        });
        list3.addMouseListener(new MouseAdapter() {
            int lastSelectedIndex;
            public void mouseClicked(MouseEvent e){
                int index = list3.locationToIndex(e.getPoint());
                if(index == lastSelectedIndex ){
                    list3.clearSelection();
                }
                lastSelectedIndex = list3.getSelectedIndex();
                list3.setFocusable(false );
            }

        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    lb5.setForeground(Color.red);
                    lb5.setFont(lb5.getFont().deriveFont(Font.BOLD));


                }

        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                    lb5.setForeground(Color.red);
                    lb5.setFont(lb5.getFont().deriveFont(Font.BOLD));
            }
        });





        btn.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {



                if(list.getSelectedIndex() != -1   ){

                    lb5.setForeground(Color.red);
                    lb5.setFont(lb5.getFont().deriveFont(Font.BOLD));



                }
            }});



        ps.setBounds(180,435,100,30);
        ps.setVisible(false);
        btn4.setBounds(190,480,80,30);
        btn4.setVisible(false);




        ImageIcon icon = new ImageIcon(Main.class.getResource("/tikk.png"));

        btn4.addActionListener(new ActionListener() {


            public void actionPerformed(ActionEvent e) {
                String password = new String(ps.getPassword());
                if(userPassword.equals(password)){
                    JOptionPane.showMessageDialog(j,"Onaylandı !", "Success",JOptionPane.INFORMATION_MESSAGE,icon);
                System.exit(0);}
                else{
                    JOptionPane.showMessageDialog(j,"Şifre yanlış "  ,"Error" , JOptionPane.ERROR_MESSAGE);

                }

            }
        });
        JMenuBar bar = new JMenuBar();
        JMenu m = new JMenu("Yiyecekler");
        JMenu m1 = new JMenu("İçecekler");
        JMenu m2 = new JMenu("Tatlılar");
        m.setForeground(Color.red);
        m1.setForeground(Color.red);
        m2.setForeground(Color.red);

        JMenuItem i1 = new JMenuItem("Pizza");
        JMenuItem i2 = new JMenuItem("Hamburger");
        JMenuItem i3 = new JMenuItem("Döner");
        JMenuItem i4 = new JMenuItem("Salata");
        JMenuItem i5 = new JMenuItem("Mantı");
        m.add(i1);
        m.add(i2);
        m.add(i3);
        m.add(i4);
        m.add(i5);
        JMenuItem i6 = new JMenuItem("Sprite");
        JMenuItem i7 = new JMenuItem("Ayran");
        JMenuItem i8 = new JMenuItem("Çay");
        JMenuItem i9 = new JMenuItem("Su");
        JMenuItem i10 = new JMenuItem("Limonata");
        m1.add(i6);
        m1.add(i7);
        m1.add(i8);
        m1.add(i9);
        m1.add(i10);
        JMenuItem i11 = new JMenuItem("Baklava");
        JMenuItem i12 = new JMenuItem("Künefe");
        JMenuItem i13 = new JMenuItem("Dondurma");
        JMenuItem i14 = new JMenuItem("Cheesecake");
        JMenuItem i15 = new JMenuItem("Brownie");
        m2.add(i11);
        m2.add(i12);
        m2.add(i13);
        m2.add(i14);
        m2.add(i15);




        JPopupMenu p = new JPopupMenu();
        JMenuItem item = new JMenuItem("Geri");
        p.add(item);
        j.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getButton() != 1){
                p.show(j,e.getX(),e.getY());}
            }
        });

        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = JOptionPane.showOptionDialog(j, "Çıkmak istiyor musunuz ? " , "" ,JOptionPane.NO_OPTION , JOptionPane.ERROR_MESSAGE , null , buttons , "evet");
                if( x == 0){
                    System.exit(0);
                }
            }

        });

        j.setIconImage(img.getImage());
       btn5.setText("Seçiniz");


        j.setSize(900,750);
        bar.add(m);
        bar.add(m1);
        bar.add(m2);
        j.setJMenuBar(bar);
        j.add(lb);
        j.add(lb2);
        j.add(lb3);
        j.add(lb4);
        j.add(lb5);
        j.add(lb6);
        j.add(lb7);
        j.getContentPane().add(lb8);
        j.add(ps);
        j.add(btn);
        j.add(btn2);
        j.add(btn3);
        j.add(btn4);
        j.add(btn5);
        j.add(btn6);
        j.add(list);
        j.add(list2);
        j.add(list3);
        j.add(lb9);
        j.add(lb10);
        j.add(lb11);
        j.add(lb12);
        j.add(lb13);
        j.add(lb14);
        j.add(lb15);
        j.add(lb16);
        j.add(lb18);
        j.add(lb19);
        j.add(lb20);
        j.setLayout(null);
        j.setVisible(true);



    }
    public void AddOrder(String order,int price){
        if(maxvalue >= 7){
         JOptionPane.showMessageDialog(null , "Maksimum 7 ürün ekleyebilirsiniz." , "Hata"  ,JOptionPane.ERROR_MESSAGE);
        }
        else {


            String text6 = order + " ----> " + price + " TL";
            totalPrice += price;
            lb16.setText("<html>" + lb16.getText() + "<br/>" + text6 + "<html/>");
            String text3 = "";
            if (list.getSelectedValue() != null) {
                text3 += list.getSelectedValue() + " ";

            }
            if (list2.getSelectedValue() != null) {
                text3 += list2.getSelectedValue() + " ";

            }
            if (list3.getSelectedValue() != null) {
                text3 += list3.getSelectedValue();

            }
            text3 += " seçildi.";
            lb5.setText(text3);
            btn6.setVisible(true);
            lb5.setVisible(true);
            lb16.setVisible(true);
            lb19.setVisible(true);
            lb18.setVisible(true);
            lb19.setText("TOPLAM = "  + totalPrice + " TL");
            lb20.setText("Ödenecek tutar =  " + totalPrice + " TL");
            lb20.setFont(new Font("Arial" , Font.BOLD, 15));

            maxvalue++;

        }
    }
    public void AddOrder(String order, int price, String a, String b, String c){
        if(maxvalue >= 7 ){

        }
        else {
            String text6 = order + " ----> " + price + " TL";
            totalPrice += price;
            lb16.setText("<html>" + lb16.getText() + "<br/>" + text6 + "<html/>");
            String text3 = "";
            if (a != null) {
                text3 += a + " ";
            }
            if (b != null) {
                text3 += b + " ";
            }
            if (c != null) {
                text3 += c;
            }
            text3 += " seçildi.";
            lb5.setText(text3);
            btn6.setVisible(true);
            lb5.setVisible(true);
            lb16.setVisible(true);
            lb18.setVisible(true);
            lb19.setVisible(true);
            lb19.setText("TOPLAM = "  + totalPrice + " TL ");
            lb20.setText("Ödenecek tutar =  " + totalPrice + " TL");

            maxvalue++;
        }
      }



}
