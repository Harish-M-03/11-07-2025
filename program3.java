import java.util.Scanner;
public class Main
{
    private static int isOne(int num){
        int temp=num;
		int result=0;
		while(temp!=0){
		    int rem=temp%10;
		    result+=(rem*rem);
		    temp/=10;
		}
		return result;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=isOne(n);
		while(res!=1){
		    res=isOne(res);
		}
		if(res==1){
		    System.out.print("Happy Number");
		}else{
		     System.out.print("Not a Happy Number");
		}
	}
}
