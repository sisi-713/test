package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Admin;

/**
 * 管理员Dao类
 * @author 32740
 *
 */
public class AdminDao {
    public Admin adminlogin(Connection con, Admin admin) throws Exception {
        PreparedStatement ps = null;
        Admin resultadmin = null;
        String sql = "select * from `admin` where id = ? and password =? ";
        ps = con.prepareStatement(sql);
        ps.setString(1,admin.getId());
        ps.setString(2,admin.getPassword());
        ResultSet rs = ps.executeQuery();
        if(rs.next()) {
            resultadmin = new Admin();
            resultadmin.setId(rs.getString("id"));
            resultadmin.setName(rs.getString("name"));
            resultadmin.setPassword(rs.getString("password"));            
        }   
        return  resultadmin;
        
    }

}
