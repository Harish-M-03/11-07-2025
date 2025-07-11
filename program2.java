import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int result=0;
		while(temp!=0){
		    int rem=temp%10;
		    result+=(rem*rem);
		    temp/=10;
		}
		System.out.print(result);
	}
}
