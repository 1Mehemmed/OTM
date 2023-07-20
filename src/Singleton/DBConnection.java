package Singleton;

import java.sql.SQLOutput;

public class DBConnection {
    private static DBConnection dbConnection;
    private static String queryHistory = "Query History: /n";
    public static DBConnection getDbConnection(){
        if (dbConnection == null) dbConnection = new DBConnection();
        return dbConnection;
    }
    private DBConnection(){

    }
    public void addQuey(String query) {
        queryHistory += query + "/n";
    }
    public void showQueries(){
        System.out.println(queryHistory);
    }
}
