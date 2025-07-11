import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		int ageResult=0;
		if(age<0){
		    ageResult=-1;
		}else if(age>=0&&age<=5){
		    ageResult=0;
		}else if(age>=6&&age<=12){
		    ageResult=1;
		}else if(age>=13&&age<=19){
		   ageResult=2;
		}else if(age>=20&&age<=50){
		     ageResult=3;
		}else if(age>=51&&age<=60){
		    ageResult=4;
		}else if(age>=61&&age<=100){
		     ageResult=5;
		}else{
		    ageResult=-1;
		}
		System.out.print(ageResult);
	}
}
