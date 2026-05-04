package bibliotech;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LivroDAO {
    
    public void cadastrarLivro(String titulo, String autor, String editora) {
        String sql = "INSERT INTO livro (titulo, autor, editora) VALUES (?, ?, ?)";
        
        try (Connection conn = new Conexao().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, titulo);
            stmt.setString(2, autor);
            stmt.setString(3, editora);
            
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Erro ao salvar livro: " + e.getMessage());
        }
    }
}