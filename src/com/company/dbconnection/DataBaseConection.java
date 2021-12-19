package com.company.dbconnection;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataBaseConection {
    private String databaseDriver;
    private String databaseConnectionUrl;
    private String databaseUsername;
    private String databasePassword;

    private Connection connection;

    private DataBaseConection(){}
    private static DataBaseConection dataBaseConection=null;

     public Connection getConnection(){
         Properties properties =new Properties();
         try {
             properties.load(new FileReader("address file*"));
             databaseDriver=properties.getProperty("");
             databaseConnectionUrl=properties.getProperty("");
             databaseUsername=properties.getProperty("");
             databasePassword=properties.getProperty("");

         }
         catch (IOException e) {
             e.printStackTrace();
         }
         try {
             Class.forName(databaseDriver);
         }
         catch (ClassNotFoundException e){
             e.printStackTrace();
         }
         try {
             connection=DriverManager.getConnection(databaseConnectionUrl , databaseUsername , databasePassword);
         }
         catch (SQLException e ){
             e.printStackTrace();
         }

         return connection;
     }

     public static synchronized DataBaseConection getNewIstanse(){
         if (dataBaseConection==null){
             dataBaseConection=new DataBaseConection();
         }
         return dataBaseConection;
     }

}
