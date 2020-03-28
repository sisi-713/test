package view;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class adminFrame extends JInternalFrame {
       
    private JPanel contentPane;
    private JDesktopPane table=null;
     
    public adminFrame() {
        setIconifiable(true);
        setMaximizable(true);
        setClosable(true);
        setFrameIcon(new ImageIcon(adminFrame.class.getResource("/images/secadmin.gif")));
        setResizable(true);
        setTitle("学院管理界面");
        setBounds(100, 100, 585, 451);
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        getContentPane().setLayout(new BorderLayout(0, 0));
        
        JMenu menu1 = new JMenu("浏览信息");
        menu1.setIcon(new ImageIcon(adminFrame.class.getResource("/images/about.png")));
        menu1.setBackground(Color.LIGHT_GRAY);
        menuBar.add(menu1);
        
        JMenuItem menu11 = new JMenuItem("教师信息");
        menu11.setIcon(new ImageIcon(adminFrame.class.getResource("/images/about.png")));
        menu1.add(menu11);
        
        JMenuItem menu12 = new JMenuItem("学生信息");
        menu1.add(menu12);
        
        JMenu menu2 = new JMenu("查询信息");
        menu2.setIcon(new ImageIcon(adminFrame.class.getResource("/images/search.png")));
        menuBar.add(menu2);
        
        JMenu menu21 = new JMenu("查询教师信息");
        menu2.add(menu21);
        
        JMenuItem menu211 = new JMenuItem("按账号查询");
        menu21.add(menu211);
        
        JMenuItem menu212 = new JMenuItem("按名字查询");
        menu21.add(menu212);
        
        JMenuItem menu213 = new JMenuItem("按日期查询");
        menu21.add(menu213);
        
        JMenuItem menu214 = new JMenuItem("按姓名查询某天情况");
        menu21.add(menu214);
        
        JMenu menu22 = new JMenu("查询学生信息");
        menu22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                seachFram recordinterframe=new seachFram();
                recordinterframe.setVisible(true);
                table.add(recordinterframe);
            }
        });
        menu2.add(menu22);
        
        JMenuItem menu221 = new JMenuItem("按账号查询");
        menu22.add(menu221);
        
        JMenuItem menu222 = new JMenuItem("按姓名查询");
        menu22.add(menu222);
        
        JMenuItem menu223 = new JMenuItem("按日期查询");
        menu22.add(menu223);
        
        JMenuItem menu224 = new JMenuItem("按姓名查询某天情况");
        menu22.add(menu224);
        
        JMenu menu3 = new JMenu("信息维护");
        menu3.setIcon(new ImageIcon(adminFrame.class.getResource("/images/edit.png")));
        menuBar.add(menu3);
        
        JMenuItem menu31 = new JMenuItem("增加记录");
        menu31.setIcon(new ImageIcon(adminFrame.class.getResource("/images/add.png")));
        menu3.add(menu31);
        
        JMenuItem menu32 = new JMenuItem("删除记录");
        menu32.setIcon(new ImageIcon(adminFrame.class.getResource("/images/delete.png")));
        menu3.add(menu32);
        
        JMenuItem menu33 = new JMenuItem("更新记录");
        menu33.setIcon(new ImageIcon(adminFrame.class.getResource("/images/modify.png")));
        menu3.add(menu33);
        
        JMenu menu4 = new JMenu("关于系统");
        menu4.setIcon(new ImageIcon(adminFrame.class.getResource("/images/base.png")));
        menuBar.add(menu4);
        
        JMenuItem menu41 = new JMenuItem("系统说明");
        menu4.add(menu41);
        
        JMenuItem menu42 = new JMenuItem("联系我们");
        menu4.add(menu42);
        
        JMenuItem menu5 = new JMenuItem("退出");
        menu5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int result=JOptionPane.showConfirmDialog(null, "是否退出系统");
                if(result==0){
                    dispose();
                }
            }
        });
        menu5.setIcon(new ImageIcon(adminFrame.class.getResource("/images/exit.png")));
        menuBar.add(menu5);
        this.setVisible(true);
    }
}
