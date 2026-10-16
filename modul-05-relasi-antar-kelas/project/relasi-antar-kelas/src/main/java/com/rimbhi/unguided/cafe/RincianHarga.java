package com.rimbhi.unguided.cafe;

public class RincianHarga {
    private double hargaDasar;
    private double pajak;

    public RincianHarga(double hargaDasar){
        this.hargaDasar = hargaDasar;
        this.pajak = hargaDasar * 0.1;
    }

    public double getHargaTotal(){
        return hargaDasar + pajak;
    }

    public double getHargaDasar(){
        return hargaDasar;
    }

    public double getPajak(){
        return pajak;
    }
}
