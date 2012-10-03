package DataBase;

import java.net.URL;

/**
 *
 * @author Ripflame
 */
public class DataBaseManager {
    private String user;
    private String password;
    private URL dataBaseURL;
    private static DataBaseManager singletonInstance = null;
    
    private void DataBaseManager() {
        //Exist only to defeat instantiation
    }
    
    public static DataBaseManager getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new DataBaseManager();
        }
        
        return singletonInstance;
    }
    
    public void connectDataBase() {
        
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
    public void setUser(String user) {
        this.user = user;
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
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the dataBaseURL
     */
    public URL getDataBaseURL() {
        return dataBaseURL;
    }

    /**
     * @param dataBaseURL the dataBaseURL to set
     */
    public void setDataBaseURL(URL dataBaseURL) {
        this.dataBaseURL = dataBaseURL;
    }
    
}
