package clwzz;

import clwzz.ui.Main_Ui;
import clwzz.ui.ShouPiao_UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Administrator on 2017/3/14 0014.
 */
public class Login_Ui extends JFrame {
    JLabel account_Laber;
    JTextField account_Field;
    JLabel password_Laber;
    JTextField password_Field;
    JButton login_Button;
    JButton register_Button;
    public Login_Ui(){
        super("登录");
        setSize(700,500);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFell();
        Image image1=new ImageIcon("src/img/bg2.jpg").getImage();
        Image image2=new ImageIcon("src/img/bg2.jpg").getImage();

        JPanel jPanebg1=new BackgroundPanel(image1);
        JPanel jPanebg2=new BackgroundPanel(image2);
        jPanebg2.setOpaque(false);
        JPanel jPane1=new JPanel();
        account_Laber=new JLabel("账号");
        account_Field=new JTextField(15);
        password_Laber=new JLabel("密码");
        password_Field=new JTextField(15);
        login_Button=new JButton("登录");
        register_Button=new JButton("注册");
        JPanel jPane2=new JPanel();
        jPane2.setLayout(new FlowLayout());
        jPane2.add(account_Laber);
        jPane2.add(account_Field);
        JPanel jPane3=new JPanel();
        jPane3.setLayout(new FlowLayout());
        jPane3.add(password_Laber);
        jPane3.add(password_Field);
        JPanel jPane4=new JPanel();
        jPane4.setLayout(new FlowLayout());
        jPane4.add(login_Button);
        jPane4.add(register_Button);
        JPanel jPane5=new JPanel();
        jPane5.setSize(jPanebg1.getWidth()/4,jPanebg1.getHeight()/3);
        jPane5.setLayout(new GridLayout(4,1));
        JLabel account_logo_Laber=new JLabel("登 录");
        JPanel jPane6 =new JPanel();
        jPane6.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        account_logo_Laber.setFont(new java.awt.Font("Dialog", 1, 30));
        account_logo_Laber.setForeground(Color.black);
        jPane6.add(account_logo_Laber);
        jPane5.add(jPane6);
        jPane5.add(jPane2);
        jPane5.add(jPane3);
        jPane5.add(jPane4);
        jPanebg1.add(jPane5);
        JPanel jPane7=new JPanel();
        JLabel account_Laber1=new JLabel("账号");
        JTextField account_Field1=new JTextField(15);
        JLabel password_Laber1=new JLabel("密码");
        JTextField password_Field1=new JTextField(15);
        JButton login_Button1=new JButton("登录");
        JButton register_Button1=new JButton("注册");
        JPanel jPane8=new JPanel();
        jPane8.setLayout(new FlowLayout());
        jPane8.add(account_Laber1);
        jPane8.add(account_Field1);
        JPanel jPane9=new JPanel();
        jPane9.setLayout(new FlowLayout());
        jPane9.add(password_Laber1);
        jPane9.add(password_Field1);
        JPanel jPane10=new JPanel();
        jPane10.setLayout(new FlowLayout());
        jPane10.add(login_Button1);
        jPane10.add(register_Button1);
        JPanel jPane11=new JPanel();
        jPane11.setSize(jPanebg1.getWidth()/4,jPanebg1.getHeight()/3);
        jPane11.setLayout(new GridLayout(4,1));
        JLabel account_logo_Laber1=new JLabel("登 录");
        JPanel jPane12 =new JPanel();
        jPane12.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        account_logo_Laber1.setFont(new java.awt.Font("Dialog", 1, 30));
        account_logo_Laber1.setForeground(Color.black);
        jPane12.add(account_logo_Laber1);
        jPane1.setOpaque(false);
        jPane2.setOpaque(false);
        jPane3.setOpaque(false);
        jPane4.setOpaque(false);
        jPane5.setOpaque(false);
        jPane6.setOpaque(false);
        jPane7.setOpaque(false);
        jPane8.setOpaque(false);
        jPane9.setOpaque(false);
        jPane10.setOpaque(false);
        jPane11.setOpaque(false);
        jPane12.setOpaque(false);
        jPane11.add(jPane12);
        jPane11.add(jPane8);
        jPane11.add(jPane9);
        jPane11.add(jPane10);
        jPanebg2.add(jPane11);

        JTabbedPane jTabbedPane = new JTabbedPane();
        jTabbedPane.addTab("售票员登陆",jPanebg1);
        jTabbedPane.addTab("管理员登陆",jPanebg2);
        jTabbedPane.setTabPlacement(JTabbedPane.TOP);
        jTabbedPane.setBackground(Color.PINK);

        this.setLayout(new GridLayout(1, 1));
        this.add(jTabbedPane);
        setVisible(true);
        login_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                ShouPiao_UI shoupiao=new ShouPiao_UI();

            }
        });
        login_Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Main_Ui guanli=new Main_Ui();
            }
        });
    }
    private   void  setLookAndFell(){
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
            SwingUtilities.updateComponentTreeUI(this);
        }catch (Exception exc){
            System.err.println();
        }
    }
    public static void main(String[] args){
        Login_Ui ike=new Login_Ui();

    }
}
class BackgroundPanel extends JPanel{
    private static final long serialVersionUID = -6352788025440244338L;

    private Image image = null;

    public BackgroundPanel(Image image) {
        this.image = image;
    }

    // 固定背景图片，允许这个JPanel可以在图片上添加其他组件
    protected void paintComponent(Graphics g) {
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
    }
}
