package ch06;
public class Insertionsort {
    private final int[] risfi;
	public Insertionsort(int r) {
        this.risfi = new int[r];
    }
	public void Ras(int a, int b) {
        if (a >= 0 && a < this.risfi.length) {
            this.risfi[a] = b;
        }
    }
    public void Risfi() {
        String angka = "Angka Array = ";
        for (int c= 0; c <this.risfi.length; c++) {
            angka += this.risfi[c] + ", ";
        }
        System.out.println(angka);
    }
    private void Ayu(int d, int e) {
        int ayam = this.risfi[d];
        this.risfi[d] = this.risfi[e];
        this.risfi[e] = ayam;
    }
    public void Sandika() {
        for (int f = 1; f < this.risfi.length; f++) {
            int g = f;
            while (g >0 && this.risfi[g] < this.risfi[g - 1]) {
                Ayu(g,g-1);
                g--;
            }
        }
    }
    public static void main(String[] args) {
        Insertionsort a = new Insertionsort(13);
//int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        a.Ras(0, 82);
        a.Ras(1, 12);
        a.Ras(2, 41);
        a.Ras(3, 38);
        a.Ras(4, 19);
        a.Ras(5, 26);
        a.Ras(6, 9);
        a.Ras(7, 48);
        a.Ras(8, 20);
        a.Ras(9, 55);
        a.Ras(10, 8);
        a.Ras(11, 32);
        a.Ras(12, 3);

        a.Risfi();
        a.Sandika();
        a.Risfi();
    }
}



