package view;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class studetFrame extends JFrame {

    private JPanel contentPane;
    private JDesktopPane table4=null;
    private JDesktopPane table3;

    /**
     * Launch the application.
     */
 
    /**
     * Create the frame.
     */
    public studetFrame(String title) {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(studetFrame.class.getResource("/images/syudet1gif.gif")));
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 623, 486);
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        JMenuItem menuItem1 = new JMenuItem("填报信息");
        menuItem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addFrame addinterframe=new addFrame();
                addinterframe.setVisible(true);
                table3.add(addinterframe);
            }
        });
        menuItem1.setIcon(new ImageIcon(studetFrame.class.getResource("/images/add.png")));
        menuBar.add(menuItem1);
        
        JMenuItem menuItem2 = new JMenuItem("修改密码");
        menuItem2.setIcon(new ImageIcon(studetFrame.class.getResource("/images/password.png")));
        menuBar.add(menuItem2);
        
        JMenuItem menuItem4 = new JMenuItem("联系我们");
        menuItem4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                touchus  interframe4=new touchus();
                interframe4.setVisible(true); 
                table3.add(interframe4);
            }
        });
        menuItem4.setIcon(new ImageIcon(studetFrame.class.getResource("/images/me.png")));
        menuBar.add(menuItem4);
        
        JMenuItem menuItem3 = new JMenuItem("安全退出");
        menuItem3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int result=JOptionPane.showConfirmDialog(null, "是否退出系统?");//0,1,2:是、否、取消
                if(result==0){
                    dispose();
                }
            }
        });
        menuItem3.setIcon(new ImageIcon(studetFrame.class.getResource("/images/exit.png")));
        menuBar.add(menuItem3);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));
        
        table3 = new JDesktopPane();
        table3.setBackground(Color.LIGHT_GRAY);
        contentPane.add(table3, BorderLayout.CENTER);
        //设置JFrame最大化
//        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

   
}
