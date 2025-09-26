package exe4;

import java.util.List;
import java.util.ArrayList;

public class LibraryUser{
    private int id;
    private String name;
    private List <LoanItem> itens;

    public LibraryUser() {
        this.itens = new ArrayList<LoanItem>();
    }

    public LibraryUser(int id, String name) {
        this.id = id;
        this.name = name;
        this.itens = new ArrayList<LoanItem>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<LoanItem> getItens() {
        return itens;
    }

    public void setItens(List<LoanItem> itens) {
        this.itens = itens;
    }

    public void addLoanItem(int id, int days, Book book) {
        // composição
        this.itens.add(new LoanItem(id, days, book));
        System.out.println("Item adicionado com sucesso");
    }
    public void removeLoanItem(int id) {
        // percorrer o vetor
        for(LoanItem item: this.itens) {
            if(item.getId() == id) {
                this.itens.remove(item);
                System.out.println("Item removido com sucesso");
                return;
            }
        }
        System.out.println("Item não encontrado para remoção");
    }

    public void clearLoans(){
        this.itens.clear();
    }

    public boolean isEmpty(){
        return this.itens.isEmpty();
    }

    public void totalDaysBorrowed(){
        int soma = 0;
        for(LoanItem item: this.itens) {
            soma += item.getDays();
        }
        System.out.println("Total de dias emprestados: " + soma);
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", itens=" + itens +
                '}';
    }
}