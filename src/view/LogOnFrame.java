package view;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.AdminDao;
import dao.SecAdminDao;
import dao.StudentDao;
import dao.TeacherDao;

import model.Admin;
import model.SecAdmin;
import model.Student;
import model.Teacher;
import util.JDBC;
import util.StringUtil;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JPasswordField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class LogOnFrame extends JFrame {

    private JPanel contentPane;
    private JPasswordField passwordtext;
    private JTextField idtext;
    private final ButtonGroup buttonGroup = new ButtonGroup();
    public int type;
    Connection con = null;
    JDBC jdbc = new JDBC();
    static String id = null; 
    static String password = null; 
   
    public LogOnFrame() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(LogOnFrame.class.getResource("/images/about.png")));
        setResizable(false);
        setTitle("登录");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 622, 471);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        
        JLabel lblNewLabel = new JLabel("新冠疫情管理系统");
        lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 23));
        lblNewLabel.setIcon(new ImageIcon(LogOnFrame.class.getResource("/images/about.png")));
        
        JLabel L1 = new JLabel("账 号：");
        L1.setIcon(new ImageIcon(LogOnFrame.class.getResource("/images/userName.png")));
        
        JLabel L2 = new JLabel("密 码：");
        L2.setIcon(new ImageIcon(LogOnFrame.class.getResource("/images/password.png")));
        
        passwordtext = new JPasswordField();
        
        idtext = new JTextField();
        idtext.setColumns(10);
                
        
        JButton button1 = new JButton("登录");
        //登录监听
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loginActionPerformed(e);
            }
        });
        button1.setIcon(new ImageIcon(LogOnFrame.class.getResource("/images/login.png")));
        
        JButton button2 = new JButton("重置");
        //重置监听 
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetValueActionPerformed(e);
            }
        });
        button2.setIcon(new ImageIcon(LogOnFrame.class.getResource("/images/reset.png")));
        
        JRadioButton jbr1 = new JRadioButton("学生");
        jbr1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                studentActionPerformed(e);
               
            }
        });
        buttonGroup.add(jbr1);
        
        JRadioButton jbr2 = new JRadioButton("教师");
        jbr2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherActionPerformed(e);
            }
        });
        buttonGroup.add(jbr2);
        
        JRadioButton jbr3 = new JRadioButton("管理员");
        jbr3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adminrActionPerformed(e);
            }
        });
        buttonGroup.add(jbr3);
        
        JRadioButton jbr4 = new JRadioButton("二级部门");
        jbr4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                secadminrActionPerformed(e);
            }
        });
        buttonGroup.add(jbr4);
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
            gl_contentPane.createParallelGroup(Alignment.LEADING)
                .addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
                    .addGap(210)
                    .addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(176))
                .addGroup(gl_contentPane.createSequentialGroup()
                    .addGap(180)
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
                        .addGroup(gl_contentPane.createSequentialGroup()
                            .addComponent(L2)
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addComponent(passwordtext))
                        .addGroup(gl_contentPane.createSequentialGroup()
                            .addComponent(L1)
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addComponent(idtext, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(217, Short.MAX_VALUE))
                .addGroup(gl_contentPane.createSequentialGroup()
                    .addGap(166)
                    .addComponent(jbr1)
                    .addGap(18)
                    .addComponent(jbr2)
                    .addGap(18)
                    .addComponent(jbr3)
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addComponent(jbr4)
                    .addContainerGap(67, Short.MAX_VALUE))
                .addGroup(gl_contentPane.createSequentialGroup()
                    .addGap(180)
                    .addComponent(button1)
                    .addGap(49)
                    .addComponent(button2)
                    .addContainerGap(131, Short.MAX_VALUE))
        );
        gl_contentPane.setVerticalGroup(
            gl_contentPane.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_contentPane.createSequentialGroup()
                    .addGap(65)
                    .addComponent(lblNewLabel)
                    .addGap(44)
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                        .addComponent(L1)
                        .addComponent(idtext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(25)
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
                        .addComponent(L2)
                        .addComponent(passwordtext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(45)
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                        .addComponent(jbr1)
                        .addComponent(jbr3)
                        .addComponent(jbr4)
                        .addComponent(jbr2))
                    .addGap(27)
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                        .addComponent(button1)
                        .addComponent(button2))
                    .addContainerGap(72, Short.MAX_VALUE))
        );
        contentPane.setLayout(gl_contentPane);
        //设置居中显示
        this.setLocationRelativeTo(null);
    }
    
    //登录事件处理
    protected void loginActionPerformed(ActionEvent e) {
        String idfiled=this.idtext.getText();
        String passwordfiled=new String(this.passwordtext.getPassword());
        
        if(StringUtil.isEmpty(idfiled)) {
            JOptionPane.showMessageDialog(null, "账号不能为空");
            return;
        }
        if(StringUtil.isEmpty(passwordfiled)) {
            JOptionPane.showMessageDialog(null, "密码不能为空");
            return;
        }
        Student student = new Student();
        student.setId(idfiled);            
        student.setPassword(passwordfiled);
        //学生登录
        if(type==1) {
            try {
            con = jdbc.getCon();                
            Student currentstudent = StudentDao.studentlogin(con,student);                   
            if(currentstudent != null ) {
                JOptionPane.showMessageDialog(null, "学生登录成功");                  
                id = currentstudent.getId();
                password = currentstudent.getPassword();                
                dispose();
                
                new studetFrame("学生登录界面");
                
            } else {
                JOptionPane.showMessageDialog(null, "用户名或密码错误！");
            }
            }catch(Exception evt){
                evt.printStackTrace();
            }
            
            }
        //老师登录
        TeacherDao teacherdao = new TeacherDao();
        Teacher teacherMessage = new Teacher();
        teacherMessage.setId(idfiled);    
        teacherMessage.setPassword(passwordfiled);
        
            if(type==2) {
                try {
                    con = jdbc.getCon();                
                    Teacher currentteacher = teacherdao.teacherlogin(con,teacherMessage);                   
                    if(currentteacher != null ) {
                        JOptionPane.showMessageDialog(null, "教师登录成功");       
                        id = currentteacher.getId();
                        password = currentteacher.getPassword();
                        dispose();
                       new studetFrame("教师疫情填报");
                    } else {
                        JOptionPane.showMessageDialog(null, "用户名或密码错误！");
                    }
                    }catch(Exception evt) {
                        evt.printStackTrace();
                    }
            }
            //管理员登录
            AdminDao admindao = new AdminDao();
            Admin adminMessage = new Admin();
            adminMessage.setId(idfiled);            
            adminMessage.setPassword(passwordfiled);
            if(type==3) {
                try {
                    con = jdbc.getCon();                
                    Admin currentUser = admindao.adminlogin(con,adminMessage);                  
                    if(currentUser != null ) {
                        JOptionPane.showMessageDialog(null, "管理员登录成功");        
                        id = currentUser.getId();
                        password = currentUser.getPassword();
                        dispose();
                      adminFrame adminframe = new adminFrame();
                      adminframe.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "用户名或密码错误！");
                    }
                    }catch(Exception evt) {
                        evt.printStackTrace();
                    }
            }
            //二级部门登录
            SecAdminDao secadmindao = new SecAdminDao();
            SecAdmin secadminMessage = new SecAdmin();
            secadminMessage.setId(idfiled);          
            secadminMessage.setPassword(passwordfiled);
            if(type==4) {
                try {
                    con = jdbc.getCon();                
                    SecAdmin currentsecadmin = secadmindao.secadminlogin(con,secadminMessage);                  
                    if(currentsecadmin != null ) {
                        JOptionPane.showMessageDialog(null, "二级部门登录成功");
                        id = currentsecadmin.getId();
                        password = currentsecadmin.getPassword();
                        dispose();
                        new secadminFrame();
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "用户名或密码错误！");
                    }
                    }catch(Exception evt) {
                        evt.printStackTrace();
                    }
            }
        
    }

    
    
    protected void secadminrActionPerformed(ActionEvent e) {
        this.type=4;
//        return type;
    }

    protected void adminrActionPerformed(ActionEvent e) {
        this.type=3;
//        return type;
    }

    protected void teacherActionPerformed(ActionEvent e) {
        this.type=2;
//        return type;
        
    }

    protected void studentActionPerformed(ActionEvent e) {
        this.type=1;
//        return type;
        
    }

    /**
     * 重置处理事件;
     * @param e
     */
    protected void resetValueActionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        this.idtext.setText("");
        this.passwordtext.setText("");
        
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        EventQueue.invokeLater(new Runnable() {
          public void run() {
              try {
                  LogOnFrame frame = new LogOnFrame();
                  frame.setVisible(true);
              } catch (Exception e) {
                  e.printStackTrace();
              }
          }
      });

    }
}
