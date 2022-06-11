package livro.oo;

public class CadastroDeLivros {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Torrone almeida");
        autor.setEmail("torren@email.com");
        autor.setCpf("123.456.789.10");


        Livro livro = new Livro();
        livro.setNome("java");
        livro.setDescricao("aprendendo java em 10 anos");
        livro.adicionaValor (230.90);
        livro.setIsbn("999-442-452422-42-1");

        livro.setAutor(autor);
        livro.mostrarDetalhes();


        Autor outroAutor = new Autor();
        outroAutor.setNome("Guarana oliveira");
        outroAutor.setEmail("oliveira@email.com");
        outroAutor.setCpf("432.126.789.10");

        Livro outroLivro = new Livro();
        outroLivro.setNome("Como ser silencioso na mata");
        outroLivro.setDescricao("Aprenda técnicas sul américanas de progressão");
        outroLivro.adicionaValor (98.50);
        outroLivro.setIsbn( "999-22-22242-22-9");

        outroLivro.setAutor(outroAutor);

        outroLivro.mostrarDetalhes();


    }

}
