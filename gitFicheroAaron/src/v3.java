public class v3 {
    public static String gacha(String g) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Gachamiga");
            } else if (i % 3 == 0) {
                System.out.println("Gacha");
            } else if (i % 5 == 0) {
                System.out.println("Miga");
            } else {
                System.out.println(i);
            }
        }
        return g;
    }
}
