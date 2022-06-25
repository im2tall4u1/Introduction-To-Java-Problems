import java.util.Scanner;

class AsciValue{

	public static void main(String[] args){

	Scanner sc=new Scanner(System.in);

	int num;

	char ch;

	int i=0;

	System.out.println("Enter the digits:");

	while(i<4){

		num=sc.nextInt();

		ch = (char) num;

		System.out.println(num +"-" +ch);

		i++;

	}

}



}
