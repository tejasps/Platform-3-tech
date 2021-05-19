import java.util.Scanner;

public class TestCharCount {

	public static void main(String[] args) {
				
			Scanner sc = new Scanner(System.in);
				System.out.println("Please Enter The Required String");
				
				String str = sc.next();
				String result  = frequencyCount(str);
							}
				
				public static String frequencyCount(String str)
				{
					
					while(str.length()>0)
					{
						
						char ch = str.charAt(0);
					System.out.println(ch+" "+countChar(str, ch));	
						str = str.replace("" + ch, "");
					}
					return str;
					
					
				}

	public static int countChar(String str, char ch) {
		int count = 0;
		while (str.indexOf(ch) != -1) {
			count++;
			str = str.substring((str.indexOf(ch)+1));
		}

	
		return count;
	}

}
