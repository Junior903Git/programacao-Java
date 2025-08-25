package exe1;

public class Lampada {
    private int brilho;
    private boolean ligada;
    private String cor , marca;

    public Lampada (){

    }
    public Lampada (String marca ,String cor, boolean ligada, int brilho){
        this.setMarca(marca);
        this.setCor(cor);
        this.setLigada(ligada);
        this.setBrilho(brilho);
    }

    //setters  sempre void
    public void setBrilho(int brilho){
        if (brilho >= 0 && brilho <= 100){
            this.brilho = brilho;
        }
        else System.out.println("Brilho Invalido");
    }

    public void setLigada(boolean ligada){
        this.ligada = ligada;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setMarca (String marca){
        this.marca = marca;
    }

    public int getBrilho(){
        return this.brilho;
    }
    public boolean getLigada(){
        return this.ligada;
    }
    public String getCor(){
        return this.cor;
    }
    public String getMarca(){
        return this.marca;
    }
    public void exibe(){
        System.out.println("Marca: "+ this.marca+" Cor: "+ this.cor + "brilho " + this.brilho);

    }
    public void ligar(){
        if (!this.ligada){
            this.setLigada(true);
        }
    }
    public void desligar(){
        if(this.ligada){
            this.setLigada(false);
            this.setBrilho(0);
        }
    }
    public void alterarBrilho (int brilho){
        if (this.ligada){
            this.setBrilho(brilho);
        }
    }
    public void mudarcor(String cor){
        if (this.ligada){
            this.setCor(cor);
        }
    }
    public void verificaCor(){
        if (this.cor.equals("branca") || this.cor.equals("amarela")){
            System.out.println("Cor usual");}
        else{System.out.println("Cor diferenciada");
        }
    }
}

