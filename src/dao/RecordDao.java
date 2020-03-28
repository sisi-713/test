package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Record;
import util.StringUtil;

/**
 * 记录Dao类
 * @author 32740
 *
 */
public class RecordDao {
        
        //疫情信息添加
        public static  int recordadd(Connection con, Record record) throws Exception {
            
            //添加前 检查这个ID当天是否已经存在，若存在，返回0
            String sqlid = "select * from record where id = ? and date = ?";        
            PreparedStatement pstmtid = (PreparedStatement) con.prepareStatement(sqlid);    
            pstmtid.setString(1, record.getId());
            pstmtid.setString(2, record.getDate());
            ResultSet rs = pstmtid.executeQuery();
     
            if(rs.next()) {
                return 0;
            }
            
            String sql = "insert into record values(?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(sql);
            
            pstmt.setString(1, record.getId());     
            pstmt.setString(2, record.getName());       
            pstmt.setString(3, record.getSex());        
            pstmt.setString(4, record.getDepart());         
            pstmt.setString(5, record.getPhone());
            pstmt.setString(6, record.getAddress());
            pstmt.setString(7, record.getNati());
            pstmt.setString(8, record.getTouch());
            pstmt.setString(9, record.getSuspected());
            pstmt.setString(10, record.getInfected());
            pstmt.setString(11, record.getDate());
            pstmt.setString(12, record.getRemark());
			return 0;
                       

        }
        
        //信息查询
        public static ResultSet list(Connection con, Record recordMessage) throws Exception {
            
            //将student表和record表连接
            //StringBuffer sb = new StringBuffer("select * from student,record where student.Id=record.Id");
            StringBuffer sb = new StringBuffer("select * from record r where Id = id ");
            
            //向sb中添加，并按Id进行模糊查询
            if(StringUtil.isNotEmpty(recordMessage.getId())) { 
                sb.append(" and r.id like '%" +recordMessage.getId() + "%'");
            }
            
            //按姓名模糊查询
            if(StringUtil.isNotEmpty(recordMessage.getName())) { 
                sb.append(" and r.name like '%" + recordMessage.getName() + "%'");
            }
            
            //按学院模糊查询
            if(StringUtil.isNotEmpty(recordMessage.getDepart())) {
                sb.append(" and re.depart like '%" + recordMessage.getDepart() + "%'");
            }
            
            //按日期模糊查询
            if(StringUtil.isNotEmpty(recordMessage.getDate())) {
                sb.append(" and r.date like '%" + recordMessage.getDate() + "%'");
            }
            
            PreparedStatement pstmt=(PreparedStatement) con.prepareStatement(sb.toString().replaceFirst("and", "wheres"));
            return pstmt.executeQuery();
        }
        
        //检查这个Id当天是否存在,若存在，返回0，否则返回1
        public ResultSet recordCheck(Connection con, String id,String date) throws Exception{
            
            //插入信息前 检查Id当天信息是否已经存在，若存在，返回0
            String sqlid = "select * from record where Id = ? and date = ?";        
            PreparedStatement pstmtid = (PreparedStatement) con.prepareStatement(sqlid);    
            pstmtid.setString(1, id);
            pstmtid.setString(2, date);
            ResultSet rs = pstmtid.executeQuery();
            return rs;
        }
        /**
         * 按日期查询和学院查询
         * @param con
         * @param recordMessage
         * @return
         * @throws Exception
         */
      
        
        /**
         * 信息删除
         * @param con
         * @param id
         * @return
         * @throws Exception
         */
        public static int delete(Connection con,String id)throws Exception{
            String sql="delete from record where id=?";
            PreparedStatement pstmt=con.prepareStatement(sql);
            pstmt.setString(1, id);
            return pstmt.executeUpdate();
        }
        /**
         * 疫情信息修改
         * @param con
         * @param book
         * @return
         * @throws Exception
         */
        public static int update(Connection con,Record record)throws Exception{
            String sql="update record set id=?,name=?,sex=?,depart=?,phone=?,nati=?,touch=?,infected=?,suspected=?,date=?,address=?,remark=? where id=?";
            PreparedStatement pstmt=con.prepareStatement(sql);
            pstmt.setString(1,record.getId());
            pstmt.setString(2, record.getName());
            pstmt.setString(3, record.getSex());
            pstmt.setString(4, record.getDepart());
            pstmt.setString(5, record.getPhone());
            pstmt.setString(6, record.getNati());
            pstmt.setString(7, record.getTouch());
            pstmt.setString(8, record.getSuspected());
            pstmt.setString(9, record.getInfected());
            pstmt.setString(10, record.getAddress());
            pstmt.setString(11, record.getDate());
            pstmt.setString(12, record.getRemark());
            
            return pstmt.executeUpdate();
        }

}
