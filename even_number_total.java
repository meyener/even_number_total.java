import java.util.Scanner;

/**
 * eve_number_total
 */
public class eve_number_total {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int total=0,a,b,c;
        for(boolean d=true; d;){
            System.out.println("lütfen sayı giriniz : ");
            a=scn.nextInt();
            if (a%2==0) {
                total+=a;

                
            } else {System.out.println("toplam : "+total);
                d=false;
                
            }
            
        }
    }
}