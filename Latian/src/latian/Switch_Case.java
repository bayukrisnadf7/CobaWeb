package latian;
import java.util.Scanner;
public class Switch_Case {
    public static void main(String[]args)   {
        Scanner sc = new Scanner (System.in);
        int bil_1, bil_2, menu, hasil;
        System.out.print("Masukan bilangan 1 : ");
        bil_1 = sc.nextInt();
        System.out.print("Masukan bilangan 2 : ");
        bil_2 = sc.nextInt();
 
        System.out.println("----- Menu -----");
        System.out.println("1. Pertambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Pilih menu 1-4 : ");
        menu = sc.nextInt();    
        switch(menu)    {
            case 1 :
                hasil = bil_1 + bil_2;
                System.out.println("Hasil Pertambahan : " + hasil);
                break;
            case 2 :
                hasil = bil_1 - bil_2;
                System.out.println("Hasil Pengurangan : " + hasil);
                break;
            case 3 :
                hasil = bil_1 * bil_2;
                System.out.println("Hasil Perkalian : " + hasil);
                break;
            case 4 :
                hasil = bil_1 / bil_2;
                System.out.println("Hasil Pembagian : " + hasil);
                break;
            default :
                System.out.println("Tidak ada di pilihan");
        }

}
}