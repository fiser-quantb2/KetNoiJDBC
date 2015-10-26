/**
 * Ket noi co so du lieu dung JDBC
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Tran Ba Quan
 * @version 1.0 25 Oct 2015
 *
 */

public class MySQLConnUltis {
 	// Ket noi vao MySQL.
   public static Connection getMySQLConnection() throws SQLException,
           ClassNotFoundException {
      //Thiet lap ten host , ten database , user va password de vao host
      String hostName = "localhost";
      String dbName = "userlover";
      String userName = "root";
      String password = "1234";
      return getMySQLConnection(hostName, dbName, userName, password);
   }
   public static Connection getMySQLConnection(String hostName, String dbName,
          String userName, String password) throws SQLException,
          ClassNotFoundException {
      // Khai bao class Driver cho MYSQL DB
      Class.forName("com.mysql.jdbc.Driver");
      //Cau truc URL Connection danh cho MYSQL
      String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
      Connection conn = DriverManager.getConnection(connectionURL, userName, password);
      return conn;
  	}
   //
   // Kiem tra ket noi
   //
   public static void main(String[] args) throws SQLException,
           ClassNotFoundException {
       System.out.println("Get connection ... ");
       // Lay ra doi tuong Connection ket noi vao database
       Connection conn = ConnectionUtils.getMyConnection();
       System.out.println("Get connection " + conn);
       System.out.println("Done!");
   }
 