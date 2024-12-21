package ex2.ex2_with_ocp;

public class SizeSpecification implements ISpecification<Product>
{
    private Size size;

    public SizeSpecification(Size size)
    {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item)
    {
        return item.size == size;
    }
}
