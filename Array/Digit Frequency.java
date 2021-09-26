import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        getdata(n, d);
        
    }

    public static void getdata(int n, int d) {
    int count=0;
    while(n!=0){
        int temp =n%10;
         if(temp==d)
            count++;
         n=n/10;}
         System.out.println(count);
    }
        
}
