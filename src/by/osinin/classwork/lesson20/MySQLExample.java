package by.osinin.classwork.lesson20;

import java.sql.*;

public class MySQLExample {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db", "root", "root")) {
            connection.setAutoCommit(false);
            connection.prepareStatement("insert into DEVELOPERS (NAME, WORK_POSITION, AGE) values ('Anton', 'PM', 35), ('Nick', 'BA', 30);")
                    .execute(); //добавить двух человек/ .execute() - тру или фолс

            PreparedStatement ps = connection.prepareStatement("select * from DEVELOPERS where ID = ?");
            ps.setInt(1, 1);
            ResultSet rs = ps.executeQuery();

            //connection.commit();
            //connection.rollback();//откатит назад

            while (rs.next()) {
                System.out.println(rs.getInt("ID") + " " + rs.getString("NAME") + " " + rs.getInt("AGE"));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
