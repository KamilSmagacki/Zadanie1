public class App {
    public static void main(String[] args) {
        Rectangle prostokat1 = new Rectangle();

        Rectangle prostokat2 = new Rectangle(5);

        Rectangle prostokat3 = new Rectangle(5, 5);

//        System.out.println("Pole prostokata z konstruktora bezparametrowego: " + PolePowierzchni(prostokat1.length, prostokat1.width));
//        System.out.println("Pole prostokata z konstruktora z jednym parametrem: " + PolePowierzchni(prostokat2.length, prostokat2.width));
//        System.out.println("Pole prostokata z konstruktora z dwoma parametrami: " + PolePowierzchni(prostokat3.length, prostokat3.width));

        System.out.println("Pole prostokata z konstruktora bezparametrowego: " + prostokat1.PolePowierzchni());
        System.out.println("Pole prostokata z konstruktora z jednym parametrem: " + prostokat2.PolePowierzchni());
        System.out.println("Pole prostokata z konstruktora z dwoma parametrami: " + prostokat3.PolePowierzchni());




    }
}
