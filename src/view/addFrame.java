package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

import dao.RecordDao;
import model.Record;
import util.JDBC;
import util.StringUtil;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class addFrame extends JInternalFrame {
    private JTextField text1;
    private JTextField text2;
    private JTextField text3;
    private JTextField text4;
    private JTextField text5;
    private JTextField text6;
    private JTextField text7;
    private JTextField text8;
    private JTextField text9;
    private JTextField text10;
    JTextArea textArea = new JTextArea();
    private JDBC jdbc=new JDBC();
    private RecordDao recorddao=new RecordDao();

    /**
     * Launch the application.
     */

    /**
     * Create the frame.
     */
    public addFrame() {
        setFrameIcon(new ImageIcon(addFrame.class.getResource("/images/edit.png")));
        setClosable(true);
        setIconifiable(true);
//        setTitle("填报信息");
        setBounds(100, 100, 770, 685);
        
        JLabel L2 = new JLabel("姓名");
        
        JLabel L3 = new JLabel("性别");
        
        JLabel L4 = new JLabel("学院");
        
        JLabel L5 = new JLabel("地址");
        
        JLabel L1 = new JLabel("账号");
        
        JLabel L6 = new JLabel("联系电话");
        
        JLabel L7 = new JLabel("湖北籍（是/否）");
        
        JLabel L8 = new JLabel("接触疫区人员（是/否）");
        
        JLabel L9 = new JLabel("是否感染");
        
        JLabel lblNewLabel_9 = new JLabel("日期");
        
        JButton button1 = new JButton("提交");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addrecordactionPerformed(e);
            }
        });
        
        JButton button2 = new JButton("重置");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetValueActionPerformed(e);
            }
        });
        button2.setIcon(new ImageIcon(addFrame.class.getResource("/images/reset.png")));
        
        text1 = new JTextField();
        text1.setColumns(10);
        
        text2 = new JTextField();
        text2.setColumns(10);
        
        text3 = new JTextField();
        text3.setColumns(10);
        
        text4 = new JTextField();
        text4.setColumns(10);
        
        text5 = new JTextField();
        text5.setColumns(10);
        
        text6 = new JTextField();
        text6.setColumns(10);
        
        text7 = new JTextField();
        text7.setColumns(10);
        
        text8 = new JTextField();
        text8.setColumns(10);
        
        text9 = new JTextField();
        text9.setColumns(10);
        
        text10 = new JTextField();
        text10.setColumns(10);
        
        JLabel L10 = new JLabel("其他描述：");
        

        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(130)
                    .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addComponent(button1)
                            .addGap(64)
                            .addComponent(button2)
                            .addGap(405))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                .addComponent(L1)
                                .addComponent(L3)
                                .addComponent(L2)
                                .addComponent(lblNewLabel_9)
                                .addComponent(L9)
                                .addComponent(L8)
                                .addComponent(L7)
                                .addComponent(L6)
                                .addComponent(L5)
                                .addComponent(L4)
                                .addComponent(L10))
                            .addPreferredGap(ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                            .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
                                .addComponent(text8, Alignment.LEADING)
                                .addComponent(text7)
                                .addComponent(text6, Alignment.LEADING)
                                .addComponent(text5, Alignment.LEADING)
                                .addComponent(text4, Alignment.LEADING)
                                .addComponent(text3)
                                .addComponent(text2, Alignment.LEADING)
                                .addComponent(text1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                .addComponent(text10)
                                .addComponent(text9)
                                .addComponent(textArea))
                            .addGap(183))))
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(34)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(L1)
                        .addComponent(text1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(L2)
                        .addComponent(text2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(12)
                    .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                        .addComponent(L3)
                        .addComponent(text3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addComponent(L4)
                            .addGap(18)
                            .addComponent(L5)
                            .addGap(18)
                            .addComponent(L6)
                            .addGap(26)
                            .addComponent(L7)
                            .addGap(18)
                            .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(L8)
                                .addComponent(text8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(ComponentPlacement.UNRELATED)
                            .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(L9)
                                .addComponent(text9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addComponent(text4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(ComponentPlacement.UNRELATED)
                            .addComponent(text5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(ComponentPlacement.UNRELATED)
                            .addComponent(text6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(ComponentPlacement.UNRELATED)
                            .addComponent(text7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addComponent(lblNewLabel_9)
                        .addComponent(text10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(L10)
                        .addComponent(textArea, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(button1)
                        .addComponent(button2))
                    .addGap(55))
        );
        getContentPane().setLayout(groupLayout);
        
     // 设置文本域边框
        textArea.setBorder(new LineBorder(new java.awt.Color(127,157,185), 1, false));
    }
    
    /**
     * 提交事件处理
     * @param e
     */
    private void addrecordactionPerformed(ActionEvent evt) {
        // TODO Auto-generated method stub
        String  id=this.text1.getText();
        String  name=this.text2.getText();
        String  sex=this.text3.getText();
        String  depart=this.text4.getText();
        String  phone=this.text5.getText();
        String  address=this.text6.getText();
        String  nati=this.text7.getText();
        String  touch=this.text8.getText();
        String  infected=this.text9.getText();
        String  date=this.text10.getText();
//        String  =this.text10.getText();
        if((StringUtil.isEmpty(id))&&(StringUtil.isEmpty(date))) {
            JOptionPane.showMessageDialog(null, "账号和日期不能为空！");
            return;
        }
        Record record=new Record(id,name,sex,depart,phone,address,nati,touch,infected,date);
        Connection con=null;
        try{
            con=jdbc.getCon();
            int n=RecordDao.recordadd(con,record);
            if(n==1){
                JOptionPane.showMessageDialog(null, "提交成功！");
                resetValue();
            }else{
                JOptionPane.showMessageDialog(null, "提交失败！");
            }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "提交失败！");
        }finally{
            try {
                jdbc.closeCon(con);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    /**
     * 重置事件处理
     * @param e
     */
    private void resetValueActionPerformed(ActionEvent e) {
        this.resetValue();       
    }

    /**
     * 重置表单
     */
    private void resetValue(){
        this.text1.setText("");
        this.text2.setText("");
        this.text3.setText("");
        this.text4.setText("");
        this.text5.setText("");
        this.text6.setText("");
        this.text7.setText("");
        this.text8.setText("");
        this.text9.setText("");
        this.text10.setText("");
        this.textArea.setText("");
        

        
    }
}
