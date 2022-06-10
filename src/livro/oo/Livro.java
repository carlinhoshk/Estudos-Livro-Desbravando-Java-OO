package livro.oo;

public class Livro {

    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    void mostrarDetalhes(){
        String menssagem = "Mostrando detalhes do livro ";
        String risquinho = "----------------------------";

        System.out.println(menssagem);
        System.out.println(risquinho);
        System.out.println("Nome: " + nome );
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        autor.mostrarDetalhes();

        if (this.temAutor()){
            autor.mostrarDetalhes();
        }

        System.out.println(risquinho);
    }
    public void aplicaDescontoDe(double porcentagem){
        this.valor -= this.valor * porcentagem;
    }

    boolean temAutor(){
        return this.autor != null;
    }



}




