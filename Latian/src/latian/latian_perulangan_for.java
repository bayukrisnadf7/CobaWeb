package latian;

public class latian_perulangan_for {
    public static void main(String[] args) {
        
        System.out.println("----- Segitiga Bertingkat -----");
         int a = 6;
        // count digunakan untuk menambahkan kelipatan berikutnya yang dimulai dari 1
        // kelipatan dari 1,2,3,4,5
        int count = 1;
        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println(" ");
        } 
        
        System.out.println("----- Segitiga Sama Kaki -----");
        for (int i = 1; i <=5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            /*for (int l = 1; l <= i - 1 ; l++) {
                System.out.println("*");
            }*/
            System.out.println(" ");
            
        }
        
        System.out.println("----- Segitiga ----- ");
        int i;
        int y = 0;
        for (i = 1; i < 8; i++) {
            
            for (int x = 3; x > (0+y); x-- ) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                
            }
             i = i + 1;
             y++;
        System.out.println("");
        
        }
    }
}
