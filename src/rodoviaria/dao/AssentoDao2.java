package rodoviaria.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import rodoviaria.model.Assento2;

public class AssentoDao2 {

    public void cadastraAssento(Assento2 assento) throws ExceptionDao2 {

        String sql = "insert into assento (onibus) value (?)";
        PreparedStatement pStatement = null;
        Connection connection = null;

        try {
            connection = new ConnectionMVC2().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, assento.getLugar());
            pStatement.execute();
        } catch (SQLException e) {
            throw new ExceptionDao2("Erro ao resevar assento: " + e);
        } finally {
            try {
                if (pStatement != null) {
                    pStatement.close();
                }
            } catch (SQLException e) {
                throw new ExceptionDao2("Erro ao fechar o Statement: " + e);
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new ExceptionDao2("Erro ao fechar a conexão:" + e);
            }

        }
    }
}
