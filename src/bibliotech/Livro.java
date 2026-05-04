package bibliotech;

public class Livro {
    // Atributos definidos no requisito RF01
    public String titulo;
    public String autor;
    public String editora;

    // Construtor para facilitar a criação do objeto
    public Livro(String titulo, String autor, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
    }
}