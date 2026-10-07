package model;

public class Dataset {

    // Atribut
    private String nama;
    private int jumlahBaris;
    private int jumlahKolom;
    private int jumlahMissing;

    // Konstanta
    public static final double BATAS_MISSING = 5.0;

    // Menghitung total objek Dataset yang dibuat
    private static int totalDataset = 0;

    // Constructor tanpa parameter
    public Dataset() {
        totalDataset++;
    }

    // Constructor dengan parameter nama
    public Dataset(String nama) {
        this.nama = nama;
        totalDataset++;
    }

    // Constructor lengkap
    public Dataset(String nama, int jumlahBaris, int jumlahKolom, int jumlahMissing) {
        this.nama = nama;
        this.jumlahBaris = jumlahBaris;
        this.jumlahKolom = jumlahKolom;
        this.jumlahMissing = jumlahMissing;
        totalDataset++;
    }

    // Getter dan Setter nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter jumlahBaris
    public int getJumlahBaris() {
        return jumlahBaris;
    }

    public void setJumlahBaris(int jumlahBaris) {
        this.jumlahBaris = jumlahBaris;
    }

    // Getter dan Setter jumlahKolom
    public int getJumlahKolom() {
        return jumlahKolom;
    }

    public void setJumlahKolom(int jumlahKolom) {
        this.jumlahKolom = jumlahKolom;
    }

    // Getter dan Setter jumlahMissing
    public int getJumlahMissing() {
        return jumlahMissing;
    }

    public void setJumlahMissing(int jumlahMissing) {
        this.jumlahMissing = jumlahMissing;
    }

    // Menghitung persentase missing
    public double getPersentaseMissing() {
        int totalSel = jumlahBaris * jumlahKolom;

        if (totalSel == 0) {
            return 0;
        }

        return ((double) jumlahMissing / totalSel) * 100;
    }

    // Menentukan apakah dataset perlu dibersihkan
    public boolean perluDibersihkan() {
        return getPersentaseMissing() > BATAS_MISSING;
    }

    // Mengambil total dataset yang telah dibuat
    public static int getTotalDataset() {
        return totalDataset;
    }
}