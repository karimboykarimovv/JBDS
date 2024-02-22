package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DB {
    public Student getStudentById(int studentId) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "karimboy0306"
        );

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from student where id="+studentId);
        List<Student> students = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String firstName = resultSet.getString(2);
            String lastName = resultSet.getString(3);
            Student student = new Student(id, firstName, lastName);
            students.add(student);
        }
        return students.get(0);
    }
}
