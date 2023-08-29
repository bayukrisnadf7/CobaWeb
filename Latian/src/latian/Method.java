package latian;

public class Method {
    
    static void Hewan(){
        System.out.println("Dinosaurus");
    }
    static void Jenis(){
        System.out.println("Jenis Dinosaurus");
        System.out.println("1.Theropods");
        System.out.println("2.Sauropods");
        System.out.println("3.Stegosaurus");
        System.out.println("4.Ankylosauria");
        System.out.println("5.Cerotopsian");
    }
    static void Jenis_Makanan(String Makanan){
        System.out.println("Makanan Dinosaurus "+Makanan);
    }
    static void Kecepatan(){
        System.out.println("Kecepatan Dinosaurus 1,28 meter/d");
    }
    static void Ukuran(){
        System.out.println("Ukuran Dinosaurus Panjang 25 m , tinggi 13 m , berat 50 ton");
    }
    public static void main(String[] args) {
        Hewan();
        Jenis();
        Jenis_Makanan("65% Herbivora 30% Karnivora 5% Omnivora");
        Kecepatan();
        Ukuran();
    }
}
