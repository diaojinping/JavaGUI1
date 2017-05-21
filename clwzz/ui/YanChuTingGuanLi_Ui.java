package clwzz.ui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;
public class YanChuTingGuanLi_Ui{

    private DefaultTableModel tableModel_Yingting;
    private JTextField jTextField_yanchuting_sunhuai;
    private JTextField jTextField_yanchutng_mingcheng;
    private JTable jTable_fangyingting;

    private DefaultTableModel tableModel_ZuoWei;
    private JTextField jTextField_zuowei_zuoweishu;
    private JTextField jTextField_zuowei_yanchutingmingceng;
    private JTextField jTextField_zuowei_hang;
    private JTextField jTextField_zuowei_lie;
    private JTextField jTextField_zuowei_sunhuaishu;
    private JTable jTable_zuowei ;
    public JLabel jLabel_weizhi1 = new JLabel();
    private JLabel jLabel_weizhi2 = new JLabel();
    private JLabel jLabel_weizhi3 = new JLabel();
    private JLabel jLabel_weizhi4 = new JLabel();

    public String zuowei = "";


    public JTabbedPane YanChuTingGuanLi(){

        JTabbedPane jTabbedPane_yingyuanguanli = new JTabbedPane();
        jTabbedPane_yingyuanguanli.add("演出厅信息",YanChuTingXiXin());
        jTabbedPane_yingyuanguanli.add("演出厅修改", YanChuTing_XiuGai());
//        jTabbedPane_yingyuanguanli.setBackground(Color.PINK);

        return jTabbedPane_yingyuanguanli;
    }
    public JTabbedPane YanChuTingXiXin(){
        JTabbedPane jTabbedPane_yanchutingxixin = new JTabbedPane();
        jTabbedPane_yanchutingxixin.setTabPlacement(SwingConstants.RIGHT);
        jTabbedPane_yanchutingxixin.setBackground(Color.green);

        jTabbedPane_yanchutingxixin.add("1号演出厅",YanChuTing1());
        jTabbedPane_yanchutingxixin.add("2号演出厅",YanChuTing2());
        jTabbedPane_yanchutingxixin.add("3号演出厅",YanChuTing3());
        jTabbedPane_yanchutingxixin.add("4号演出厅",YanChuTing4());

        return jTabbedPane_yanchutingxixin;
    }

    public JPanel ShnegChengZuoWei(int a,int b){
        JPanel jPanel_shengchengZuowei = new JPanel();

        jPanel_shengchengZuowei.setLayout(new GridLayout(a, b,10,10));
        int i;
        int j;
        JButton[][] buttons = new JButton[a][b];
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                buttons[i][j] = new JButton();
                int aa = i+1;
                int bb = j+1;
                buttons[i][j].setName("第"+aa+"排 ,第"+bb+"座");
                buttons[i][j].setBackground(Color.white);
                buttons[i][j].addActionListener(new ActionListener() {
                    int a;
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // TODO Auto-generated method stub
                        JButton button = (JButton) e.getSource();
                        jLabel_weizhi1.setText(button.getName());
                        jLabel_weizhi1.setFont(new java.awt.Font("Dialog", 1, 20));
                        jLabel_weizhi1.setForeground(Color.blue);
                        a++;
                        if (a%2==0) {
                            button.setBackground(Color.white);
                        }else {
                            button.setBackground(Color.red);
                        }
                    }
                });
                jPanel_shengchengZuowei.add(buttons[i][j]);
            }
        }
        jPanel_shengchengZuowei.setOpaque(false);
        return jPanel_shengchengZuowei;
    }

    public JPanel ShnegChengZuoWei2(int a,int b){
        JPanel jPanel_shengchengZuowei = new JPanel();
        jPanel_shengchengZuowei.setLayout(new GridLayout(a, b,10,10));
        int i;
        int j;

        JButton[][] buttons = new JButton[a][b];
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                buttons[i][j] = new JButton();
                int aa = i+1;
                int bb = j+1;
                buttons[i][j].setName("第"+aa+"排,第"+bb+"座");
                buttons[i][j].setBackground(Color.pink);
                buttons[i][j].addActionListener(new ActionListener() {
                    int a;
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // TODO Auto-generated method stub
                        JButton button = (JButton) e.getSource();
                        jLabel_weizhi2.setText(button.getName());
                        jLabel_weizhi2.setFont(new java.awt.Font("Dialog", 1, 20));
                        jLabel_weizhi2.setForeground(Color.blue);
                        a++;
                        if (a%2==0) {
                            button.setBackground(Color.pink);
                        }else {
                            button.setBackground(Color.red);
                        }
                    }
                });
                jPanel_shengchengZuowei.add(buttons[i][j]);
            }
        }

        return jPanel_shengchengZuowei;
    }

    public JPanel ShnegChengZuoWei3(int a,int b){
        JPanel jPanel_shengchengZuowei = new JPanel();
        jPanel_shengchengZuowei.setLayout(new GridLayout(a, b,10,10));
        int i;
        int j;

        JButton[][] buttons = new JButton[a][b];
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                buttons[i][j] = new JButton();
                int aa = i+1;
                int bb = j+1;
                buttons[i][j].setName("第"+aa+"排,第"+bb+"座");
                buttons[i][j].setBackground(Color.pink);
                buttons[i][j].addActionListener(new ActionListener() {
                    int a;
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // TODO Auto-generated method stub
                        JButton button = (JButton) e.getSource();
                        jLabel_weizhi3.setText(button.getName());
                        jLabel_weizhi3.setFont(new java.awt.Font("Dialog", 1, 20));
                        jLabel_weizhi3.setForeground(Color.blue);
                        a++;
                        if (a%2==0) {
                            button.setBackground(Color.pink);
                        }else {
                            button.setBackground(Color.red);
                        }
                    }
                });
                jPanel_shengchengZuowei.add(buttons[i][j]);
            }
        }

        return jPanel_shengchengZuowei;
    }

    public JPanel ShnegChengZuoWei4(int a,int b){
        JPanel jPanel_shengchengZuowei = new JPanel();
        jPanel_shengchengZuowei.setLayout(new GridLayout(a, b,10,10));
        int i;
        int j;

        JButton[][] buttons = new JButton[a][b];
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                buttons[i][j] = new JButton();
                int aa = i+1;
                int bb = j+1;
                buttons[i][j].setName("第"+aa+"排,第"+bb+"座");
                buttons[i][j].setBackground(Color.pink);
                buttons[i][j].addActionListener(new ActionListener() {
                    int a;
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // TODO Auto-generated method stub
                        JButton button = (JButton) e.getSource();
                        jLabel_weizhi4.setText(button.getName());
                        jLabel_weizhi4.setFont(new java.awt.Font("Dialog", 1, 20));
                        jLabel_weizhi4.setForeground(Color.blue);
                        a++;
                        if (a%2==0) {
                            button.setBackground(Color.pink);
                        }else {
                            button.setBackground(Color.red);
                        }
                    }
                });
                jPanel_shengchengZuowei.add(buttons[i][j]);
            }
        }

        return jPanel_shengchengZuowei;
    }




    public JScrollPane YingTingXinXi(int a,int b){

        JPanel jPanel_Zuowei = ShnegChengZuoWei(a,b);
        jPanel_Zuowei.setOpaque(false);
        JScrollPane jScrollPane = new JScrollPane(jPanel_Zuowei);
        jScrollPane.setOpaque(false);
        return jScrollPane;
    }
    public JScrollPane YingTingXinXi2(int a,int b){

        JPanel jPanel_Zuowei = ShnegChengZuoWei(a,b);
        jPanel_Zuowei.setOpaque(false);
        JScrollPane jScrollPane = new JScrollPane(jPanel_Zuowei);
        jScrollPane.setOpaque(false);
        return jScrollPane;
    }
    public JScrollPane YingTingXinXi3(int a,int b){

        JPanel jPanel_Zuowei = ShnegChengZuoWei(a,b);
        jPanel_Zuowei.setOpaque(false);
        JScrollPane jScrollPane = new JScrollPane(jPanel_Zuowei);
        jScrollPane.setOpaque(false);
        return jScrollPane;
    }
    public JScrollPane YingTingXinXi4(int a,int b){

        JPanel jPanel_Zuowei = ShnegChengZuoWei(a,b);
        jPanel_Zuowei.setOpaque(false);
        JScrollPane jScrollPane = new JScrollPane(jPanel_Zuowei);
        jScrollPane.setOpaque(false);
        return jScrollPane;
    }

    public JPanel NiaoKanTu(int a,int b){
        JPanel jPanel = new JPanel();
        jPanel.setOpaque(false);
        jPanel.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        Insets insets = new Insets(10, 10, 10, 1);
        gridBagConstraints.insets = insets;

        JLabel jLabel = new JLabel();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel.add(jLabel, gridBagConstraints);

        JLabel jLabel3 = new JLabel();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel.add(jLabel3, gridBagConstraints);

        JPanel jPanel2 = new JPanel();
        JLabel jLabel2 = new JLabel("银幕");
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel2.setBackground(Color.orange);
        jPanel2.add(jLabel2);
        jPanel.add(jPanel2, gridBagConstraints);

        gridBagConstraints.fill = GridBagConstraints.BOTH;
        JScrollPane jScrollPane = YingTingXinXi(a,b);
        jScrollPane.setOpaque(false);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 100;
        gridBagConstraints.weighty = 100;
        gridBagConstraints.gridwidth = 2;
        jPanel.add(jScrollPane, gridBagConstraints);

        return jPanel;
    }
    public JPanel NiaoKanTu2(int a,int b){
        JPanel jPanel = new JPanel();
        jPanel.setOpaque(false);
        jPanel.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        Insets insets = new Insets(10, 10, 10, 1);
        gridBagConstraints.insets = insets;

        JLabel jLabel = new JLabel();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel.add(jLabel, gridBagConstraints);

        JLabel jLabel3 = new JLabel();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel.add(jLabel3, gridBagConstraints);

        JPanel jPanel2 = new JPanel();
        JLabel jLabel2 = new JLabel("银幕");
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel2.setBackground(Color.orange);
        jPanel2.add(jLabel2);
        jPanel.add(jPanel2, gridBagConstraints);

        gridBagConstraints.fill = GridBagConstraints.BOTH;
        JScrollPane jScrollPane = YingTingXinXi(a,b);
        jScrollPane.setOpaque(false);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 100;
        gridBagConstraints.weighty = 100;
        gridBagConstraints.gridwidth = 2;
        jPanel.add(jScrollPane, gridBagConstraints);

        return jPanel;
    }
    public JPanel NiaoKanTu3(int a,int b){
        JPanel jPanel = new JPanel();
        jPanel.setOpaque(false);
        jPanel.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        Insets insets = new Insets(10, 10, 10, 1);
        gridBagConstraints.insets = insets;

        JLabel jLabel = new JLabel();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel.add(jLabel, gridBagConstraints);

        JLabel jLabel3 = new JLabel();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel.add(jLabel3, gridBagConstraints);

        JPanel jPanel2 = new JPanel();
        JLabel jLabel2 = new JLabel("银幕");
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel2.setBackground(Color.orange);
        jPanel2.add(jLabel2);
        jPanel.add(jPanel2, gridBagConstraints);

        gridBagConstraints.fill = GridBagConstraints.BOTH;
        JScrollPane jScrollPane = YingTingXinXi(a,b);
        jScrollPane.setOpaque(false);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 100;
        gridBagConstraints.weighty = 100;
        gridBagConstraints.gridwidth = 2;
        jPanel.add(jScrollPane, gridBagConstraints);

        return jPanel;
    }
    public JPanel NiaoKanTu4(int a,int b){
        JPanel jPanel = new JPanel();
        jPanel.setOpaque(false);
        jPanel.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        Insets insets = new Insets(10, 10, 10, 1);
        gridBagConstraints.insets = insets;

        JLabel jLabel = new JLabel();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel.add(jLabel, gridBagConstraints);

        JLabel jLabel3 = new JLabel();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel.add(jLabel3, gridBagConstraints);

        JPanel jPanel2 = new JPanel();
        JLabel jLabel2 = new JLabel("银幕");
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel2.setBackground(Color.orange);
        jPanel2.add(jLabel2);
        jPanel.add(jPanel2, gridBagConstraints);

        gridBagConstraints.fill = GridBagConstraints.BOTH;
        JScrollPane jScrollPane = YingTingXinXi(a,b);
        jScrollPane.setOpaque(false);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 100;
        gridBagConstraints.weighty = 100;
        gridBagConstraints.gridwidth = 2;
        jPanel.add(jScrollPane, gridBagConstraints);

        return jPanel;
    }
    public JPanel JuTiXinXi(String[] shuxing,Object[][] xianyou){
        JPanel jPanel = new JPanel();
        JTable jTable = new JTable(xianyou,shuxing);
        jTable.setRowHeight(30);
        jTable.setGridColor(Color.orange);

        //设置表头居中
        JTableHeader tbh = jTable.getTableHeader();
        DefaultTableCellRenderer  renderer = (DefaultTableCellRenderer)tbh.getDefaultRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);

        //表周围的颜色
        Container c = jTable.getParent();
        if(c instanceof JViewport){
            JViewport jp = (JViewport)c;
            jp.setBackground(new Color(250, 250, 250));
        }


        jPanel.add(jTable);
        return jPanel;
    }
    public JPanel YanChuTing1(){
        Image image= new ImageIcon("src/img/bg2.jpg").getImage();

        JPanel jPanel = new BackgroundPanel(image);
        jPanel.setOpaque(false);
        jPanel.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        Insets insets = new Insets(10, 5, 0, 5);
        gridBagConstraints.insets = insets;

        JLabel jLabel = new JLabel("1号演出厅鸟看图");
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel.add(jLabel, gridBagConstraints);

        JLabel jLabel2 = new JLabel("具体信息");
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel.add(jLabel2, gridBagConstraints);

        gridBagConstraints.fill = GridBagConstraints.BOTH;

        JPanel jPanel3 = NiaoKanTu(8,11);
        jPanel3.setOpaque(false);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 80;
        gridBagConstraints.weighty = 100;
        jPanel.add(jPanel3, gridBagConstraints);
        String[] strings = {"属性","持有"};
        Object[][] objects = {{"座位",999},{"已损坏座位",134}};

        JPanel jPanel4 = new JPanel();
        jPanel4.setLayout(new GridLayout(3, 1));
        jPanel4.setOpaque(false);
        JPanel jPanel41 = JuTiXinXi(strings,objects);
        jPanel41.setOpaque(false);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0;
        gridBagConstraints.weighty = 0;


        JPanel jPanel42 = new JPanel();
        jPanel42.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        jPanel42.add(new JLabel("您目前所点击的位置："));

        JPanel jPanel43 = new JPanel();
        jPanel43.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        jLabel_weizhi1.setText(zuowei);
        jPanel43.add(jLabel_weizhi1);
        jPanel42.setOpaque(false);
        jPanel43.setOpaque(false);

        jPanel4.add(jPanel41);
        jPanel4.add(jPanel42);
        jPanel4.add(jPanel43);
        jPanel.add(jPanel4, gridBagConstraints);

        JPanel jPanel5 = new JPanel();
        jPanel5.setOpaque(false);
        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=2;
        gridBagConstraints.gridwidth=2;
        jPanel.add(jPanel5, gridBagConstraints);
        return jPanel;
    }
    public JPanel YanChuTing2(){
        Image image= new ImageIcon("src/img/bg2.jpg").getImage();

        JPanel jPanel = new BackgroundPanel(image);
        jPanel.setOpaque(false);
        jPanel.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        Insets insets = new Insets(10, 5, 0, 5);
        gridBagConstraints.insets = insets;

        JLabel jLabel = new JLabel("2号演出厅鸟看图");
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel.add(jLabel, gridBagConstraints);

        JLabel jLabel2 = new JLabel("具体信息");
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel.add(jLabel2, gridBagConstraints);

        gridBagConstraints.fill = GridBagConstraints.BOTH;

        JPanel jPanel3 = NiaoKanTu(8,11);
        jPanel3.setOpaque(false);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 80;
        gridBagConstraints.weighty = 100;
        jPanel.add(jPanel3, gridBagConstraints);
        String[] strings = {"属性","持有"};
        Object[][] objects = {{"座位",999},{"已损坏座位",134}};

        JPanel jPanel4 = new JPanel();
        jPanel4.setLayout(new GridLayout(3, 1));
        jPanel4.setOpaque(false);
        JPanel jPanel41 = JuTiXinXi(strings,objects);
        jPanel41.setOpaque(false);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0;
        gridBagConstraints.weighty = 0;


        JPanel jPanel42 = new JPanel();
        jPanel42.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        jPanel42.add(new JLabel("您目前所点击的位置："));

        JPanel jPanel43 = new JPanel();
        jPanel43.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        jLabel_weizhi1.setText(zuowei);
        jPanel43.add(jLabel_weizhi1);
        jPanel42.setOpaque(false);
        jPanel43.setOpaque(false);

        jPanel4.add(jPanel41);
        jPanel4.add(jPanel42);
        jPanel4.add(jPanel43);
        jPanel.add(jPanel4, gridBagConstraints);

        JPanel jPanel5 = new JPanel();
        jPanel5.setOpaque(false);
        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=2;
        gridBagConstraints.gridwidth=2;
        jPanel.add(jPanel5, gridBagConstraints);
        return jPanel;
    }
    public JPanel YanChuTing3(){
        Image image= new ImageIcon("src/img/bg2.jpg").getImage();

        JPanel jPanel = new BackgroundPanel(image);
        jPanel.setOpaque(false);
        jPanel.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        Insets insets = new Insets(10, 5, 0, 5);
        gridBagConstraints.insets = insets;

        JLabel jLabel = new JLabel("3号演出厅鸟看图");
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel.add(jLabel, gridBagConstraints);

        JLabel jLabel2 = new JLabel("具体信息");
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel.add(jLabel2, gridBagConstraints);

        gridBagConstraints.fill = GridBagConstraints.BOTH;

        JPanel jPanel3 = NiaoKanTu(8,11);
        jPanel3.setOpaque(false);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 80;
        gridBagConstraints.weighty = 100;
        jPanel.add(jPanel3, gridBagConstraints);
        String[] strings = {"属性","持有"};
        Object[][] objects = {{"座位",999},{"已损坏座位",134}};

        JPanel jPanel4 = new JPanel();
        jPanel4.setLayout(new GridLayout(3, 1));
        jPanel4.setOpaque(false);
        JPanel jPanel41 = JuTiXinXi(strings,objects);
        jPanel41.setOpaque(false);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0;
        gridBagConstraints.weighty = 0;


        JPanel jPanel42 = new JPanel();
        jPanel42.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        jPanel42.add(new JLabel("您目前所点击的位置："));

        JPanel jPanel43 = new JPanel();
        jPanel43.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        jLabel_weizhi1.setText(zuowei);
        jPanel43.add(jLabel_weizhi1);
        jPanel42.setOpaque(false);
        jPanel43.setOpaque(false);

        jPanel4.add(jPanel41);
        jPanel4.add(jPanel42);
        jPanel4.add(jPanel43);
        jPanel.add(jPanel4, gridBagConstraints);

        JPanel jPanel5 = new JPanel();
        jPanel5.setOpaque(false);
        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=2;
        gridBagConstraints.gridwidth=2;
        jPanel.add(jPanel5, gridBagConstraints);
        return jPanel;
    }
    public JPanel YanChuTing4(){
        Image image= new ImageIcon("src/img/bg2.jpg").getImage();

        JPanel jPanel = new BackgroundPanel(image);
        jPanel.setOpaque(false);
        jPanel.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        Insets insets = new Insets(10, 5, 0, 5);
        gridBagConstraints.insets = insets;

        JLabel jLabel = new JLabel("4号演出厅鸟看图");
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel.add(jLabel, gridBagConstraints);

        JLabel jLabel2 = new JLabel("具体信息");
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel.add(jLabel2, gridBagConstraints);

        gridBagConstraints.fill = GridBagConstraints.BOTH;

        JPanel jPanel3 = NiaoKanTu(8,11);
        jPanel3.setOpaque(false);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 80;
        gridBagConstraints.weighty = 100;
        jPanel.add(jPanel3, gridBagConstraints);
        String[] strings = {"属性","持有"};
        Object[][] objects = {{"座位",999},{"已损坏座位",134}};

        JPanel jPanel4 = new JPanel();
        jPanel4.setLayout(new GridLayout(3, 1));
        jPanel4.setOpaque(false);
        JPanel jPanel41 = JuTiXinXi(strings,objects);
        jPanel41.setOpaque(false);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0;
        gridBagConstraints.weighty = 0;


        JPanel jPanel42 = new JPanel();
        jPanel42.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        jPanel42.add(new JLabel("您目前所点击的位置："));

        JPanel jPanel43 = new JPanel();
        jPanel43.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        jLabel_weizhi1.setText(zuowei);
        jPanel43.add(jLabel_weizhi1);
        jPanel42.setOpaque(false);
        jPanel43.setOpaque(false);

        jPanel4.add(jPanel41);
        jPanel4.add(jPanel42);
        jPanel4.add(jPanel43);
        jPanel.add(jPanel4, gridBagConstraints);

        JPanel jPanel5 = new JPanel();
        jPanel5.setOpaque(false);
        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=2;
        gridBagConstraints.gridwidth=2;
        jPanel.add(jPanel5, gridBagConstraints);
        return jPanel;
    }


    /**
     * 演出厅修改
     */
    public JTabbedPane YanChuTing_XiuGai(){
        JTabbedPane jTabbedPane_Xiugai = new JTabbedPane();
        jTabbedPane_Xiugai.setTabPlacement(JTabbedPane.RIGHT);
        String[] strings = {"影厅名称","是否损坏"};
        Object[][] objects = {{"1号放映厅","是",}
                ,{"2号放映厅","否"},{"3号放映厅","否"},{"4号放映厅","否"}};

        String[] strings2 = {"影厅名称","座位数","损坏座位数","损坏座位行","损坏座位列"};
        Object[][] objects2 = {{"1号放映厅",120,2,12,9}
                ,{"2号放映厅",122,2,12,9},{"3号放映厅",110,9,12,9},{"4号放映厅",121,7,12,9}};

        jTabbedPane_Xiugai.add("影厅增删", YanChuTingZengShan(strings,objects));
        jTabbedPane_Xiugai.add("座位增删", ZuoWeiZengShan(strings2,objects2));

        return jTabbedPane_Xiugai;
    }

    public JPanel YanChuTingZengShan(String[] biaotou,Object[][] chengyuan){

        Image image=new ImageIcon("src/img/bg2.jpg").getImage();
        JPanel jPanel = new BackgroundPanel(image);
        jPanel.setOpaque(false);
        jPanel.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        Insets insets = new Insets(10, 5, 0, 5);
        gridBagConstraints.insets = insets;

        JLabel jLabel = new JLabel("放映厅信息");
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel.add(jLabel, gridBagConstraints);

        gridBagConstraints.fill = GridBagConstraints.BOTH;
        jTable_fangyingting = ZhiBiao_yingting(biaotou,chengyuan);
//        jTable_fangyingting.setBackground(Color.white);
        jTable_fangyingting.addMouseListener(new MouseAdapter() {//表格添加点击事件

            @Override
            public void mouseClicked(MouseEvent arg0) {
                // TODO Auto-generated method stub
                int select = jTable_fangyingting.getSelectedRow();  	//获取被选中的行
                Object aa = tableModel_Yingting.getValueAt(select, 0);
                Object ab = tableModel_Yingting.getValueAt(select, 1);

                jTextField_yanchutng_mingcheng.setText(aa.toString());
                jTextField_yanchuting_sunhuai.setText(ab.toString());
            }

        });


        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 120;
        gridBagConstraints.weighty = 100;
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.getViewport().setOpaque(false);
        jScrollPane.setOpaque(false);
        jScrollPane.setViewportView(jTable_fangyingting);
        jPanel.add(jScrollPane, gridBagConstraints);


        JPanel jPanel5 = new JPanel();
        jPanel5.setBackground(Color.orange);

        jPanel5.setLayout(new GridLayout(2,0));

        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new FlowLayout());
        jPanel2.add(new JLabel("影厅名称:"));
        jTextField_yanchutng_mingcheng = new JTextField(10);
        jPanel2.add(jTextField_yanchutng_mingcheng);
        jTextField_yanchuting_sunhuai = new JTextField(10);
        jPanel2.add(new JLabel("是否损坏："));
        jPanel2.add(jTextField_yanchuting_sunhuai);

        JPanel jPanel3 = new JPanel();
        jPanel3.setLayout(new FlowLayout());

        final JButton jButton_YanChuTing_tianjia = new JButton("添加影厅");
        jButton_YanChuTing_tianjia.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                String[] ra = {jTextField_yanchutng_mingcheng.getText(),
                        jTextField_yanchuting_sunhuai.getText()};
                tableModel_Yingting.addRow(ra);

            }
        });

        final JButton jButton_YanChuTing_Xiuagi = new JButton("修改影厅");
        jButton_YanChuTing_Xiuagi.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                int setect = jTable_fangyingting.getSelectedRow();//判断被选中的某行
                if(setect != -1){
                    tableModel_Yingting.setValueAt(jTextField_yanchutng_mingcheng.getText(),
                            setect, 0);
                    tableModel_Yingting.setValueAt(jTextField_yanchuting_sunhuai.getText(),
                            setect, 1);
                }

            }
        });

        final JButton jButton_YanChuTing_shanchu = new JButton("影厅删除");
        jButton_YanChuTing_shanchu.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                int select = jTable_fangyingting.getSelectedRow();
                if(select != -1){
                    tableModel_Yingting.removeRow(select);
                }

            }
        });

        jPanel3.add(jButton_YanChuTing_tianjia);
        jPanel3.add(jButton_YanChuTing_Xiuagi);
        jPanel3.add(jButton_YanChuTing_shanchu);

        jPanel5.add(jPanel2);
        jPanel5.add(jPanel3);

        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=2;
        gridBagConstraints.weightx = 10;
        gridBagConstraints.weighty = 10;
        jPanel.add(jPanel5, gridBagConstraints);

        return jPanel;

    }

    public JPanel ZuoWeiZengShan(String[] biaotou,Object[][] chengyuan){
        Image image=new ImageIcon("src/img/bg2.jpg").getImage();
        JPanel jPanel = new BackgroundPanel(image);
        jPanel.setOpaque(false);

        jPanel.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        Insets insets = new Insets(10, 5, 0, 5);
        gridBagConstraints.insets = insets;

        JLabel jLabel = new JLabel("座位信息");
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel.add(jLabel, gridBagConstraints);

        gridBagConstraints.fill = GridBagConstraints.BOTH;
        jTable_zuowei = ZhiBiao_ZuoWei(biaotou,chengyuan);

        jTable_zuowei.addMouseListener(new MouseAdapter() {//表格添加点击事件

            @Override
            public void mouseClicked(MouseEvent arg0) {
                // TODO Auto-generated method stub

                int select1 = jTable_zuowei.getSelectedRow();  	//获取被选中的行
                Object oa = tableModel_ZuoWei.getValueAt(select1, 0);
                Object ob = tableModel_ZuoWei.getValueAt(select1, 1);
                Object oc = tableModel_ZuoWei.getValueAt(select1, 2);
                Object od = tableModel_ZuoWei.getValueAt(select1, 3);
                Object oe = tableModel_ZuoWei.getValueAt(select1, 4);

                jTextField_zuowei_yanchutingmingceng.setText(oa.toString());
                jTextField_zuowei_zuoweishu.setText(ob.toString());
                jTextField_zuowei_sunhuaishu.setText(oc.toString());
                jTextField_zuowei_hang.setText(od.toString());
                jTextField_zuowei_lie.setText(oe.toString());

            }

        });


        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 120;
        gridBagConstraints.weighty = 100;
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setViewportView(jTable_zuowei);
        jScrollPane.getViewport().setOpaque(false);
        jScrollPane.setOpaque(false);
        jPanel.add(jScrollPane, gridBagConstraints);


        JPanel jPanel5 = new JPanel();
        jPanel5.setBackground(Color.orange);

        jPanel5.setLayout(new GridLayout(2,0));

        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new FlowLayout());

        jPanel2.add(new JLabel("影厅名称:"));
        jTextField_zuowei_yanchutingmingceng = new JTextField(10);
        jPanel2.add(jTextField_zuowei_yanchutingmingceng);

        jTextField_zuowei_zuoweishu= new JTextField(10);
        jPanel2.add(new JLabel("座位数："));
        jPanel2.add(jTextField_zuowei_zuoweishu);

        jTextField_zuowei_sunhuaishu = new JTextField(10);
        jPanel2.add(new JLabel("损坏座位数："));
        jPanel2.add(jTextField_zuowei_sunhuaishu);

        jTextField_zuowei_hang = new JTextField(10);
        jPanel2.add(new JLabel("损坏座位行："));
        jPanel2.add(jTextField_zuowei_hang);

        jTextField_zuowei_lie = new JTextField(10);
        jPanel2.add(new JLabel("损坏座位列："));
        jPanel2.add(jTextField_zuowei_lie);


        JPanel jPanel3 = new JPanel();
        jPanel3.setLayout(new FlowLayout());

        final JButton jButton_tianjia = new JButton("添加座位");
        jButton_tianjia.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub

                String[] ra = {jTextField_zuowei_yanchutingmingceng.getText(),
                        jTextField_zuowei_zuoweishu.getText(),
                        jTextField_zuowei_sunhuaishu.getText(),
                        jTextField_zuowei_hang.getText(),
                        jTextField_zuowei_lie.getText()};
                tableModel_ZuoWei.addRow(ra);

            }
        });

        final JButton jButton_Xiuagi = new JButton("修改座位");
        jButton_Xiuagi.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                int setect = jTable_zuowei.getSelectedRow();//判断被选中的某行
                if(setect != -1){
                    tableModel_ZuoWei.setValueAt(jTextField_yanchutng_mingcheng.getText(),
                            setect, 0);
                    tableModel_ZuoWei.setValueAt(jTextField_yanchuting_sunhuai.getText(),
                            setect, 1);
                    tableModel_ZuoWei.setValueAt(jTextField_yanchuting_sunhuai.getText(),
                            setect, 2);
                    tableModel_ZuoWei.setValueAt(jTextField_yanchuting_sunhuai.getText(),
                            setect, 3);
                    tableModel_ZuoWei.setValueAt(jTextField_yanchuting_sunhuai.getText(),
                            setect, 4);
                }

            }
        });

        final JButton jButton_shanchu = new JButton("删除座位");
        jButton_shanchu.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                int select = jTable_zuowei.getSelectedRow();
                if(select != -1){
                    tableModel_ZuoWei.removeRow(select);
                }

            }
        });

        jPanel3.add(jButton_tianjia);
        jPanel3.add(jButton_Xiuagi);
        jPanel3.add(jButton_shanchu);

        jPanel5.add(jPanel2);
        jPanel5.add(jPanel3);

        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=2;
        gridBagConstraints.weightx = 10;
        gridBagConstraints.weighty = 10;
        jPanel.add(jPanel5, gridBagConstraints);

        return jPanel;
    }

    //信息表格
    public JTable ZhiBiao_yingting(String[] biaotou,Object[][] chengyuan){

        tableModel_Yingting = new DefaultTableModel(chengyuan, biaotou);
        JTable jTable1 = new JTable(tableModel_Yingting);
        JTableHeader header = new JTableHeader();
        header = jTable1.getTableHeader();
        jTable1.setRowHeight(30);
//        jTable1.setGridColor(Color.red);

        //设置表格为单选模式
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        DefaultTableCellRenderer   r   =   new   DefaultTableCellRenderer();
        r.setHorizontalAlignment(JLabel.CENTER);
        jTable1.setDefaultRenderer(Object.class,   r);

        //设置表头居中
        JTableHeader tbh = jTable1.getTableHeader();
        DefaultTableCellRenderer  renderer = (DefaultTableCellRenderer)tbh.getDefaultRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);

        //设置选定后的颜色
        jTable1.setSelectionBackground(Color.gray);

        //表周围的颜色
        Container c = jTable1.getParent();
        if(c instanceof JViewport){
            JViewport jp = (JViewport)c;
            jp.setBackground(new Color(100, 123, 313));
        }

        return jTable1;
    }

    public JTable ZhiBiao_ZuoWei(String[] biaotou,Object[][] chengyuan){

        tableModel_ZuoWei = new DefaultTableModel(chengyuan, biaotou);
        JTable jTable = new JTable(tableModel_ZuoWei);
        JTableHeader header = new JTableHeader();
        header = jTable.getTableHeader();
        header.setBackground(Color.blue);
        jTable.setRowHeight(30);
        jTable.setGridColor(Color.red);

        //设置表格为单选模式
        jTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        DefaultTableCellRenderer   r   =   new   DefaultTableCellRenderer();
        r.setHorizontalAlignment(JLabel.CENTER);
        jTable.setDefaultRenderer(Object.class,   r);

        //设置表头居中
        JTableHeader tbh = jTable.getTableHeader();
        DefaultTableCellRenderer  renderer = (DefaultTableCellRenderer)tbh.getDefaultRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);

        //设置选定后的颜色
        jTable.setSelectionBackground(Color.gray);

        //表周围的颜色
        Container c = jTable.getParent();
        if(c instanceof JViewport){
            JViewport jp = (JViewport)c;
            jp.setBackground(new Color(100, 123, 313));
        }

        return jTable;
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

}
