import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MagicBox<Integer> magicInt = new MagicBox<>();
        System.out.println(magicInt.add(10));
        System.out.println(magicInt.add(15));
        //System.out.println(magicInt.pick());
        System.out.println(magicInt.add(5));
        System.out.println(magicInt.add(45));
        System.out.println(magicInt.add(35));
        System.out.println(Arrays.toString(magicInt.getItems()));
        System.out.println("\trandom element " + magicInt.pick());
        System.out.println("===================================");
        MagicBox<String> magicStr = new MagicBox<>();
        System.out.println(magicStr.add("Masha"));
        System.out.println(magicStr.add("Sasha"));
        System.out.println(magicStr.add("Piter"));
        //System.out.println(magicStr.pick());
        System.out.println(magicStr.add("Olya"));
        System.out.println(magicStr.add("David"));
        System.out.println(Arrays.toString(magicStr.getItems()));
        System.out.println("\trandom element " + magicStr.pick());
    }
}
