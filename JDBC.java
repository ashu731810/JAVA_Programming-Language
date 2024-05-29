package com.thirteen.day;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

    public static void main(String[] args) throws ClassNotFoundException, SQLException  {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection
                ("jdbc:oracle:thin:@localhost:1521:xe","ASH","ASH");

        System.out.println("connection Created Successfully");
        Statement statement= con.createStatement();
        statement.addBatch("create table emp(eid number,ename varchar2(30),esalary number)");
        statement.addBatch("insert into emp values(111,'Ashish',10000)");
        statement.addBatch("insert into emp values(222,'Anish',15000)");
        statement.addBatch("insert into emp values(333,'Ruman',25000)");

        statement.addBatch("update emp set esalary=esalary+500 where esalary>10000");

        //statement.addBatch("drop table emp");

        int[] results = statement.executeBatch();
        for (int result:results) {
            System.out.println(result);

        }
        statement.close();
        con.close();
        System.out.println("Resourse are released successfully.........");

    }

}

