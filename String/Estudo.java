/**
 * Estudo
 */
public class Estudo {

    public Estudo() {
    }

    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG   ";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        System.out.println("original " + original);
        System.out.println(s01);
        System.out.println(s02);
        System.out.println(s03);
    }
}