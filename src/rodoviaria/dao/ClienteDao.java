package rodoviaria.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import rodoviaria.model.Cliente;

public class ClienteDao {

    public void cadastrarCliente(Cliente cliente) throws ExceptionDao {

        String sql = "insert into cliente (cpf,nome,telefone,idade) value (?,?,?,?)";
        PreparedStatement pStatement = null;
        Connection connection = null;

        try {
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, cliente.getCpf());
            pStatement.setString(2, cliente.getNome());
            pStatement.setString(3, cliente.getTelefone());
            pStatement.setInt(4, cliente.getIdade());
            pStatement.execute();

        } catch (SQLException e) {
            throw new ExceptionDao("Erro ao cadastrar cliente: " + e);
        } finally {

        }
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
            throw new ExceptionDao("Erro ao fechar a conexão: " + e);
        }
    }

}
