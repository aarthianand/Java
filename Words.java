import java.util.Scanner;
public class Words
{
public static void main(String arg[])
{
	String word;
	Scanner scannerObj=new Scanner(System.in);
	System.out.println("Enter");
	word=scannerObj.nextLine();
	int count=1;
	for(int i=0;i<word.length()-1;i++)
	{
		if((word.charAt(i)==' ') && (word.charAt(i+1)!=' '))
	{
		count++;
	}
	}
		System.out.println("No of words="+count);
}
}