import exe3.Lampada;

import java.util.Scanner;

    public class MainLampada {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Lampada obj0 = new Lampada();
            obj0.ligar();
            obj0.ajustar(70);
            obj0.mudarCor("amarela");
            obj0.exibe();
            obj0.desligar();
            obj0.exibe();
            obj0.ligar();
            obj0.ajustar(20);
            obj0.mudarCor("branca");
            obj0.exibe();
            obj0.ajustar(100);
            obj0.mudarCor("verde");
            obj0.exibe();


        Lampada obj1 = new Lampada();

            System.out.println("Ligar Lampada? [Sim] [Nao]");
            String resposta = entrada.next();

            obj1.ligada = resposta.equalsIgnoreCase("Sim");

        System.out.println("Qual Potencia? de 0 a 100");
        int brilho = entrada.nextInt();
        obj1.ajustar(brilho);

        System.out.println("Qual Cor deseja? ");
        String cor = entrada.next();
        obj1.mudarCor(cor);

        obj1.exibe();




        }
    }