import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentData=sc.nextInt();
        int newPackData=sc.nextInt();
        int carryForward;
        if(currentData<=2){
            carryForward=currentData;
        }else{
            carryForward=2;
        }
        int FinalData=carryForward+newPackData;
        System.out.println(FinalData);
        
        sc.close();
        
    }
}