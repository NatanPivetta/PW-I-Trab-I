package dao;
import java.util.List;
import pessoas.Socio;

public interface SocioDAO {
    
    // Método para inserir um novo sócio no banco de dados
    boolean inserirSocio(Socio socio);
    
    // Método para atualizar os detalhes de um sócio no banco de dados
    boolean atualizarSocio(Socio socio);
    
    // Método para excluir um sócio do banco de dados
    boolean excluirSocio(int id);
    
    // Método para buscar um sócio pelo ID
    Socio buscarSocio(int id);
    
    // Método para listar todos os sócios no banco de dados
    List<Socio> listarTodos();
}
