import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp=sc.next();
        if(30>temp>50){
            System.out.println("Fan ON");
        }else{
            System.out.println("Fan OFF");
        }
        
    }
}