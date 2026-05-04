package bibliotech;

public class Emprestimo {
    public Livro livro;
    public Usuario usuario;
    public String dataSaida;

    // Protótipo da funcionalidade de registro (RF03)
    public void registrarEmprestimo(Livro l, Usuario u, String data) {
        this.livro = l;
        this.usuario = u;
        this.dataSaida = data;
        
        System.out.println("------ REGISTRO DE EMPRÉSTIMO ------");
        System.out.println("Livro: " + livro.titulo);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Leitor: " + usuario.nome);
        System.out.println("Data de Saída: " + dataSaida);
        System.out.println("------------------------------------");
        System.out.println("Status: Empréstimo realizado com sucesso.");
    }
}