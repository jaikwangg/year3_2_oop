package q3;

public class RasterSaveVisitor implements ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("Saving the circle... with radius= " + circle.getRadius() +
                " at position " + circle.getxPos() + ", " + circle.getyPos() + " as raster");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Saving the rectangle...with width = " + rectangle.getWidth() +
                " height = " + rectangle.getHeight() +
                " at position " + rectangle.getxPos() + ", " + rectangle.getyPos() + " as raster");
    }

    @Override
    public void visit(Triangle triangle) {
        System.out.println("Saving the triangle...with base = " + triangle.getBase() +
                " height = " + triangle.getHeight() +
                " at position " + triangle.getxPos() + ", " + triangle.getyPos() + " as raster");
    }
}
