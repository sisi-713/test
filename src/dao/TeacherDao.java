package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Student;
import model.Teacher;

/**
 * 老师Dao类
 * @author 32740
 *
 */
public class TeacherDao {
    public Teacher teacherlogin(Connection con, Teacher teacher) throws Exception {
        PreparedStatement ps = null;
       Teacher resultTeacher = null;
        String sql = "select * from teacher where id = ? and password = ?";
        ps = con.prepareStatement(sql);
        ps.setString(1,teacher.getId());
        ps.setString(2,teacher.getPassword());
        ResultSet rs = ps.executeQuery();
        if(rs.next()) {
            resultTeacher = new Teacher();
            resultTeacher.setId(rs.getString("id"));
            resultTeacher.setName(rs.getString("name"));
            resultTeacher.setPassword(rs.getString("password"));            
        }   
        return  resultTeacher;
        
    }

}
