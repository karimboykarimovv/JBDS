package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

            DB db = new DB();
        Student studentById = db.getStudentById(1);
        System.out.println(studentById);

       /* resultSet.next();
        //studentFirstName1
        //studentLastName1
        int studentId = resultSet.getInt(1);
        System.out.print(studentId+" ");
        String studentFirstName = resultSet.getString(2);
        String studentLastName = resultSet.getString(3);
        System.out.print(studentFirstName+" ");
        System.out.println(studentLastName);

        resultSet.next();
        //studentFirstName2
        //studentLastName2
        int studentId2 = resultSet.getInt(1);
        System.out.print(studentId2+" ");
        String studentFirstName2 = resultSet.getString(2);
        String studentLastName2 = resultSet.getString(3);
        System.out.print(studentFirstName2+" ");
        System.out.println(studentLastName2);*/

    }
}