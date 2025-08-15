package exe1;

public class Elevador {
    public int andarAtual, totAndar, capacidade, lotacao;


    public void exibe() {
        System.out.println("O Elevador se enconta no andar " + this.andarAtual + " esta com " + this.lotacao + " pessoas e" +
                " a capacidade é de " + this.capacidade);

    }

    public void subir() {
        if (andarAtual < totAndar) andarAtual++;

        else {
            System.out.println(" Voce esta no ultimo andar. Nao pode mais subir ");
        }
    }
    public void descer(){
        if (andarAtual > 0  )
            andarAtual--;
        else{
            System.out.println("Voce ja esta no terreo, nao é póssivel descer mais.");
        }
    }
    public void entrar(){
        if (lotacao < capacidade) lotacao ++;

        else {
            System.out.println("Elevador Cheio.");
        }
    }
    public void sair(){
        if (lotacao > 0)
            lotacao--;
        else{
            System.out.println("Nao ha ninguem no elevador");
        }
    }

}