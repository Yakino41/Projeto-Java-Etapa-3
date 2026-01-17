package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import connection.ConnectionBanco;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class UsuarioDAO {

    public boolean checkLogin(String login, String senha) {

        Connection con = ConnectionBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;

        try {
            stmt = con.prepareStatement("SELECT * FROM Usuario WHERE login = ? AND senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            
            rs = stmt.executeQuery();

            if (rs.next()) {
                check = true;
            }
            else{
                JOptionPane.showMessageDialog(
                        null,
                        "Usuario Ou Senha Incorretas!",
                        "Erro Ao Tentar Login.",
                        ERROR_MESSAGE
                );  
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionBanco.closeConnection(con, stmt, rs);
        }
        return check;
    }
}
