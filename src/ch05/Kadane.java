import java.util.Scanner;
public class Kadane {
    public int risfi(int[] r) {        
        int a = r[0], b = r[0];
        for (int i = 1; i < r.length; i++){
            if (b < 0)
                b = r[i];
            else
                b += r[i];
 
            if (b >= a)
                a = b;
        }
        return a;
    }    
	
    public static void main (String[] args) 
    {
        Scanner ras = new Scanner(System.in);
        Kadane p = new Kadane();
        System.out.println("Masukkan jumlah Array :");
        int l = ras.nextInt();
        System.out.println("Masukkan "+ l +" elements");
        int[] risfi = new int[l];
        for (int i = 0; i < l; i++)
            risfi[i] = ras.nextInt();
        int sum = p.risfi(risfi);
        System.out.println("Maksimal = "+ sum);
	
 
    }
}
 


