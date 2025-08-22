import exe2.ContaB;

public class MainContaB  {
    public static void main(String[] args) throws Exception {
        ContaB conta1= new ContaB("Junior","456789",2000,true);
        ContaB conta2= new ContaB("Dany","123456",1000,true);

        conta1.Transferir(conta2, 500);

        conta1.Exibe();
        conta2.Exibe();
    }
}