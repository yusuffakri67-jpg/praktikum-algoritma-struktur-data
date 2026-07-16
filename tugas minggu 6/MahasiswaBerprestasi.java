
public class MahasiswaBerprestasi {
    Mahasiswa18 [] lisMhs = new Mahasiswa18[5];
    int idx;

    void tambah(Mahasiswa18 m){
        if (idx < lisMhs.length) {
            lisMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil(){
        for (Mahasiswa18 m : lisMhs) {
            m.tampilInformasi();
            System.out.println("-------------------");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < lisMhs.length-1; i++) {
            for (int j = 1; j < lisMhs.length-i; j++) {
                if (Double.parseDouble(lisMhs[j].ipk) > Double.parseDouble(lisMhs[j-1].ipk)) {
                    Mahasiswa18 temp = lisMhs[j];
                    lisMhs[j] = lisMhs[j-1];
                    lisMhs[j-1] = temp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < lisMhs.length; i++) {
            Mahasiswa18 temp = lisMhs[i];
            int j=i;
            while (j>0 && Double.parseDouble(lisMhs[j-1].ipk) > Double.parseDouble(temp.ipk)){
                lisMhs[j] = lisMhs[j-1];
                j--;
            }
            lisMhs[j] = temp;
        }
    }
}
