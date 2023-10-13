package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        this.listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> removerItems = new ArrayList<>();
        for (Item item : listaItens){
            if (item.getNome().equalsIgnoreCase(nome)){
                removerItems.add(item);
            }
        }
        listaItens.removeAll(removerItems);
    }
    public double calcularValorTotal(){
        double total = 0;
        for (Item it : listaItens ) {
            total += it.getPreco() * it.getQuantidade();
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(listaItens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.exibirItens();
        carrinho.adicionarItem("mouse", 70,2);
        carrinho.adicionarItem("teclado", 160,1);
        System.out.println(carrinho.calcularValorTotal());
        carrinho.exibirItens();
        carrinho.removerItem("TECLADO");
        System.out.println(carrinho.calcularValorTotal());
        carrinho.exibirItens();


    }
}
