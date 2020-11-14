package rodoviaria.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import rodoviaria.model.Onibus2;

public class OnibusDao2 {

    public void cadastrarOnibus(Onibus2 onibus) throws ExceptionDao2 {
        String sql = "insert into onibus (rota) value (?)";
        PreparedStatement pStatement = null;
        Connection connection = null;

        try {
            connection = new ConnectionMVC2().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, onibus.getRota());
            pStatement.execute();
        } catch (SQLException e) {
            throw new ExceptionDao2("Erro ao cadastra Onibus: " + e);
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
                throw new ExceptionDao2("Erro ao fechar a conexão: " + e);
            }
        }
    }
}
