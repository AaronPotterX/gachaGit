public class v4 {
    public static String gacha(String g) {
        String numero;
        int num = Integer.parseInt(g);
        if(num % 3==0 && num % 5==0) {
            numero = "Gachamiga";
        }else if (num % 3==0) {
            numero = "Gacha";
        }else if (num % 5==0) {
            numero = "Miga";
        }else {
            numero = num + "";
        }
        return numero;
    }
}
