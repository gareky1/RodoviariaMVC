package rodoviaria.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import rodoviaria.model.Assento;

public class AssentoDao {

    public void cadastraAssento(Assento assento) throws ExceptionDao {

        String sql = "insert into assento (onibus) value (?)";
        PreparedStatement pStatement = null;
        Connection connection = null;

        try {
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, assento.getLugar());
            pStatement.execute();
        } catch (SQLException e) {
            throw new ExceptionDao("Erro ao resevar assento: " + e);
        } finally {
            try {
                if (pStatement != null) {
                    pStatement.close();
                }
            } catch (SQLException e) {
                throw new ExceptionDao("Erro ao fechar o Statement: " + e);
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new ExceptionDao("Erro ao fechar a conexão:" + e);
            }

        }
    }
}
