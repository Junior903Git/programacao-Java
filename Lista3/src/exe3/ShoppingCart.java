package exe3;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int id;
    // vetor de itens de carrinho
    private List<Caritem> itens;
    private double valorTotal;

    public ShoppingCart(){
        //aloca espaco na memoria para o vetor
        this.itens = new ArrayList<Caritem>();
        this.valorTotal = 0;
    }

    public ShoppingCart(int id){
        this.id = id;
        this.itens = new ArrayList<Caritem>();
        this.valorTotal = 0 ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Caritem> getItens() {
        return itens;
    }
    public void addCarItem(int id,int quantity, Product product){
        //o metodo add adiciona um item na lista(array lista)
        this.itens.add(new Caritem(id, quantity,product));
        calculateValorTotal();
        System.out.println("CarItem adicionado com sucesso.");
    }
    public void calculateValorTotal(){
        double soma = 0;
        for (Caritem item : this.itens){//para cada item do vetor
            soma += item.getQuantity() * item.getProduct().getValor();
            this.valorTotal = soma;
        }
    }
    public void removeCarItem(int id){
        boolean removeu = false;
        for (Caritem item : itens){
            if (item.getId() == id){
                this.itens.remove(item);
                removeu = true;
                System.out.println("CarItem removido com sucesso");
            }
        }
        if (!removeu){
            System.out.println("CarItem nao encontrado");
        }
        this.calculateValorTotal();
    }


    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", itens=" + itens +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
