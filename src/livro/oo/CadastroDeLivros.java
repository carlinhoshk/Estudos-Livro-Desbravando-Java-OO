package livro.oo;

public class CadastroDeLivros {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.nome = "Torrone almeida";
        autor.email = "torren@email.com";
        autor.cpf = "123.456.789.10";


        Livro livro = new Livro();
        livro.nome = "java";
        livro.descricao = "aprendendo java em 10 anos";
        livro.valor = 230.90;
        livro.isbn = "999-442-452422-42-1";

        livro.autor = autor;

        livro.mostrarDetalhes();

        Autor outroAutor = new Autor();
        outroAutor.nome = "Guarana oliveira";
        outroAutor.email = "oliveira@email.com";
        outroAutor.cpf = "432.126.789.10";

        Livro outroLivro = new Livro();
        outroLivro.nome = "Como ser silencioso na mata";
        outroLivro.descricao = "Aprenda técnicas sul américanas de progressão";
        outroLivro.valor = 98.50;
        outroLivro.isbn = "999-22-22242-22-9";

        outroLivro.autor = outroAutor;

        outroLivro.mostrarDetalhes();


    }

}
