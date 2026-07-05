import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		
		if (a>5){
		   System.out.println("greater");
		} else if (a==5){
		    System.out.println("equal");
		} else {
		    System.out.println("Smaller");
		
		
		}
		
	}
}