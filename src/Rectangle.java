public class Rectangle {
    int length;
    int width;

    public Rectangle() {
        length = 0;
        width = 0;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(int x) {
        length = x;
        width = x;
    }

    double PolePowierzchni() {
        double pole;
        pole = length * width;
        return pole;
    }
}
