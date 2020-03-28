package view;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

import dao.RecordDao;
import model.Record;
import util.JDBC;
import util.StringUtil;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class seachFram extends JInternalFrame {
    private JTable recordtable;
    JDBC jdbc=new JDBC();
    private JTextField s_id;
    private JTextField s_name;
    private JTextField s_date;
    private JTextField text1;
    private JTextField text2;
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private JRadioButton rb1 ;
    private JRadioButton rb2 ;
    private JTextField text4;
    private JTextField text5;
    private JTextField text6;
    private JTextField text7;
    private JTextField text8;
    private JTextField text9;
    private JTextField text10;
    private JTextField text11;
    private JTextArea text12;
    /**
     * Launch the application.
     */
    /**
     * Create the frame.
     */
    public seachFram() {
        setFrameIcon(new ImageIcon(seachFram.class.getResource("/images/modify.png")));
        setMaximizable(true);
        setIconifiable(true);
        setClosable(true);
        setBounds(100, 100, 963, 660);
        
        JScrollPane scrollPane = new JScrollPane();
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u641C\u7D22\u6761\u4EF6", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        
        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new TitledBorder(null, "\u8868\u5355\u64CD\u4F5C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                        .addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)
                        .addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)
                        .addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE))
                    .addContainerGap())
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(29)
                    .addComponent(panel, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                    .addGap(27)
                    .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
                    .addGap(18)
                    .addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
        );
        
        JLabel LL1 = new JLabel("账号：");
        
        text1 = new JTextField();
        text1.setEditable(false);
        text1.setColumns(10);
        
        JLabel LL2 = new JLabel("姓名：");
        
        text2 = new JTextField();
        text2.setText("");
        text2.setColumns(10);
        
        JLabel LL3 = new JLabel("性别：");
        
        JRadioButton rb1 = new JRadioButton("男");
        buttonGroup.add(rb1);
        rb1.setSelected(true);
        
        JRadioButton rb2 = new JRadioButton("女");
        buttonGroup.add(rb2);
        
        JLabel LL4 = new JLabel("学院：");
        
        text4 = new JTextField();
        text4.setText("");
        text4.setColumns(10);
        
        JLabel LL5 = new JLabel("电话：");
        
        text5 = new JTextField();
        text5.setColumns(10);
        
        JLabel LL6 = new JLabel("湖北籍：");
        
        text6 = new JTextField();
        text6.setColumns(10);
        
        JLabel LL7 = new JLabel("接触：");
        
        text7 = new JTextField();
        text7.setColumns(10);
        
        JLabel LL8 = new JLabel("疑似：");
        
        text8 = new JTextField();
        text8.setColumns(10);
        
        JLabel LL9 = new JLabel("确诊：");
        
        text9 = new JTextField();
        text9.setText("");
        text9.setColumns(10);
        
        JLabel LL10 = new JLabel("日期：");
        
        text10 = new JTextField();
        text10.setColumns(10);
        
        JLabel LL11 = new JLabel("地址：");
        
        text11 = new JTextField();
        text11.setText("");
        text11.setColumns(10);
        
        JLabel LL12 = new JLabel("备注：");
               text12.setColumns(10);
        
        JButton button2 = new JButton("修改");
        button2.setIcon(new ImageIcon(seachFram.class.getResource("/images/modify.png")));
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                recordUpdateActionPerformed(evt);
            }
        });
        
        JButton button3 = new JButton("删除");
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                recordDeleteActionPerformed(evt);
            }
        });
        button3.setIcon(new ImageIcon(seachFram.class.getResource("/images/delete.png")));
        GroupLayout gl_panel_1 = new GroupLayout(panel_1);
        gl_panel_1.setHorizontalGroup(
            gl_panel_1.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel_1.createSequentialGroup()
                    .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
                            .addGroup(gl_panel_1.createSequentialGroup()
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                    .addGroup(gl_panel_1.createSequentialGroup()
                                        .addComponent(LL1)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(text1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(gl_panel_1.createSequentialGroup()
                                        .addComponent(LL5)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(text5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(gl_panel_1.createSequentialGroup()
                                        .addComponent(LL9)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(text9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGap(42)
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
                                    .addGroup(gl_panel_1.createSequentialGroup()
                                        .addComponent(LL10)
                                        .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(text10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(gl_panel_1.createSequentialGroup()
                                        .addComponent(LL2)
                                        .addGap(18)
                                        .addComponent(text2, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(gl_panel_1.createSequentialGroup()
                                        .addComponent(LL6)
                                        .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(text6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGap(38)
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
                                    .addGroup(gl_panel_1.createSequentialGroup()
                                        .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                            .addGroup(gl_panel_1.createSequentialGroup()
                                                .addComponent(LL7)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(text7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(gl_panel_1.createSequentialGroup()
                                                .addComponent(LL3)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(rb1)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(rb2)))
                                        .addGap(36)
                                        .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                            .addGroup(gl_panel_1.createSequentialGroup()
                                                .addComponent(LL4)
                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                .addComponent(text4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(gl_panel_1.createSequentialGroup()
                                                .addComponent(LL8)
                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                .addComponent(text8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(gl_panel_1.createSequentialGroup()
                                        .addComponent(LL11)
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addComponent(text11))))
                            .addGroup(gl_panel_1.createSequentialGroup()
                                .addComponent(LL12)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(text12)))
                        .addGroup(gl_panel_1.createSequentialGroup()
                            .addComponent(button2)
                            .addGap(28)
                            .addComponent(button3)))
                    .addContainerGap(127, Short.MAX_VALUE))
        );
        gl_panel_1.setVerticalGroup(
            gl_panel_1.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel_1.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                        .addComponent(LL1)
                        .addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
                            .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                                .addComponent(LL2)
                                .addComponent(text2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(LL3)
                                .addComponent(rb1)
                                .addComponent(rb2)
                                .addComponent(LL4)
                                .addComponent(text4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addComponent(text1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGap(18)
                    .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                            .addComponent(LL5)
                            .addComponent(text5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                            .addComponent(LL6)
                            .addComponent(text6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(LL7)
                            .addComponent(text7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(LL8)
                            .addComponent(text8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
                        .addComponent(LL9)
                        .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                            .addComponent(text9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(LL10)
                            .addComponent(text10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(LL11)
                            .addComponent(text11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                        .addComponent(LL12)
                        .addComponent(text12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                    .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                        .addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
                            .addComponent(button2)
                            .addGap(25))
                        .addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
                            .addComponent(button3)
                            .addGap(23))))
        );
        panel_1.setLayout(gl_panel_1);
        
        JLabel L1 = new JLabel("账号：");
        
        s_id = new JTextField();
        s_id.setColumns(10);
        
        JLabel L2 = new JLabel("姓名：");
        
        s_name = new JTextField();
        s_name.setColumns(10);
        
        s_date = new JTextField();
        s_date.setColumns(10);
        
        JLabel L3 = new JLabel("日期：");
        
        JButton button1 = new JButton("查询");
        button1.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                recordsearchActionPerformed(e);
            }
        });
        button1.setIcon(new ImageIcon(seachFram.class.getResource("/images/search.png")));
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
            gl_panel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(L1)
                    .addGap(18)
                    .addComponent(s_id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(48)
                    .addComponent(L2)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(s_name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(55)
                    .addComponent(L3)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(s_date, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(79)
                    .addComponent(button1)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gl_panel.setVerticalGroup(
            gl_panel.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_panel.createSequentialGroup()
                    .addContainerGap(16, Short.MAX_VALUE)
                    .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
                        .addComponent(L1)
                        .addComponent(s_id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(L2)
                        .addComponent(s_name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button1)
                        .addComponent(L3)
                        .addComponent(s_date, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        );
        panel.setLayout(gl_panel);
        
        recordtable = new JTable();
        recordtable.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent met) {
                recordtableMousePressed(met);
            }
        });
        recordtable.setModel(new DefaultTableModel(
            new Object[][] {
            },
            new String[] {
                "\u8D26\u53F7", "\u59D3\u540D", "\u6027\u522B", "\u5B66\u9662", "\u7535\u8BDD", "\u662F\u5426\u6E56\u5317\u7C4D", "\u662F\u5426\u63A5\u89E6\u75AB\u533A", "\u662F\u5426\u611F\u67D3", "\u662F\u5426\u786E\u8BCA", "\u65E5\u671F", "\u5730\u5740", "\u5907\u6CE8"
            }
        ));
        scrollPane.setViewportView(recordtable);
        getContentPane().setLayout(groupLayout);
        
        this.fillTable(new Record());
    }
    /**
     * 删除事件处理
     * @param evt
     */
    private void recordDeleteActionPerformed(ActionEvent evt) {
        // TODO Auto-generated method stub
        String id=text1.getText();
        if(StringUtil.isEmpty(id)){
            JOptionPane.showMessageDialog(null, "请选择要删除的记录");
            return;
        }
        int n=JOptionPane.showConfirmDialog(null, "确定要删除该记录吗？");
        if(n==0){
            Connection con=null;
            try{
                con=jdbc.getCon();
                int deleteNum=RecordDao.delete(con, id);
                if(deleteNum==1){
                    JOptionPane.showMessageDialog(null, "删除成功");
                    this.resetValue();
                    this.fillTable(new Record());
                }else{
                    JOptionPane.showMessageDialog(null, "删除失败");
                }
            }catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "删除失败");
            }finally{
                try {
                    jdbc.closeCon(con);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 修改事件处理
     * @param evt
     */
    private void recordUpdateActionPerformed(ActionEvent evt) {
        // TODO Auto-generated method stub
        String id=this.text1.getText();
        if(StringUtil.isEmpty(id)){
            JOptionPane.showMessageDialog(null, "请选择要修改的记录");
            return;
        }
        

        String name=this.text2.getText();        
        String depart=this.text4.getText();
        String phone=this.text5.getText();
        String nati=this.text6.getText();
        String touch=this.text7.getText();
        String suspected=this.text8.getText();
        String infected=this.text9.getText();
        String date=this.text10.getText();
        String address=this.text11.getText();
        String remark=this.text12.getText();

        
        if(StringUtil.isEmpty(name)){
            JOptionPane.showMessageDialog(null, "名字不能为空！");
            return;
        }
        
        if(StringUtil.isEmpty(date)){
            JOptionPane.showMessageDialog(null, "日期不能为空！");
            return;
        }
        
        if(StringUtil.isEmpty(infected)){
            JOptionPane.showMessageDialog(null, "infected不能为空！");
            return;
        }
        
        String sex="";
        if(rb1.isSelected()){
            sex="男";
        }else if(rb2.isSelected()){
            sex="女";
        }
              
        Record record=new Record(id,  name, sex, depart, phone,  nati, touch,suspected,infected,date,address, remark);
        
        Connection con=null;
        try{
            con=jdbc.getCon();
            int addNum=RecordDao.update(con, record);
            if(addNum==1){
                JOptionPane.showMessageDialog(null, "记录修改成功！");
                resetValue();
                this.fillTable(new Record());
            }else{
                JOptionPane.showMessageDialog(null, "记录修改失败！");
            }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "记录修改失败！");
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
     * 重置表单
     */
    private void resetValue() {
        // TODO Auto-generated method stub
        this.text1.setText("");
        this.text2.setText("");
        
        this.text4.setText("");
        this.text5.setText("");
        this.text6.setText("");
        this.text7.setText("");
        this.text8.setText("");
        this.text9.setText("");
        this.text10.setText("");
        this.text11.setText("");
        this.text12.setText("");
    }

    /**
     * 表格行点击处理
     * @param met
     */
    protected void recordtableMousePressed(MouseEvent met) {
        // TODO Auto-generated method stub
        int row=this.recordtable.getSelectedRow();
        this.text1.setText((String)recordtable.getValueAt(row, 0));
        this.text2.setText((String)recordtable.getValueAt(row, 1));      
        String sex=(String)recordtable.getValueAt(row, 22);
        if("男".equals(sex)){
            this.rb1.setSelected(true);
        }else if("女".equals(sex)){
            this.rb2.setSelected(true);
        }
        this.text4.setText((String)recordtable.getValueAt(row, 3));
        this.text5.setText((String)recordtable.getValueAt(row, 4));
        this.text6.setText((String)recordtable.getValueAt(row, 5));
        this.text7.setText((String)recordtable.getValueAt(row, 6));
        this.text8.setText((String)recordtable.getValueAt(row, 7));
        this.text9.setText((String)recordtable.getValueAt(row, 8));
        this.text10.setText((String)recordtable.getValueAt(row, 9));
        this.text11.setText((String)recordtable.getValueAt(row, 10));
        this.text12.setText((String)recordtable.getValueAt(row, 11));

    }

    /**
     * 查询事件处理
     * @param e
     */
    private void recordsearchActionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String id=this.s_id.getText();
        String name=this.s_name.getText();
        String date=this.s_date.getText();
                
        Record record=new Record(id,name,date);
        this.fillTable(record);
        
    }

    /**
     * 初始化表格
     * @param bookType
     */
    @SuppressWarnings("unchecked")
    private void fillTable(Record record){
        DefaultTableModel dtm=(DefaultTableModel) recordtable.getModel();
        dtm.setRowCount(0); // 设置成0行
        Connection con=null;
        try{
            con=jdbc.getCon();
            ResultSet rs=RecordDao.list(con, record);
            while(rs.next()){
                @SuppressWarnings("rawtypes")
                Vector v=new Vector();
                v.add(rs.getString("id"));
                v.add(rs.getString("name"));
                v.add(rs.getString("sex"));
                v.add(rs.getString("depart"));
                v.add(rs.getString("address"));
                v.add(rs.getString("nati"));
                v.add(rs.getString("touch"));
                v.add(rs.getString("infected"));
                v.add(rs.getString("suspected"));
                v.add(rs.getString("address"));
                v.add(rs.getString("date"));
                v.add(rs.getString("remark"));
                dtm.addRow(v);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                jdbc.closeCon(con);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
