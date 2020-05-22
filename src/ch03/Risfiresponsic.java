import java.util.Scanner;
public class Risfiresponsic {
    public static void main(String[] args) {
        Scanner ras = new Scanner (System.in);
        System.out.println("Masukkan Angka");
        double angka = ras.nextInt();
        for (int i = 3; i<=angka; i++){
            if ((angka/i) % 1 == 0){
            System.out.println("Nilai pembagi terkecil :" + i);
            System.exit(0);
    }
  
}
}
}