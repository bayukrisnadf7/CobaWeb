package latian;

import java.util.Scanner;


public class Rekursif {
    
    
//    public static int faktorial(int x){
//        if(x==1){
//            return x;
//        } else{
//            return x*faktorial(x-1);
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner (System.in);
//        System.out.print("Masukan Bilangan : ");
//        int a = sc.nextInt();
//        System.out.println("Hasil dari faktorial"+ a+"="+faktorial(a));
//    }
    
//   public static int fibbon(int x){
//       if(x<=0 || x<=1){
//           return x;
//       } else {
//           return fibbon(x-2)+fibbon(x-1);
//       }
//   }
//   public static void main(String[]args){
//       int a = 10;
//       for (int i = 0; i < 10; i++) {
//           System.out.println("Fibbon"+i+"="+fibbon(i));
//           
//       }
//   }
    
//    public static int nilai(int number, int index){
//        if(index==1)
//            return 1;
//        else if (number % index == 0)
//            return 1 + nilai(number, --index);
//        else
//            return 0 + nilai(number, --index);
//    }
//    public static boolean cekNilai(int num){
//        if(num>1)
//            return (nilai(num,num)==2);
//        else
//            return false;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        System.out.print("Masukan angka : ");
//        int a = sc.nextInt();
//        if(cekNilai(a)){
//            System.out.println("Bilangan Priam");
//        } else{
//            System.out.println("Bukan Bilangan Prima");
//        }
//    }
      
//    public static void duaKarakter(String a, int b){
//        if(b==0){
//            System.out.println(a+" ");
//        } else {
//            for (int i = 97; i < 99; i++) {
//                duaKarakter(a+(char)i,b-1);
//            }
//        }
//    }
//    public static void main(String[] args) {
//        duaKarakter("", 2);
//    }
    public static int pangkat(int x, int y){
        if(y==0)
            return 1;
        else
            return x*pangkat(x,y-1);
    }
    public static void main(String[] args) {
        System.out.println("Bil x pangkat y : ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilangan x : ");
        int x = sc.nextInt();
        System.out.println("Bilangan y : ");
        int y = sc.nextInt();
        
        System.out.println(x+"dipangkatkan"+y+"="+pangkat(x,y));
    }
}


