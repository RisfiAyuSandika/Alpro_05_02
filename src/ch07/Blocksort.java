public class Blocksort {
        private Blocksort(int[] risfi) {
        int r = risfi.length;
        for (int a = 1;a<r;a++) {
            int ayu = risfi [a];
            int s=a-1;
            while ((s>-1)&&(risfi[s]>ayu)){
                risfi[s+1] = risfi[s];
                s--;
            }
            risfi[s+1]=ayu;
        }
    }
    private int[] risfi;

    public static void main(String[] args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Sebelum diurutkan menggunakan block sort");
        for (int b:angka){
            System.out.print(b+" ");
        }
        System.out.println();
            Blocksort blocksort = new Blocksort(angka);

        System.out.println("Setelah diurutkan menggunakan block sort");
        for(int b:angka){
            System.out.print(b+" ");
        }
    }
}
