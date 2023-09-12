package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pessoas.Socio;


public class SocioDAOImpl implements SocioDAO {
    
    private static final String URL = "jdbc:mysql://localhost:3306/socio";
    private static final String USUARIO = "teste";
    private static final String SENHA = "123456";
    
    @Override
    public boolean inserirSocio(Socio socio) {
        try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO socio (endereco, email, nome, data_nascimento) VALUES (?, ?, ?, ?)")) {
            preparedStatement.setString(1, socio.getEndereco());
            preparedStatement.setString(2, socio.getEmail());
            preparedStatement.setString(3, socio.getNome());
            preparedStatement.setDate(4, new java.sql.Date(socio.getDataNascimento().getTime()));
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean atualizarSocio(Socio socio) {
        // Implemente a lógica de atualização aqui
    }

    @Override
    public boolean excluirSocio(int id) {
        // Implemente a lógica de exclusão aqui
    }

    @Override
    public Socio buscarSocio(int id) {
        // Implemente a lógica de busca aqui
    }

    @Override
    public List<Socio> listarTodos() {
        // Implemente a lógica de listagem aqui
    }
}
