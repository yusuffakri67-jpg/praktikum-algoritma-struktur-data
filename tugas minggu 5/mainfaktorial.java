import java.util.Scanner;
public class mainfaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        int nilai = sc.nextInt();

        faktorial fk = new faktorial();
        System.out.println("Nilai Faktorial " + nilai + " Menngunakan BF: " + fk.faktorialIBF(nilai));
        System.out.println("Nilai Faktorial " + nilai + " Menggunakan DC: " + fk.faktorialIDC(nilai));
    }
}
