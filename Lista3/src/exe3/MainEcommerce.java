package exe3;

public class MainEcommerce {
    public static void main(String[] args) {

        Product pro1 = new Product(7,"A",100);
        Product pro2 = new Product(8,"B",200);
        Product pro3 = new Product(9,"C",300);

        ShoppingCart cart = new ShoppingCart(1);
        cart.addCarItem(11,5,pro1);
        cart.addCarItem(12,10,pro2);
        cart.addCarItem(13,2,pro3);

        System.out.println(cart.toString());
        cart.removeCarItem(12);
        System.out.println(cart.toString());
    }
}
