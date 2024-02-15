import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        // CÓDIGO DAS AULAS 268 269
//        /* Sempre que precisar de conexão com banco usar: DB.getConnection(); */
//        Connection conn = DB.getConnection();
//
//        DB.closeConnection();
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = DB.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM DEPARTMENT");

            /* COMO PERCORRER OS DADOS DO RESULSET? */
            /* rs.next() enquanto encontra = true, caso não encontre = false */

            while(rs.next()) {
                System.out.println(rs.getInt("ID") + ", " + rs.getString("NAME"));
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}