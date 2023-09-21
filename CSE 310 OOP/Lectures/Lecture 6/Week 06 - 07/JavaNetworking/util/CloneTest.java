package util;

class Point implements Cloneable {

    int x, y;
    String name;

    public Point(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneTest {
    public static void main(String args[]) {
        try {
            Point p1 = new Point(10, 20, "p1");
            Point p2 = (Point) p1.clone();
            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p1.getX() + "," + p1.getY() + ", " + p1.getName());
            System.out.println(p2.getX() + "," + p2.getY() + ", " + p2.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}