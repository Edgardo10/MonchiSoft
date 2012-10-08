package DataBase;

import EntityTypes.*;
import java.sql.*;

/**
 *
 * @author Ripflame
 */
public class DataBaseManager {
    private static Connection m_connection;
    private static DataBaseManager m_singletonInstance;
    
    protected void DataBaseManager() {
        //Here just to prevent instantiation
    }
    
    public static DataBaseManager getInstance() {
        if (m_singletonInstance == null) {
            m_singletonInstance = new DataBaseManager();
        }
        
        return m_singletonInstance;
    }
    
    private static Connection connectDataBase() {
        try {
            String mySQLDriver = "org.gjt.mm.mysql.Driver";
            Class.forName(mySQLDriver); //Load the driver
            
            String hostURL = "jdbc:mysql://localhost/monchisDataBase";
            String userName = "root";
            String password = "selendis";
            m_connection = DriverManager.getConnection(hostURL, userName, password);
            
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFound: " + e.getMessage());
        }
        
        return m_connection;
    }
    
    public boolean addEntity(Object theEntity, EntityType theType) {
        m_connection = connectDataBase();
        
        switch (theType) {
            case sale:
                //Query the database
                break;
            case client:
                //Query the database
                break;
            case promotion:
                //Query the database
                break;
            case expense:
                //Query the database
                break;
            case product:
                //Query the database
                break;
            default:
                System.out.println("Unspecified type");
                break;
        }
        
        try {
            m_connection.close();
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
        
        return false; //Will return true if the object is added correctly, false otherwise
    }
    
    public boolean modifyEntity(Object theEntity, EntityType theType) {
        m_connection = connectDataBase();
        
        switch (theType) {
            case sale:
                //Query the database
                break;
            case client:
                //Query the database
                break;
            case promotion:
                //Query the database
                break;
            case expense:
                //Query the database
                break;
            case product:
                //Query the database
                break;
            default:
                System.out.println("Unspecified type");
                break;
        }
        
        try {
            m_connection.close();
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
        
        return false; //Will return true if the object is added correctly, false otherwise
    }
    
    public boolean removeEntity(Object theEntity, EntityType theType) {
        m_connection = connectDataBase();
        
        switch (theType) {
            case sale:
                //Query the database
                break;
            case client:
                //Query the database
                break;
            case promotion:
                //Query the database
                break;
            case expense:
                //Query the database
                break;
            case product:
                //Query the database
                break;
            default:
                System.out.println("Unspecified type");
                break;
        }
        
        try {
            m_connection.close();
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
        
        return false; //Will return true if the object is added correctly, false otherwise
    }
    
    public Object[] queryDataBase(String theQuery) {
        m_connection = connectDataBase();
        
        Object[] objects = new Object[500];
        //Query the dataBase
        
        try {
            m_connection.close();
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
        
        return objects;
    }    
}
