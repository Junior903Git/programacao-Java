package exe1;

public class Carro extends Veiculo {
    private int portas;
    public Carro(){
        super(); // chama o construtor da superclasse
    }
    public Carro(String placa, String modelo, double valorBase, int portas) {
        // chama o construtor da superclasse
        super(placa, modelo, valorBase);
        this.portas = portas;
    }
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "portas=" + portas +
                super.toString() +
                '}';
    }
    @Override
    public double calcularImposto(){
        return this.valorBase * 0.03;
    }
}