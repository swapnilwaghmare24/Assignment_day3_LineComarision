import java.util.Scanner;
import static java.lang.Math.*;
public class LineComparision
{
	Scanner sc = new Scanner(System.in);
	int x1,y1,x2,y2;
	void getCoordinates()
	{
		System.out.println("Enter starting co-ordinates of line");
		x1=sc.nextInt();
		y1=sc.nextInt();
		System.out.println("Enter ending co-ordinates of line");
		x2=sc.nextInt();
		y2=sc.nextInt();
		
	}
	
	String calLength()
	{
		
		String length=String.valueOf(Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
		return length;
	}
	
	void useEqualsToCheck(String length1,String length2)
	{
		if(length1.equals(length2))
		{
			System.out.println("Line1 and Line2 are equal");
		}
		else
		{
			System.out.println("Line1 and Line2 are not equal");	
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Welcome to line comparision computation program");
		LineComparision lc = new LineComparision();
		System.out.println("Enter co-ordinates for line1");
		lc.getCoordinates();
		String length1=lc.calLength();
		System.out.println("Length of line1 is "+length1);
		System.out.println("Enter co-ordinates for line2");
		lc.getCoordinates();
		String length2=lc.calLength();
		System.out.println("Length of line1 is "+length2);
		lc.useEqualsToCheck(length1,length2);
		
	}
}