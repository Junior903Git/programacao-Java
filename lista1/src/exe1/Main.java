package exe1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Elevador obj1 = new Elevador();

        obj1.lotacao = 0;
        obj1.totAndar = 10;
        obj1.andarAtual = 0;
        obj1.capacidade = 10;

        obj1.exibe();
        obj1.entrar();
        obj1.subir();
        obj1.entrar();
        obj1.subir();
        obj1.descer();
        obj1.entrar();
        obj1.subir();
        obj1.descer();
        obj1.sair();
        obj1.subir();
        obj1.entrar();

        obj1.exibe();

        Elevador obj2 = new Elevador ();
        Scanner entrada = new Scanner (System.in);
        System.out.println("O predio possui Quantos Andares? ");
        obj2.totAndar = entrada.nextInt();
        System.out.println("Qual a Capacidade maxima do Elevador? ");
        obj2.capacidade = entrada.nextInt();
        obj2.entrar();
        obj2.subir();
        obj2.entrar();
        obj2.subir();
        obj2.descer();
        obj2.entrar();
        obj2.subir();
        obj2.descer();
        obj2.sair();
        obj2.subir();
        obj2.entrar();

        obj2.exibe();
    }




}

