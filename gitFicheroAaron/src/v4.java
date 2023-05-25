public class v4 {
    public static String gacha(String g) {
        String nume;
        int num = Integer.parseInt(g);
        if(num % 3==0 && num % 5==0) {
            nume = "Gachamiga";
        }else if (num % 3==0) {
            nume = "Gacha";
        }else if (num % 5==0) {
            nume = "Miga";
        }else {
            nume = num + "";
        }
        return nume;
    }
}
