import java.util.Scanner;
public class mainperangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = sc.nextInt();

        pangkat[] png = new pangkat[elemen];
        
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan Nilai Basis Elemen ke-" + (i+1) + ": ");
            int basis = sc.nextInt();
            System.out.print("Masukkan Nilai Pangkat elemen ke-" + (i + 1) + ": ");
            int pangkat = sc.nextInt();
            png[i] = new pangkat(basis, pangkat);
        }

        System.out.println("Hasil Pangkat BRYTFORCE");
        for (pangkat p : png){
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatBF(p.nilai, p.pangkat));
        }
         System.out.println("Hasil Pangkat DIVIDE AND CONQUER");
        for (pangkat p : png){
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
