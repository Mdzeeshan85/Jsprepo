package com.doctorapp.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DoctorDB {
    static Connection connection;
    public static Connection openConnection(){
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    	}catch(ClassNotFoundException e) {
    		e.printStackTrace();
    	}
        String url="jdbc:mysql://localhost:3306/voyatraining1";
        String username="root";
        String password="root";
        try{
            connection= DriverManager.getConnection(url,username,password);
            System.out.println("connected to db");
        }catch(Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
