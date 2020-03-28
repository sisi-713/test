package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.SecAdmin;
import model.Student;

/**
 * 二级部门Dao类
 * @author 32740
 *
 */
public class SecAdminDao {
    public SecAdmin secadminlogin(Connection con,SecAdmin secadmin) throws Exception {
        PreparedStatement ps = null;
        SecAdmin resultSecAdmin = null;
        String sql = "select * from secadmin where id = ? and password = ?";
        ps = con.prepareStatement(sql);
        ps.setString(1,secadmin.getId());
        ps.setString(2,secadmin.getPassword());
        ResultSet rs = ps.executeQuery();
        if(rs.next()) {
            resultSecAdmin = new SecAdmin();
            resultSecAdmin.setId(rs.getString("id"));
            resultSecAdmin.setName(rs.getString("name"));
            resultSecAdmin.setPassword(rs.getString("password"));            
        }   
        return  resultSecAdmin;
        
    }

}
