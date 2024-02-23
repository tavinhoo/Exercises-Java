import db.DB;
import db.DbException;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        // CÓDIGO DAS AULAS 268 269
//        /* Sempre que precisar de conexão com banco usar: DB.getConnection(); */
//        Connection conn = DB.getConnection();
//
//        DB.closeConnection();

        // ATÉ O BLOCO FINALLY = AULA 270
     /*
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
    */
//        try {
//            conn = DB.getConnection();
//            st = conn.createStatement();
//            rs = st.executeQuery("SELECT * FROM DEPARTMENT");
//
//            /* COMO PERCORRER OS DADOS DO RESULSET? */
//            /* rs.next() enquanto encontra = true, caso não encontre = false */
//
//            while(rs.next()) {
//                System.out.println(rs.getInt("ID") + ", " + rs.getString("NAME"));
//            }
//        } catch (SQLException e) {
//            throw new DbException(e.getMessage());
//        } finally {
//            DB.closeResultSet(rs);
//            DB.closeStatement(st);
//            DB.closeConnection();
//        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Connection conn = null;
        // ASSUNTO DA AULA
        PreparedStatement pst = null;

        try {
            conn = DB.getConnection();
            // O "?" é chamado de PLACEHOLDER
            // Permite que o valor seja inserido posteriormente

            // 1ª FORMA -> PreparedStatement and executeUpdate();
            /*
            pst = conn.prepareStatement(
                    "INSERT INTO seller "
                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId)" +
                            "VALUES" +
                            "(?, ?, ?, ?, ?);");
            pst.setString(1, "Carl Purple");
            pst.setString(2, "carlpurple@gmail.com");
            pst.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
            pst.setDouble(4, 3000.0);
            pst.setInt(5, 4);
            */
            // 2ª FORMA -> Statement.RETURN_GENERATED_KEYS; (RECUPERANDO ID INSERIDO)
            //           -> getGeneratedKeys();

//            pst = conn.prepareStatement(
//                    "INSERT INTO seller "
//                            + "(Name, Email, BirthDate, BaseSalary, DepartmentId)" +
//                            "VALUES" +
//                            "(?, ?, ?, ?, ?);",
//                    Statement.RETURN_GENERATED_KEYS);
//            pst.setString(1, "Carl Purple");
//            pst.setString(2, "carlpurple@gmail.com");
//            pst.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
//            pst.setDouble(4, 3000.0);
//            pst.setInt(5, 4);
            
            pst = conn.prepareStatement(
                    "INSERT INTO department (Name) values ('D1'),('D2')",
                    Statement.RETURN_GENERATED_KEYS);

            int rowAffecteds = pst.executeUpdate();

            if(rowAffecteds > 0) {
                ResultSet rs = pst.getGeneratedKeys();
                while(rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("Done! Id =" + id);
                }
            } else {
                System.out.println("No rows affected!!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        catch (ParseException e) {
//            e.printStackTrace();
//        }
        finally {
            DB.closeStatement(pst);
            DB.closeConnection();
        }
    }
}