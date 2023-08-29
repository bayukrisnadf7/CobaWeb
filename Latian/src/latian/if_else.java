package latian;
import java.util.Scanner;
public class if_else{
    public static void main(String[]args)   {
        Scanner sc = new Scanner(System.in);
//        String warna;
//        
//        System.out.println("----- Menu Warna -----");
//        System.out.println("1. merah ");
//        System.out.println("2. kuning");
//        System.out.println("3. hijau");
//        System.out.print("Masukan warna : ");
//        warna = sc.nextLine();
//        
//        switch (warna) {
//            case "merah" :
//                System.out.println("anda harus berhenti");
//                break;
//            case "kuning" :
//                System.out.println("persiapan berhenti");
//                break;
//            case "hijau" :
//                System.out.println("silahkan jalan");
//                break;
//            default :
//                System.out.println("warna salah");
//            
//        }
        System.out.print("Masukan Bilangan : ");
        int angka = sc.nextInt();
        
        
        if(angka % 2 == 0){
            System.out.println("Bilangan genap");
        } else if(angka % 2 != 0){
            System.out.println("Bilangan Ganjil");
        } else {
        }
    }
}