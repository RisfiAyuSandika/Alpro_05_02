package ch06;
public class Selectionsort {
     private final int[] risfi;
	public Selectionsort(int r) {
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
        int aku = this.risfi[d];
        this.risfi[d] = this.risfi[e];
        this.risfi[e] = aku;
    }
    public void Sandika() {
        for (int f = 0; f < this.risfi.length; f++) {
            int ayam = f;
            for (int g = f; g < this.risfi.length; g++) {
                if (this.risfi[g] < this.risfi[ayam]) {
                    ayam = g;
                }
            }
            Ayu(f, ayam);
        }
    }
    public static void main(String[] args) {
        Selectionsort a = new Selectionsort(13);
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

