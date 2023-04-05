package square;

public class Main {
    public static void main(String[] args) {

        var square = new Square(2);
        System.out.println("The area of the square is " +square.getArea());
        System.out.println("The parameter of the square is " +square.getParameter());
        var rectangle = new Rectangle(9,2);
        System.out.println("The area of the rectangle is " +rectangle.getArea());
        System.out.println("The parameter of the rectangle is " +rectangle.getParameter());

    }
}