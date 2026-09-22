//Convert digits to string ( i/p → 1253 → One Two five three)

package Basicprograme;

public class HWDigitstoString {

	public static void main(String[] args) {
		
		
		String a= "1253";
		
		for (int i=0;i<a.length();i++)
		{
			if (a.charAt(i)=='0')
				System.out.println("Zero");
			
			else if (a.charAt(i)=='1')
				System.out.println("One");
			
			else if (a.charAt(i)=='2')
				System.out.println("Two");
				
			else if (a.charAt(i)=='3')
				System.out.println("Three");
				
			else if (a.charAt(i)=='4')
				System.out.println("Four");
				
			else if (a.charAt(i)=='5')
				System.out.println("Five");
				
			else if (a.charAt(i)== '6')
				System.out.println("Six");
				
			else if (a.charAt(i)== '7')
				System.out.println("Seven");
				
			else if (a.charAt(i)=='8')
				System.out.println("Eight");
				
			else if (a.charAt(i)=='9')
				System.out.println("Nine");
				
				
				
		}

	}

}
