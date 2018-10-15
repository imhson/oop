package lab06;
public class Triagle extends Shape {
    XY vertice1,vertice2,vertice3;

    public Triagle(XY vertice1, XY vertice2, XY vertice3, String color, boolean filled, XY xy) {
        super(color, filled, xy);
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }

    public Triagle(XY vertice1, XY vertice2, XY vertice3) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }

    public XY getVertice1() {
        return vertice1;
    }

    public void setVertice1(XY vertice1) {
        this.vertice1 = vertice1;
    }

    public XY getVertice2() {
        return vertice2;
    }

    public void setVertice2(XY vertice2) {
        this.vertice2 = vertice2;
    }

    public XY getVertice3() {
        return vertice3;
    }

    public void setVertice3(XY vertice3) {
        this.vertice3 = vertice3;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public XY getXy() {
        return xy;
    }

    public void setXy(XY xy) {
        this.xy = xy;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getEgde1() {
        return egde1;
    }

    public void setEgde1(double egde1) {
        this.egde1 = egde1;
    }

    public double getEgde2() {
        return egde2;
    }

    public void setEgde2(double egde2) {
        this.egde2 = egde2;
    }

    public double getEgde3() {
        return egde3;
    }

    public void setEgde3(double egde3) {
        this.egde3 = egde3;
    }

    @Override
    public String toString() {
        return "Triagle{" + "x=" + x + ", y=" + y + ", egde1=" + egde1 + ", egde2=" + egde2 + ", egde3=" + egde3 + '}';
    }
    
}
