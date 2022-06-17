package br.com.carlinhoshk.livraria.teste;

import br.com.carlinhoshk.livraria.produtos.Livro;
import br.com.carlinhoshk.livraria.produtos.Produto;
import br.com.carlinhoshk.livraria.produtos.Revista;

public class CarrinhoDeCompras {

    public class CarrinhoDeCompras {

        private double total;
        private List<Produto> produtos;

        public CarrinhoDeCompras() {
            this.produtos = new ArrayList<Produto>();
        }

        public void adiciona(Produto produto) {
            this.produtos.add(produto);
        }

        public void remove(int posicao) {
            this.produtos.remove(posicao);
        }

        public double getTotal() {
            return total;
        }

        public List<Produto> getProdutos() {
            return produtos;
        }
    }
}
