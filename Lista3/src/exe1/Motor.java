package exe1;

public class Motor {
    private int potencia;
    private boolean ligado;

    public Motor() {
    }

    public Motor(int potencia, boolean ligado) {
        this.potencia = potencia;
        this.ligado = ligado;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public String toString() {
        return "exe1.Motor{" +
                "potencia=" + potencia +
                ", ligado=" + ligado +
                '}';
    }
    public void ligar(){
        this.ligado=true;
    }
    public void desligar(){
        this.ligado=false;
    }



}
