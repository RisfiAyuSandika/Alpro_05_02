package ch06;
public class Bubblesort {
    static void Bubblesort(int[] risfi) {
        for (int r = 0; r < risfi.length; r++) {
            for (int a = 0; a <risfi.length - 1; a++) {
                if (risfi[a] > risfi[a + 1]) {
                    int ayam = risfi[a];
                    risfi[a] = risfi[a + 1];
                    risfi[a + 1] = ayam;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] risfi = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int r = 0; r < risfi.length; r++) {
            System.out.print(risfi[r] + ", ");
        }
        System.out.println("");
        Bubblesort(risfi);
        for (int r = 0; r < risfi.length; r++) {
            System.out.print(risfi[r] + ", ");
        }
    }
}
