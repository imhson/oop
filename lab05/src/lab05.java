

public class lab05 {
    public static void main(String[] args) {
        Qua_Tao tao_tau = new Qua_Tao("tao tau", true, "ngot");
        Cam_Cao_Phong camcp = new Cam_Cao_Phong();
        Cam_Sanh cams = new Cam_Sanh();
        Circle circle = new Circle(2);
        Square square = new Square(3.7);
        System.out.println(tao_tau.toString());
        System.out.println(circle.toString());
        System.out.println( circle.getArea());
        System.out.println(square.getArea());
    }
    
}
