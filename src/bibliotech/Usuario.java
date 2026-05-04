package bibliotech;

public class Usuario {
    // Atributos definidos no requisito RF02
    public String nome;
    public String cpf;
    public String contato;

    // Construtor para facilitar a criação do objeto
    public Usuario(String nome, String cpf, String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.contato = contato;
    }
}