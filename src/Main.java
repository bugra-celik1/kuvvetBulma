import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        n = scan.nextInt();

        for(int i =1;i<=n;i*=4){
            System.out.println(i);
        }
        for(int j =1;j<=n;j*=5){
            System.out.println(j);
        }
    }
}