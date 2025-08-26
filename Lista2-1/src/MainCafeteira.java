import exe3.Cafeteira;

public class MainCafeteira {
    public static void main (String[] args){
        Cafeteira obj1 = new Cafeteira();
        obj1.exibe();
        obj1.ligar();
        obj1.reporAgua(2000);
        obj1.reporCafe(300);
        obj1.preparar();
        obj1.exibe();
        obj1.reporCafe(100);
        obj1.exibe();
        obj1.preparar();
        obj1.exibe();
        obj1.reporAgua(200);
        obj1.exibe();
        obj1.desligar();
        obj1.exibe();

    }
}
