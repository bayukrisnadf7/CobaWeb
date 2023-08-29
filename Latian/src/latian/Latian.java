package latian;

import java.util.Scanner;

public class Latian {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
        
        int pw = 123;
        System.out.print("Masukan pw : ");
        pw = sc.nextInt();
        if (pw == 123) {
            System.out.println("pw benar");
        } else  {
            System.out.println("pw salah");
        }
        System.out.println("");
    }
        while(true);
    }
}
