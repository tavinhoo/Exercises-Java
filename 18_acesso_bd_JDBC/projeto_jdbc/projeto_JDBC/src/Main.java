import db.DB;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {


        /* Sempre que precisar de conexão com banco usar: DB.getConnection(); */
        Connection conn = DB.getConnection();


        DB.closeConnection();
    }
}