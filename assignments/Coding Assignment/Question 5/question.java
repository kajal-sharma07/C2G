import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color=sc.next();
        if(color.equals("Red")){
            System.out.println("Stop");
        }else if(color.equals("Green")){
            System.out.println("Go");
        }else{
            System.out.println(" Wait");
        }
        
    }
}