import exe1.Caminhao;
import exe1.Carro;
import exe1.Veiculo;
import exe1.Moto;

import java.util.ArrayList;
import java.util.List;

public class MainVeiculo {
    public static void exibir(Veiculo veiculo) {
        // veiculo é objeto polimórfico
        System.out.println(veiculo.toString()); // polimorfismo
    }
    public static void main(String[] args) {
        // 1500
        Carro car1 = new Carro("ABC1", "Onix", 50000, 4);
        // 300
        Moto mot1 = new Moto("DEF2", "CG Titan", 15000, 300);
        // 7800
        Caminhao cam1 = new Caminhao("FGH3", "Mercedez", 120000, 6);
        exibir(car1);
        exibir(mot1);
        exibir(cam1);

        List<Veiculo> veiculos = new ArrayList<Veiculo>();
        veiculos.add(car1);
        veiculos.add(mot1);
        veiculos.add(cam1);

        double total = 0;
        for(Veiculo veiculo : veiculos) {
            total += veiculo.calcularImposto();
        }

        System.out.println("Total de impostos " + Math.round(total));
    }
}