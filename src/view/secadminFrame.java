package view;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import model.Record;

import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class secadminFrame extends JInternalFrame {

    /**
     * Launch the application.
     */
   
    /**
     * Create the frame.
     */
    public secadminFrame() {
        setMaximizable(true);
        setIconifiable(true);
        setClosable(true);
        setFrameIcon(new ImageIcon(secadminFrame.class.getResource("/images/secadmin.gif")));
        setTitle("学校管理界面");
        setBounds(100, 100, 803, 497);
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGap(0, 787, Short.MAX_VALUE)
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGap(0, 456, Short.MAX_VALUE)
        );
        getContentPane().setLayout(groupLayout);
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        JMenu mnNewMenu = new JMenu("浏览信息");
        menuBar.add(mnNewMenu);
        
        JMenuItem mntmNewMenuItem = new JMenuItem("学生疫情信息");
        mntmNewMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                readrecordActionPerformed(e);
            }
        });
        mnNewMenu.add(mntmNewMenuItem);
        
        JMenu mnNewMenu_1 = new JMenu("查询信息");
        menuBar.add(mnNewMenu_1);
        
        JMenu mnNewMenu_2 = new JMenu("信息统计");
        menuBar.add(mnNewMenu_2);
        
        JMenu mnNewMenu_3 = new JMenu("填报情况统计");
        mnNewMenu_2.add(mnNewMenu_3);
        
        JMenuItem mntmNewMenuItem_2 = new JMenuItem("已填报学生统计");
        mnNewMenu_3.add(mntmNewMenuItem_2);
        
        JMenuItem mntmNewMenuItem_3 = new JMenuItem("未填报学生统计");
        mnNewMenu_3.add(mntmNewMenuItem_3);
        
        JMenu mnNewMenu_4 = new JMenu("疫情数据统计");
        mnNewMenu_2.add(mnNewMenu_4);
        
        JMenuItem mntmNewMenuItem_4 = new JMenuItem("每月新增确诊例统计");
        mnNewMenu_4.add(mntmNewMenuItem_4);
        
        JMenu mnNewMenu_5 = new JMenu("导出数据");
        menuBar.add(mnNewMenu_5);
        
        JMenu mnNewMenu_6 = new JMenu("信息填报统计结果");
        mnNewMenu_5.add(mnNewMenu_6);
        
        JMenuItem mntmNewMenuItem_6 = new JMenuItem("未填报学生");
        mnNewMenu_6.add(mntmNewMenuItem_6);
        
        JMenu mnNewMenu_7 = new JMenu("疫情数据统计结果");
        mnNewMenu_5.add(mnNewMenu_7);
        
        JMenuItem mntmNewMenuItem_5 = new JMenuItem("New menu item");
        mnNewMenu_7.add(mntmNewMenuItem_5);
        
        JMenu mnNewMenu_8 = new JMenu("我的");
        menuBar.add(mnNewMenu_8);
        
        JMenuItem mntmNewMenuItem_7 = new JMenuItem("密码修改");
        mnNewMenu_8.add(mntmNewMenuItem_7);
        
        JMenuItem mntmNewMenuItem_8 = new JMenuItem("退出");
        mnNewMenu_8.add(mntmNewMenuItem_8);

    }

    protected void readrecordActionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

}
