package exe3;

public class Lampada {


    public boolean ligada;
    public int brilho;
    public String cor, amarela;


    //construtor
    public Lampada() {
        this.ligada = true;
        this.brilho = 0;
        this.cor = "";
    }

    public Lampada(boolean ligada, int brilho, String cor) {
        this.ligada = ligada;
        this.brilho = 100;
        this.cor = "branca";

    }


    public void exibe() {
        if (ligada) {
            System.out.println("A lâmpada está: Ligada  Brilho: " + brilho + "% | Cor: " + cor);
        } else {
            System.out.println("A lâmpada está: Desligada  Brilho: " + brilho + "% | Cor: " + cor);
        }
    }


    public void ligar() {
        if (!ligada) {
            ligada = true;
            System.out.println("A lampada ligou!");
        } else {
            System.out.println("A lampada ja esta ligada!");
        }
    }
        public void desligar () {
            if (ligada) {
                ligada = false;
                brilho = 0;
                System.out.println("A lampada foi desligada!");

            } else {
                System.out.println("A lampada ja esta desligada!");
            }

        }

        public void ajustar ( int valor){
            if (ligada) {
                if (valor >= 0 && valor <= 100) {
                    this.brilho = valor;
                    System.out.println("Brilho ajustado para: " + this.brilho + "%");
                } else {
                    System.out.println("Valor inválido! Digite entre 0 e 100.");
                }
            } else {
                System.out.println("A lampada está desligada!");
            }
        }

        public void mudarCor (String novacor){
            if (ligada) {
                cor = novacor;
                System.out.println("Cor alterada com sucesso");
            } else System.out.println("A lampada esta Desligada");
        }


    }



