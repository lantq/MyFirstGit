/**
 * Created by Administrator on 2018/5/8.
 */
import java.sql.*;

public class Test
{
     public static void main(String[] args)
        {
            //�������ݿ������ڴ�
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e)
            {
                e.printStackTrace();
            }

            //2.��ȡ���ݿ�����
            Connection conn=null;
            PreparedStatement ps = null;
            try
            {
                conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/neuedu", "root", "root");
                System.out.println(conn);
                //3.����preparedststement
                ps=conn.prepareStatement("insert into sorder values(null,?,?,?,?,?,?,?,?)");
                //4.�滻?�ţ�ִ��sql���
                ps.setInt(1,1);
                ps.setString(2,"openidididididididididididid");
                ps.setDouble(3,1000.01);
                ps.setString(4,null);
                ps.setDouble(5,1000.01);
                ps.setString(6,"A");
                //java.sql.date()ֻ�������� java.util.date() ��ʱ����
                //ʱ��ԭ�㣺1970��1��1�� 0��0��0��
                Timestamp now=new Timestamp(System.currentTimeMillis());
                ps.setTimestamp(7,now);

                ps.setInt(8,1);
                //ִ��sql���
                ps.executeUpdate();
                //5.�ر�����

            } catch (SQLException e)
            {
                e.printStackTrace();
            }
            finally
            {
                try
                {
                    ps.close();
                    conn.close();
                } catch (SQLException e)
                {
                    e.printStackTrace();
                }

            }


        }
}
















