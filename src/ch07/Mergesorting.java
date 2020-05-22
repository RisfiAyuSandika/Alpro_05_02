package ch07;
public class Mergesorting {
    public static void main(String risfi[]){
     int [] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
     System.out.println("Sebelum di Urutkan menggunakan merge sort ");
     for(int i = 0; i < angka.length; i++){
        System.out.print(angka[i]+" ");
     }
     System.out.println();
     Risfiayusandika(angka,0,angka.length-1);
     System.out.println();   
     System.out.println("Setelah di Urutkan menggunakan merge sort ");
     for(int i = 0; i < angka.length; i++){
        System.out.print(angka[i]+" ");
     }

}
   public static void Risfiayusandika(int [] a, int b, int c){ 
     int ayam = b;
     int kucing = c;
     if (ayam>=kucing){
        return;
     }
     int risfi=(ayam+kucing)/2;
     Risfiayusandika(a,ayam,risfi);
     Risfiayusandika(a,risfi+1,kucing);
     int ayu=risfi;
     int sandika=risfi+1;
     while ((b<=ayu) && (sandika<=kucing)){
        if (a[ayam]<a[sandika]){
           ayam++;
        }
        else
      {
           int aku=a[sandika];
           for (int k=sandika-1;k>=ayam;k--)
           {
              a[k+1]=a[k];
           }
           a[ayam]=aku;
           ayam++;
           ayu++;
           sandika++;
      }
    }
  }  
} 

