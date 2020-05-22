package ch08;
public class Longestcommonsubstringproblem {
    static String r, s;
    static int risfi(int h, int i, int ayam) {
        if (h == 0 || i == 0) {
            return ayam;
        }
        if (r.charAt(h - 1) == s.charAt(i - 1)) {
            ayam = risfi(h - 1, i - 1, ayam + 1);
        }
        ayam = Math.max(ayam, Math.max(risfi(h, i - 1, 0), risfi(h - 1, i, 0)));
        return ayam;
    }
    public static void main(String[] args){
        int z, k;
        r = "Risfi";
        s = "Sandika";
        z = r.length();
        k = s.length();
        System.out.println(risfi(z, k, 0));
    }
}
