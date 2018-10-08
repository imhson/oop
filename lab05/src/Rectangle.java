public class Rectangle extends Shape{
    double width = 1.0;
    double length = 1.0;

    public Rectangle() {
    }
    public Rectangle (double width, double length){
        this.width= width;
        this.length= length;
    }

    public Rectangle(String color, boolean filled,double width, double length) {
        super(color, filled);
        this.width= width;
        this.length= length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea (double width, double length){
        return width*length;
    }
    public double getPermeter (double width, double length){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }
    
}
