public class MainPoint {
    public static void main(String[] args) {
        Point s1 = new Point(1,2);
        MovablePoint s2 = new MovablePoint(6,7);
        System.out.println(s2.getSpeed());
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
