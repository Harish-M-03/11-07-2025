import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int mini=Integer.MAX_VALUE;
		int maxi=Integer.MIN_VALUE;
		int[] num=new int[n];
		for(int i=0;i<n;i++){
		    num[i]=sc.nextInt();
		    mini=Math.min(mini,num[i]);
		}
		for(int i=0;i<n;i++){
		    if(mini==num[i]){
		        int index=i+1;
		        while(index<num.length){
		            maxi=Math.max(maxi,(num[index]-mini));
		            index++;
		        }
		    }
		}
		System.out.print("Maximum Profit earned : "+maxi);
	}
}
