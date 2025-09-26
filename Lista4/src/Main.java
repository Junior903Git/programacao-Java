import exe0.Assistente;
import exe0.Diretor;
import exe0.Funcionario;
import exe0.Gerente;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void exibeNaCaixa(Funcionario funcionario) {
        // objeto funcionário é polimórfico
        // se a função for chamada e for passado um assistente, funcionario executa
        // toString() do Assistente
        // se a função for chamada e for passado um gerente, funcionario executa
        // toString() do Gerente
        // se a função for chamada e for passado um diretor, funcionario executa
        // toString() do Diretor
        JOptionPane.showMessageDialog(null, funcionario.toString());
    }
    public static void main(String[] args) {

        Funcionario objFunc; // objeto da superclasse
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();

        // como assistente é um funcionário, objFunc pode receber um assistente
        objFunc = new Assistente("Mateus", "Rua Alagoas, Franca", "123-4", 3000, 12);
        funcionarios.add(objFunc); // adiciona um assistente no vetor
        // objFunc é um objeto polimórfico
        System.out.println(objFunc.toString());
        exibeNaCaixa(objFunc); // estamos passando como parâmetro um Assistente
        // como gerente é um funcionário, objFunc pode receber um gerente
        objFunc = new Gerente("Ana", "Rua das Acacias, Franca", "234-5", 5000, 2000);
        funcionarios.add(objFunc); // adiciona um gerente no vetor
        // objFunc é um objeto polimórfico
        System.out.println(objFunc.toString());
        exibeNaCaixa(objFunc); // estamos passando como parâmetro um Gerente
        // como diretor é um funcionário, objFunc pode receber um diretor
        objFunc = new Diretor("Julia", "Franca", "456", 7000, 3000);
        funcionarios.add(objFunc); // adiciona um diretor no vetor
        // objFunc é um objeto polimórfico
        System.out.println(objFunc.toString());
        exibeNaCaixa(objFunc); // estamos passando como parâmetro um Diretor

        // calcula a folha de pagamento
        float total = 0;
        // objeto funcionario, da classe Funcionario, vai percorrer o vetor
        for (Funcionario funcionario : funcionarios) { // para cada funcionário
            //objeto funcionario é polimórfico
            total = total + funcionario.calculaSalario();
        }
        System.out.println(total);
    }
}