package ch04;
public class RisfiE {
  public static void main(String[] args) {
        String[] angka = {"82","12","41","38","19","26","9","48","20","55","8","32","3"};
        for(String x : angka){
            if(x.contains("2")){
                System.out.print(x+"-");
            }
        }
    }

}
