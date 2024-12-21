package ex2.ex2_with_ocp;

class ColorSpecification implements ISpecification<Product>
{
    private Color color;

    public ColorSpecification(Color color)
    {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product item)
    {
        return item.color == color;
    }
}
