package exe2;

public class Cofrinho {
    private double saldo;
    private boolean fechado;

    // construtores

    public Cofrinho() {
        this.setSaldo(0);
        this.setFechado(false);

    }

    public Cofrinho(double saldo, boolean fechado) {
        this.setSaldo(saldo);
        this.setFechado(fechado);
    }

    //setters
    public void setSaldo(double saldo) {
        if (!this.fechado && saldo >= 0) {
            this.saldo = saldo;
        } else System.out.println("Cofre fechado ou Saldo Invalido");
    }

        public void setFechado ( boolean fechado){
            this.fechado = fechado;
        }
        //getters
        public double getSaldo () {
            return this.saldo;
        }
        public boolean getFechado () {
            return this.fechado;
        }
        public void abrir(){
            if (this.fechado){
                this.setFechado(false);
            }
    }

        public void fechar() {
            if (!this.fechado) {
                this.setFechado(true);
            }
        }
        public void depositar(double valor){
            if (valor > 0 && !this.fechado);
            }

        public void zerarConta(){
            if (saldo > 0 && this.fechado){
                System.out.println("Saque realizado com sucesso O valor sacado foi de: " + this.saldo);
                this.setSaldo(0);
            }

        }


}
