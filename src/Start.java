import java.sql.*;

public class Start {

    public static void main(String[] args) {
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "A!");

            Statement statement = connection.createStatement();


                statement.executeUpdate("create table students(" +
                        "student_id int (10) primary key auto_increment not null," +
                        "last_name varchar(30)," +
                        "first_name varchar(30))");


            System.out.println("The table has been created");


            statement.executeUpdate("insert into students(last_name,first_name) values ('Setaro','Marco')");
            statement.executeUpdate("insert into students(last_name,first_name) values ('Cioffo','Michele')");
            statement.executeUpdate("insert into students(last_name,first_name) values ('Pollina','Alessio')");
            statement.executeUpdate("insert into students(last_name,first_name) values ('Coman','Maria')");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}