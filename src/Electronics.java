public class Electronics extends Product
{
    public Electronics(String name, int price, String description)
    {
        super(name, price, description);
    }
    //------------------------------------------------------
    @Override
    public String getName()
    {
        return("the item is"+super.getName());
    }
    //------------------------------------------------------
    @Override
    public String getDescription()
    {
        return("the electronic is charged at "+super.getDescription()+"%");
    }
    //------------------------------------------------------
    @Override
    public int getPrice()
    {
        return(super.getPrice());
    }
}

