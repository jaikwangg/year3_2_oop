package ex2.ex2_with_ocp;

public interface ISpecification<T>
{
    boolean isSatisfied(T item);
}

