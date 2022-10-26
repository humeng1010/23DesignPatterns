package shape;

public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        //shape.Shape redCircle = new shape.RedShapeDecorator(new shape.Circle());
        //shape.Shape redRectangle = new shape.RedShapeDecorator(new shape.Rectangle());
        System.out.println("shape.Circle with normal border");
        circle.draw();

        System.out.println("\nshape.Circle of red border");
        redCircle.draw();

        System.out.println("\nshape.Rectangle of red border");
        redRectangle.draw();
    }
}