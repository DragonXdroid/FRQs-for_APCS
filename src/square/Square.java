package square;

public class Square {

    private int length;

    private int area;

    private  int parameter;

    public Square(int length){
        this.length =length;
    }

    public int getArea() {
        area = length*length;
        return area;
    }

    public int getParameter() {
        parameter = length*4;
        return parameter;
    }
}
