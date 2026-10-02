package Guided;

public class Abstraksi {
    public static class Kucing {
        String nama;
        String ras;

        void bersuara() {
            System.out.println(nama + ras + "meow");
        }
    }

    public static void main(String[] args) {
        Kucing aren = new Kucing();

        aren.nama = "Aren Gentong ";
        aren.ras = "Mujaer ";
        aren.bersuara();
    }
}