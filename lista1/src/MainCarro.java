
import exe0.Carro;

import java.util.Scanner;

        public class MainCarro {
            public static void main(String[] args) {

                // criar um objeto da classe Carro
                Carro obj1= new Carro();
                obj1.marca="Fiat";
                obj1.modelo="Argo";
                obj1.ano=2023;
                obj1.motor = true;
                obj1.velocidade = 30;


                obj1.exibe();

                //Cria um outro objeto da classe Carro(instância)
                Carro obj2= new Carro();
                //criar um objeto para ntrada de dados
                Scanner entrada= new Scanner(System.in);
                System.out.println("digite a marca do carro: ");
                obj2.marca = entrada.nextLine();
                System.out.println("digite a modelo do carro: ");
                obj2.modelo=entrada.nextLine();
                System.out.println("digite a ano do carro: ");
                obj2.ano= entrada.nextInt();
                System.out.println("digite a motor do carro: ");
                obj2.motor = entrada.nextBoolean();
                System.out.println("digite a velocidade do carro: ");
                obj2.velocidade= entrada.nextInt();


                obj2.exibe();


            }
        }