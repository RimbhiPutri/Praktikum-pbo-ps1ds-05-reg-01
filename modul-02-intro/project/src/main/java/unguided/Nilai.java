package unguided;
public class Nilai {

    public static void main(String[] args) {

        // Konstanta KKM
        final double KKM = 75.0;

        // nama mahasiswa
        String[] nama = {"Andi", "Budi", "Citra"};

        // nilai Modul 1 dan Modul 2
        double[][] nilai = {
            {80.0, 85.0},
            {70.0, 65.0},
            {90.0, 90.0}
        };

        // output
        System.out.println("REKAP NILAI PRAKTIKUM");
        System.out.println("KKM: " + KKM);
        System.out.println();

        // Perulangan untuk mengakses data mahasiswa
        for (int i = 0; i < nama.length; i++) {

            // Menghitung rata-rata
            double rataRata = (nilai[i][0] + nilai[i][1]) / 2;

            // Menentukan status kelulusan
            String status;

            if (rataRata >= KKM) {
                status = "LULUS";
            } else {
                status = "REMEDIAL";
            }

            // Menampilkan hasil
            System.out.println("Mahasiswa " + (i + 1) + ": " + nama[i]);
            System.out.println("Nilai Modul 1 : " + nilai[i][0]);
            System.out.println("Nilai Modul 2 : " + nilai[i][1]);
            System.out.println("Rata-rata     : " + rataRata);
            System.out.println("Status        : " + status);
            System.out.println();
        }
    }
}
