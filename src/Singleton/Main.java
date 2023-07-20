package Singleton;

import Singleton.DBConnection;

public class Main {
    public static void main(String[] args){
        var DBConnection = Singleton.DBConnection.getDbConnection();
        DBConnection.addQuery("First Query");
        DBConnection.addQuery("Second Query");
        DBConnection.showQueries();
        var a = Singleton.DBConnection.getDbConnection();
        System.out.println(a);
        System.out.println(DBConnection);
        var b = DBConnection.getDbconnection();
        System.out.println(b);
    }
}
