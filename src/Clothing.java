public class Clothing extends Product
{
    public Clothing(String name, int price, String description)
    {
        super(name, price, description);
    }
    //------------------------------------------------------
    @Override
    public String getName()
    {
        return("the garment is: "+super.getName());
    }
    //------------------------------------------------------
    @Override
    public String getDescription()
    {
        return("the garment has "+super.getDescription());
    }
    //------------------------------------------------------
    @Override
    public int getPrice()
    {
        return(super.getPrice());
    }
}
