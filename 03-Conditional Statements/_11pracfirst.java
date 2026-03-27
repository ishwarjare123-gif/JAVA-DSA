
//Write a Java program to get a number from the user and print whether it is positive or negative 
import java.util.*;

public class pracfirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number<0){
            System.out.println("negative");
        }
        else{
            System.out.println("positive");
        }

    }
    
}
