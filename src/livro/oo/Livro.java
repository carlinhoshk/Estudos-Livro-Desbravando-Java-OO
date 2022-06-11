package livro.oo;

public class Livro {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

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
    public boolean aplicaDescontoDe(double porcentagem){
        if (porcentagem > 0.3){
            return false;
        }
        this.valor -= this.valor * porcentagem;
        return true;
    }

    boolean temAutor(){
        return this.autor != null;
    }

    void adicionaValor(double valor){
        this.valor = valor;
    }

    double retornaValor(){
        return this.valor;
    }
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}




