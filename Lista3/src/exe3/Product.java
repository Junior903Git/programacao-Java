package exe3;

public class Product {
    private int id;
    private String name;
    private double valor;

    public Product() {
    }

    public Product(int id, String name, double valor) {
        this.id = id;
        this.name = name;
        this.valor = valor;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "\nProduct{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", valor=" + valor +
                '}';
    }
}

