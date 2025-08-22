package exe2;

public class ContaB {
    public String titular, numero;
    public double saldo, valor;
    public boolean ativa;


    //Construtor
    public ContaB(String titular, String numero, double saldoInicial, boolean ativa){ //conta usuario
        this.saldo = saldoInicial;
        this.numero =numero;
        this.ativa = ativa;
        this.titular = titular;
    }

    public ContaB(){// conta vazia
        this.saldo = 0;
        this.numero ="";
        this.ativa = true;
        this.titular = "";

    }

    public void Exibe(){
        System.out.println("Titular: " + titular + "Número da conta: " + numero.substring(0,numero.length() - 3) +
                "Saldo atual da conta: " + saldo + "Status atual da conta: " + ativa);
    }

    public void Desativar(){
        if (saldo < 0) {

            System.out.println(" Não foi possivel desativar sua conta, seu saldo atual: " + saldo);
        }else{ this.ativa=false;
            System.out.println("Conta desativada com sucesso!");
        }
    }

    public void Ativar(){
        if(saldo >= 0) {
            this.ativa=true;
            System.out.println(" Sua conta esta ativa, seu saldo atual: " + saldo);
        }
    }

    public void Depositar(double valor){
        if (saldo >= 0 && ativa) {
            saldo+= valor;
            System.out.println("voce recebeu um deposito no valor de: " +
                    this.valor + ",seu saldo atual é:" + this.saldo);
        }else{
            System.out.println( "Conta indisponivel para deposito");

        }
    }

    public boolean Sacar( double valor) {
        if (saldo > 0 && ativa && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque efetuado com sucesso, saldo atual:" + saldo);
            return true;
        } else {
            System.out.println("Saque indisponivel, saldo atual:" + saldo);
            return false;
        }
    }
    public void Transferir(ContaB destino, double valor){
        this.saldo -=  valor;
        destino.Depositar(valor);
    }
}