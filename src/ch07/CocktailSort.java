import java.util.Arrays;
public class CocktailSort {
    void CocktailSort(int[] risfi){
    boolean ayam;
    do {
        ayam = false;
            for (int i =0; i<=  risfi.length  - 2;i++) {
		if (risfi[ i ] > risfi[ i + 1 ]) {
		int aku = risfi[i];
		risfi[i] = risfi[i+1];
		risfi[i+1]=aku;
		ayam = true;
                }
		}
		if (!ayam) {
			break;
		}
		ayam = false;
		for (int i= risfi.length - 2;i>=0;i--) {
                    if (risfi[ i ] > risfi[ i + 1 ]) {
			int kucing = risfi[i];
			risfi[i] = risfi[i+1];
			risfi[i+1]=kucing;
			ayam = true;
			}
		}
}
    while (ayam);
}
    public static void main(String args[]){
        CocktailSort ras = new CocktailSort();
        int sdk[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        System.out.println("Angka Array sebelum:");
        System.out.println(Arrays.toString(sdk));
        ras.CocktailSort(sdk);
        System.out.println("Angka Array sesudah:");
        System.out.println(Arrays.toString(sdk));
    }
}
