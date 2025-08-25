import exe1.Cofrinho;

public class MainCofrinho {
    public static void main(String[] args) {
        Cofrinho obj1 = new Cofrinho(); // começa aberto e com saldo 0


        obj1.exibirSaldo();
        obj1.depositar(100);
        obj1.exibirSaldo();
        obj1.retirarTudo();
        obj1.exibirSaldo();


        obj1.fechar();
        obj1.exibirSaldo();
        obj1.abrir();
        obj1.depositar(50);
        obj1.retirarTudo();


        obj1.abrir();
        obj1.depositar(200);
        obj1.exibirSaldo();
    }
}