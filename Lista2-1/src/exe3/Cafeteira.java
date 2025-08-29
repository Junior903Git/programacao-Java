package exe3;


public class Cafeteira {
    /// /A classe deve ter os seguintes atributos privados:
    ///
    ///     agua (int): quantidade de água disponível em ml (0 até 2000 ml).
    ///
    ///     poCafe (int): quantidade de pó de café em gramas (0 até 100 g).
    ///
    ///     ligada (boolean): indica se a cafeteira está ligada ou desligada.

    private int agua, pocafe;
    private boolean ligada;


    /// Crie dois construtores:
    ///
    /// Construtor vazio: inicia a cafeteira desligada, com 0 ml de água e 0 g de pó de café.
    ///
    /// Construtor com parâmetros: recebe valores iniciais de água, pó e estado (ligada/desligada).


    public Cafeteira() {
        this.setAgua(0);
        this.setPocafe(0);
        this.setLigada(false);
    }

    public Cafeteira(int agua, int pocafe, boolean ligada) {
        this.setAgua(agua);
        this.setPocafe(pocafe);
        this.setLigada(ligada);
    }

    public void setAgua(int agua) {
            this.agua = agua;
    }

    public void setPocafe(int pocafe) {
        this.setPocafe(pocafe);}


    public void setLigada(boolean ligada) {
            this.ligada = ligada;
    }


    public int getAgua() {
        return this.agua;
    }
    public int getPocafe(){
        return this.pocafe;
    }
    public boolean getLigada(){
        return this.ligada;
    }

/// ligar() e desligar().
///
/// adicionarAgua(int ml): aumenta a quantidade de água, respeitando o limite máximo.
///
/// adicionarCafe(int gramas): aumenta a quantidade de pó de café, respeitando o limite máximo.
///
/// prepararCafe(): só pode ser executado se a cafeteira estiver ligada, tiver pelo menos 100
/// ml de água e 10 g de pó. Ao preparar um café, deve reduzir a água em 100 ml e o pó em 10 g.
/// Caso não haja recursos suficientes, exibir uma mensagem de erro.
///

    public void reporAgua(int valor){
        if ((this.agua + valor) >= 0 && (this.agua + valor) <= 2000)
            this.setAgua(valor);
        else System.out.println("Quantidade de agua nao pode estar abaixo ou exceder o limite");
}

    public void reporCafe(int valor){
            if ((this.pocafe + valor) >= 0 && (this.pocafe + valor) <= 100) {
                this.pocafe += valor;
            } else System.out.println("Quantidade de Pó de Café nao pode estar abaixo nem exceder o limite");
        }

    public void ligar(){
        if(!this.ligada) this.setLigada(true);
        else System.out.println("Ja esta ligada!");
    }
    public void desligar(){
        if (this.ligada) this.setLigada(false);
        else System.out.println("Ja esta Desligada");
    }
    public void preparar(){
        if (getLigada()){
            if (getAgua() >= 100)
            {
                {
                    if (getPocafe() >= 10) {
                        this.setAgua(-100);
                        this.setPocafe(-10);
                        System.out.println("Café Preparado!!");

                    }
                }
            } else System.out.println("Falta Agua");
        }
        else System.out.println(" Cafeteira Desligada!");

        }
    public void exibe(){
        String msg;
        if (getLigada()){
            msg = "Ligada";
        }else msg = "desligada";

        System.out.println("A Cafeteira no momento esta " + msg + " E possui "+getAgua()+" Ml de agua e "+getPocafe()+" de pó de café. O numero de Cafe disponiveis é "+ cafeDisponivel());
    }
    public int cafeDisponivel(){
            int cafes = 0;
            int agua = this.getAgua();
            int po = this.getPocafe();

            for (cafes = 0; agua >= 100 && po >= 10; ) {
                cafes++;
                agua -= 100;
                po -= 10;
            }
            return cafes;
            }





    }

