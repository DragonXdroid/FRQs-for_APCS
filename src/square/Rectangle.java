package square;

public class Rectangle extends Square{

   private int length;

   private int width;

    public Rectangle(int width, int length) {
        super(width);
        this.width = width;
        this.length = length;
    }


    @Override
    public int getArea() {
        return length * width;
    }

    @Override
    public int getParameter() {
        return super.getParameter();
    }







}
