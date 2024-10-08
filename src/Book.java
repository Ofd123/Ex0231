public class Book extends Product
{
    public Book(String name, int price, String description)
    {
        super(name, price, description);
    }
    //------------------------------------------------------
    @Override
    public String getName()
    {
        return("the book's name is: "+super.getName());
    }
    //------------------------------------------------------
    @Override
    public String getDescription()
    {
        return("the book tells us about "+super.getDescription());
    }
    //------------------------------------------------------
    @Override
    public int getPrice()
    {
        return(super.getPrice());
    }
}

