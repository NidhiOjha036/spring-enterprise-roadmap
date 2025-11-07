

import  java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "2801";
        //String sql = "select * from student where sid=1";
        String sql = "insert into student values (4,'John',48);";
        //String sql = "delete from student where sid = 5 ;";
        //String sql = "select * from student";

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Established connection");
        Statement st = con.createStatement();
        //ResultSet rs = st.executeQuery(sql); //Read Data
        boolean status = st.execute(sql);
        System.out.println(status);
//        rs.next();
//        String name = rs.getString("sname");
//        System.out.println("Name of a student "+name);
//        while (rs.next()){
//
//            System.out.print(rs.getInt(1)+" - ");
//            System.out.print(rs.getString(2)+" - ");
//            System.out.print(rs.getInt(3));
//            System.out.println();
//        }
        con.close();
        System.out.println("Connection closed");



    }
}
