package arraylist;
import java.util. Scanner;
public class userAray {
	
public static void main(String[]args) {

System.out.println("Enter three points for array");
	
Scanner scan = new Scanner(System.in);

int []numList = new int [5];
for (int i=0;i<5;i++) {
	numList [i] = scan.nextInt();
}
System.out.println(numList[4]);
	



}
}