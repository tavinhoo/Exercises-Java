package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

    private static Connection conn = null;
    private static String url = "db.properties";

    /* Método que vai fazer conexão com o banco de dados */
    public static Connection getConnection() {
       try {
           if(conn == null) {
               Properties props = loadProperties();
               String url = props.getProperty("dburl");
               /* Classe que vai fazer conexão com o banco de dados */
               conn = DriverManager.getConnection(url, props);
           }
           return conn;
       } catch (SQLException e) {
           throw new DbException(e.getMessage());
       }
    }

    /* Método que vai fechar conexão com banco de dados */
   public static void closeConnection() {
      try {
          if(conn != null) {
              conn.close();
          }
      } catch (SQLException e) {
          throw new DbException(e.getMessage());
      }
    }

    /* Método que vai ler o db.properties e armazenar os dados num objeto do tipo Properties */
    /* props.load(fs) */
   private static Properties loadProperties() {
       try(FileInputStream fs = new FileInputStream(url)) {
            Properties props = new Properties();
            props.load(fs);
            return props;
       } catch(IOException e) {
            throw new DbException(e.getMessage());
       }
    }
}
