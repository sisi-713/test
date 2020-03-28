package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Student;

/**
 * StudentDao类
 * @author 32740
 *
 */
public class StudentDao {
    /**
     * 学生登录验证
     * @param con
     * @param student
     * @return
     * @throws Exception
     */
    public static Student studentlogin(Connection con, Student student) throws Exception {
        PreparedStatement ps = null;
        Student resultStudent = null;
        String sql = "select * from student where id = ? and password = ?";
        ps = con.prepareStatement(sql);
        ps.setString(1,student.getId());
        ps.setString(2,student.getPassword());
        ResultSet rs = ps.executeQuery();
        if(rs.next()) {
            resultStudent = new Student();
            resultStudent.setId(rs.getString("id"));
            resultStudent.setName(rs.getString("name"));
            resultStudent.setPassword(rs.getString("password"));            
        }   
        return  resultStudent;
        
    }

}
