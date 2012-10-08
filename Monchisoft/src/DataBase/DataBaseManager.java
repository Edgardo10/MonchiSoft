package DataBase;

import java.sql.*;
import EntityTypes.*;

/**
 *
 * @author Ripflame
 */
public class DataBaseManager {
    private static String user = "root";
    private static String password = "selendis";
    private static String host = "jdbc:mysql://localhost/monchisDataBase";
    private static String MySQLDriver = "org.gjt.mm.mysql.Driver";
    private static Connection connection;
    private static DataBaseManager singletonInstance;
    
    protected void DataBaseManager() {
        //Here just to prevent instantiation
    }
    
    public static DataBaseManager getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new DataBaseManager();
        }
        
        return singletonInstance;
    }
    
    public Connection connectDataBase() {
        try {
            Class.forName(MySQLDriver); //Load the driver
            connection = DriverManager.getConnection(host, user, password);
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFound: " + e.getMessage());
        }
        
        return connection;
    }
    
    public boolean addEntity(Object theEntity, EntityType theType) {        
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
        
        return false; //Will return true if the object is added correctly, false otherwise
    }
    
    public boolean modifyEntity(Object theEntity, EntityType theType) {
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
        
        return false; //Will return true if the object is added correctly, false otherwise
    }
    
    public boolean removeEntity(Object theEntity, EntityType theType) {
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
        
        return false; //Will return true if the object is added correctly, false otherwise
    }
    
    public Object[] queryDataBase(String theQuery) {
        Object[] objects = new Object[500];
        //Query the dataBase
        return objects;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String theUser) {
        user = theUser;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String thePassword) {
        password = thePassword;
    }

    /**
     * @return the dataBaseURL
     */
    public String getDataBaseURL() {
        return host;
    }

    /**
     * @param dataBaseURL the dataBaseURL to set
     */
    public void setDataBaseURL(String theHost) {
        host = theHost;
    }
    
}
