//Emma Hopkins : this program initializes octagons to be used in octagon.java
public class TestOctagon {

    public static void main(String[] args) {
        Octagon oct1 = new Octagon(5.0, "Oct1", false);

        Octagon oct2 = oct1.createClone();

        System.out.println(oct1.toString());
        System.out.println(oct2.toString());
        System.out.println("oct1.compareTo(oct2): " + oct1.compareTo(oct2));

        oct1 = new Octagon(5.2, "Oct1", false);

        System.out.println(oct1.toString());
        System.out.println(oct2.toString());
        System.out.println("oct1.compareTo(oct2): " + oct1.compareTo(oct2));
    }
}
