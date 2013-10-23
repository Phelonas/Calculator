import java.ulti.*;
public class calculator{
	public void main (String []args){
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Bitte eingeben [+/-] :");
		String operation  = scanner.next();
		int a= scanner.nextInt();
		int b = scanner.nextInt();
		if(operation.equals("-")){
			int result = a-b;
			System.out.println(a+"-"+ b+"="+result);
		}
	}
}