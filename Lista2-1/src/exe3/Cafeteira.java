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
        if ((this.agua + agua) >= 0 && (this.agua + agua) <= 2000) {
            this.agua += agua;
        } else System.out.println("Quantidade de agua nao pode estar abaixo ou exceder o limite");
    }

    public void setPocafe(int pocafe) {
        if ((this.pocafe + pocafe) >= 0 && (this.pocafe + pocafe) <= 100) {
            this.pocafe += pocafe;
        } else System.out.println("Quantidade de Pó de Café nao pode estar abaixo nem exceder o limite");
    }

    public void setLigada(boolean ligada) {
            this.ligada = ligada;
            System.out.println("Ligada");
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
         this.setAgua(valor);
        }
    public void reporCafe(int valor){
        this.setPocafe(valor);
    }
    public void ligar(){
        this.setLigada(true);
    }
    public void desligar(){
        this.setLigada(false);
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

                    } else System.out.println("Falta Pó de Café ");
                }
            } else System.out.println("Falta Agua");
        }
        else System.out.println(" Cafeteira Desligada!");

        }
        public int cafeDisponivel(int qntd){
            for qntd in range:{
                (this.getPocafe() / 10)
            }
        }




    }

