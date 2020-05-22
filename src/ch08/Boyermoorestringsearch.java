import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Boyermoorestringsearch{
    public void risfi(String r, String a){
        char[] s = r.toCharArray();
        char[] k = a.toCharArray();
        int i = ayu(s, k);
        if (i == -1)
            System.out.println("Tidak Ditemukan");
        else
            System.out.println("Ditemukan Pada Posis : "+ i);
    }
    public int ayu(char[] a, char[] b) {
        if (b.length == 0) 
            return 0;
        int [] ayam = sandika(b);
        int [] kucing = sha(b);
        for (int i = b.length - 1, j; i < a.length;){
            for (j = b.length - 1; b[j] == a[i]; --i, --j) 
                if (j == 0) 
                    return i;
            i += Math.max(kucing [b.length - 1 - j], ayam[a[i]]);
        }
        return -1;
      }
    private int[] sandika(char[] k){
        final int l = 256;
        int[] me = new int[l];
        for (int i = 0; i < me.length; ++i) 
            me[i] = k.length;
        for (int i = 0; i < k.length - 1; ++i) 
            me[k[i]] = k.length - 1 - i;
        return me;
      }
      private static int[] sha (char[] z){
        int[] in = new int[z.length];
        int y = z.length;
        for (int i = z.length - 1; i >= 0; --i){
            if (sup(z, i + 1)) 
                   y = i + 1;
                in[z.length - 1 - i] = y - i + z.length - 1;
        }
        for (int i = 0; i < z.length - 1; ++i){
            int f = lala(z, i);
            in[f] = z.length - 1 - i + f;
        }
        return in;
    }
    private static boolean sup(char[] a, int p){
        for (int i = p, j = 0; i < a.length; ++i, ++j) 
            if (a[i] != a[j]) 
                return false;
        return true;
    }
    private static int lala (char[] x, int p){
        int bi = 0;
        for (int i = p, j = x.length - 1; i >= 0 && x[i] == x[j]; --i, --j) 
               bi += 1;
        return bi;
    }
    public static void main(String[] args) throws IOException{    
        BufferedReader ras = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukkan teks");
        String r = ras.readLine();
        System.out.println("Masukkan kata yang dicari");
        String a = ras.readLine();
        Boyermoorestringsearch m = new  Boyermoorestringsearch(); 
        m.risfi(r, a);     
    }
}
