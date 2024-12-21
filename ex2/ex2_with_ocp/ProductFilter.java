package ex2.ex2_with_ocp;

import java.util.*;
import java.util.stream.*;
public class ProductFilter implements IFilter<Product>
{
    @Override
    public Stream<Product> filter(List<Product> items, ISpecification<Product> spec)
    {
        return items.stream().filter(p -> spec.isSatisfied(p));
    }
}
