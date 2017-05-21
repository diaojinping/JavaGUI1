package clwzz.ui;

import javax.swing.*;
import java.awt.*;

public class XiTongSheZhi_Ui {

    public JPanel XiTongSheZhi(){

        Image image=new ImageIcon("src/img/bg2.jpg").getImage();
        JPanel jPanel = new BackgroundPanel(image);
        jPanel.setOpaque(false);
        return jPanel;
    }


}
