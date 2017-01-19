import java.util.Scanner;
public class JavaTutorial2 {
	public static void main(String[] args){
		Scanner inet = new Scanner(System.in);
		int age;
		System.out.println("How old are you?");
		age=inet.nextInt();
		age=age/3;
		if (age>=21)
			System.out.println("You are old enough to drink");
		else
			System.out.println("You are not old enough to drink");
	}
	

}
