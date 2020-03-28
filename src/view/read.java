package view;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import dao.RecordDao;
import model.Record;
import util.JDBC;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class read extends JInternalFrame {
    private JTable readtable;
    private JTextField datetext;
    private JDBC jdbc=new JDBC();
    private JComboBox comboBox;
    /**
     * Launch the application.
     */
    /**
     * Create the frame.
     */
    public read() {
        setTitle("浏览记录");
        setMaximizable(true);
        setIconifiable(true);
        setClosable(true);
        setBounds(100, 100, 763, 528);
        
        JScrollPane scrollPane = new JScrollPane();
        
        JPanel panel = new JPanel();
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addComponent(panel, GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                        .addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE))
                    .addContainerGap())
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                    .addGap(71)
                    .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(166, Short.MAX_VALUE))
        );
        
        JLabel lblNewLabel = new JLabel("学院：");
        
        JLabel lblNewLabel_1 = new JLabel("日期：");
        
        datetext = new JTextField();
        datetext.setColumns(10);
        
        JButton read = new JButton("浏览");
        read.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                readrecordActionPerformed(e);
            }
        });
        
       comboBox = new JComboBox();
       comboBox.setModel(new DefaultComboBoxModel(new String[] {"计算机学院", "历史学院", "数统院", "外国语学院"}));
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
            gl_panel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblNewLabel_1)
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addComponent(datetext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(46)
                    .addComponent(lblNewLabel)
                    .addGap(18)
                    .addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                    .addComponent(read)
                    .addGap(36))
        );
        gl_panel.setVerticalGroup(
            gl_panel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel.createSequentialGroup()
                    .addContainerGap(17, Short.MAX_VALUE)
                    .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblNewLabel_1)
                        .addComponent(datetext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNewLabel)
                        .addComponent(read)
                        .addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
        );
        panel.setLayout(gl_panel);
        
        readtable = new JTable();
        scrollPane.setViewportView(readtable);
        readtable.setModel(new DefaultTableModel(
            new Object[][] {
            },
            new String[] {
                "\u8D26\u53F7", "\u59D3\u540D", "\u6027\u522B", "\u6E56\u5317\u7C4D", "\u5B66\u9662", "\u7535\u8BDD", "\u63A5\u89E6\u75AB\u533A", "\u7591\u4F3C", "\u786E\u8BCA", "\u5730\u5740", "\u65E5\u671F", "\u5907\u6CE8"
            }
        ) {
            boolean[] columnEditables = new boolean[] {
                false, true, true, true, true, true, true, true, true, true, false, true
            };
            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        });
        getContentPane().setLayout(groupLayout);
        this.fillRead("read");

    }
    protected void readrecordActionPerformed(ActionEvent evt) {
        // TODO Auto-generated method stub
    }

    /**
     * 初始化下拉列表
     * @param type
     */
    private void fillRead(String type){
        Connection con=null;
        Record record=null;
        try{
            con=jdbc.getCon();
            ResultSet rs=RecordDao.list(con, new Record());
//            if("read".equals(type)){
//                record=new Record();
//                record.setDate(rs.getString("date"));
//                record.setDepart("请选择...");
////                record.set(-1);JComboBox comboBox
//                this.comboBox.addItem(record);
//            }
            while(rs.next()){
                record=new Record();
//                record.setId(rs.getString("id"));
                record.setDate(rs.getString("date"));
                
                if("read".equals(type)){
                    this.comboBox.addItem(record);
                }
                else if("modify".equals(type)){
                    this.comboBox.addItem(record);
                }
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
