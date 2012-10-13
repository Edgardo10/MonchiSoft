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
    
    private void DataBaseManager() {
        //Here just to prevent instantiation
        m_connection = null;
    }
    
    public static DataBaseManager getInstance() {
        if (m_singletonInstance == null) {
            m_singletonInstance = new DataBaseManager();
        }
        
        return m_singletonInstance;
    }
    
    private void connectDataBase() {
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
    }
    
    public boolean addEntity(Object theEntity, EntityType theType) {
        connectDataBase();
        
        switch (theType) {
            case SALE:
                //Query the database
                break;
            case CLIENT:
                //Query the database
                break;
            case PROMOTION:
                //Query the database
                break;
            case EXPENSE:
                //Query the database
                break;
            case PRODUCT:
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
        connectDataBase();
        
        switch (theType) {
            case SALE:
                //Query the database
                break;
            case CLIENT:
                //Query the database
                break;
            case PROMOTION:
                //Query the database
                break;
            case EXPENSE:
                //Query the database
                break;
            case PRODUCT:
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
        connectDataBase();
        
        switch (theType) {
            case SALE:
                //Query the database
                break;
            case CLIENT:
                //Query the database
                break;
            case PROMOTION:
                //Query the database
                break;
            case EXPENSE:
                //Query the database
                break;
            case PRODUCT:
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
        connectDataBase();
        
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
