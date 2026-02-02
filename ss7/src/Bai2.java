class Compare {
    String name;
}
public class Bai2 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = n1;
        n2 = 1;
        System.out.println("Primitive");
        System.out.println("n1 = "+n1);
        System.out.println("n2 = "+n2);
        System.out.println();
        Compare s1 = new Compare();
        s1.name = "Ánh";
        Compare s2 = s1;
        s2.name = "Dương";
        System.out.println("Reference");
        System.out.println("s1 = "+ s1.name);
        System.out.println("s2 = "+s2.name);
        System.out.println();
    }
}
