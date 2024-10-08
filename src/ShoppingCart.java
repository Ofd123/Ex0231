public class ShoppingCart
{
    Product[] cart = new Product[10];

    public static void calculateAll(Product [] cart)
    {
        int price = 0;
        for(int i = 0; i<cart.length; i++)
        {
            price += cart[i].getPrice();
        }
        System.out.println("your have to pay "+price+" shekels");
    }
}

