package latian;

import java.util.Scanner;

public class pemdas {
    
    public static int pangkat( int x, int y){
        if(y==0)
            return 1;
        else
            return x*pangkat(x,y-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukan angka : ");
        int a = sc.nextInt();
        System.out.print("Masukan Pangkat : ");
        int b = sc.nextInt();
        System.out.println(a+"dipangkatkan"+b+"="+pangkat(a,b));
        
    }
    
    
    
//    public static int faktorial(int x){
//        if(x==1)
//            return x;
//        else
//            return x*faktorial(x-1);
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Masukan Bilangan : ");
//        int a = sc.nextInt();
//        System.out.println("Faktorial dari"+a+faktorial(a));
    
    
//        int total, diskon = 0, bayar;
//        String kartu;
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("----- Sistem Pembayaran Kasir -----");
//        System.out.println("Apakah Pelanggan Memiliki Kartu Anggota ( y atau t ) ? ");
//        kartu = sc.nextLine();
//        System.out.print("Total Belanjaan Anda : ");
//        total = sc.nextInt();
//        
//        if(kartu.equals("y")){
//            if( total > 100000){
//                diskon = 5000;
//            } else if (total > 200000){
//                diskon = 10000;
//            } else if (total > 300000){
//                diskon = 15000;
//            } else if (total < 100000){
//                diskon = 0;
//            }
//        } else {
//            diskon = 0;
//        }
//        bayar = total - diskon;
//        System.out.println("Total Belanjaan Anda : " + bayar);
//         int count = 0;
//         while(count<10)
//         {
//         System.out.println("Hai");
//         count++;
//         }
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i+"kg"+"="+(i*1000)+"gram");
//        }
//        public static void main(String[] args) {
//        int pilihan;
//        String kode_nama;
//        
//        Scanner sc = new Scanner (System.in);
//        Scanner in = new Scanner (System.in);
//        
//            System.out.print("Masukan Pilihan : ");
//            pilihan = sc.nextInt();
//            System.out.print("Masukan Kode Nama  : ");
//            kode_nama = in.nextLine();
//            
//            if(pilihan==1){
//                if(kode_nama.equals("Bayu")){
//                    System.out.println("Selamat Datang Manager Bayu");
//                } else if (kode_nama.equals("Dika")){
//                    System.out.println("Selamat Datang Manager Dika");
//                } else{
//                    System.out.println("Anda Bukan Manager");
//                }
//            }
//            else if (pilihan==2){
//                if(kode_nama.equals("Uyab")){
//                    System.out.println("Selamat Datang Kasir Uyab");
//                } else if(kode_nama.equals("Aziz")){
//                    System.out.println("Selamat Datang Kasir Aziz");
//                }
//            } else{
//                System.out.println("Anda Bukan Kasir");
//            }
                
//            int i = 1;
//            while(i<3){
//                int k=1;
//                while(k<2){
//                    System.out.println("Here");
//                    k++;
//                }
//            }
//            i++;
//            Scanner sc = new Scanner (System.in);
//            String input = "";
//            while(!input.equalsIgnoreCase("quit")){
//                System.out.println("Ketik 'quit' untuk keluar: ");
//                input = sc.next();
//                System.out.println(input);
//            }
            
//            int i = 1;
//            while(i<10){
//                if(i==5){
//                    System.out.println(i+"adalah angka 2");
//                } else{
//                    System.out.println(i);
//                }
//                i++;
//            }
    }
    
    

