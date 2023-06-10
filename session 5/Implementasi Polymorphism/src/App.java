abstract class Hewan {
    int kecepatan;
    int berat;
    int ukuran;
    
    public Hewan(int kecepatan, int berat, int ukuran) {
        this.kecepatan = kecepatan;
        this.berat = berat;
        this.ukuran = ukuran;
    }
    
    public void bergerak() {
        System.out.println("Hewan bergerak maju.");
    }
    
    public void mundur() {
        System.out.println("Hewan bergerak mundur.");
    }
}

class Kucing extends Hewan {
    public Kucing(int kecepatan, int berat, int ukuran) {
        super(kecepatan, berat, ukuran);
    }
    
    @Override
    public void bergerak() {
        System.out.println("Kucing berjalan.");
    }
}

class Gajah extends Hewan {
    public Gajah(int kecepatan, int berat, int ukuran) {
        super(kecepatan, berat, ukuran);
    }
    
    @Override
    public void bergerak() {
        System.out.println("Gajah berjalan.");
    }
}

class Burung extends Hewan {
    public Burung(int kecepatan, int berat, int ukuran) {
        super(kecepatan, berat, ukuran);
    }
    
    @Override
    public void bergerak() {
        System.out.println("Burung terbang.");
    }
}

public class App {
    public static void main(String[] args) {
        Hewan[] hewan = new Hewan[3];
        
        hewan[0] = new Kucing(20, 5, 30);
        hewan[1] = new Gajah(10, 1000, 300);
        hewan[2] = new Burung(50, 1, 20);
        
        for (int i = 0; i < hewan.length; i++) {
            System.out.println("Hewan ke-" + (i+1) + " bergerak:");
            hewan[i].bergerak();
            System.out.println();
        }
    }
}
