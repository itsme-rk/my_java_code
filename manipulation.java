import java.util.ArrayList;
import java.util.Scanner;
public class manipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj= new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		int i,j;
		int c,ch;
		String str,str1;
		do {
			System.out.println("STRING MANIPULATION");
			System.out.println("********************");
			System.out.println("1. append at end \t 2.insert at particular index \t3.serach \t 4.list strings sarting with a letter\t");
			System.out.println("enter the choice");
			c=sc.nextInt();
			switch(c) {
			case 1:
			{
				System.out.println("enter a string");
				str=sc.next();
				obj.add(str);
				break;
			}
			case 2:
			{
				System.out.println("enetr the sring");
				str=sc.next();
				System.out.println("specify the loc to insert: ");
				i=sc.nextInt();
				obj.add(i-1,str);
				System.out.println("ARRAY LIST HAS FOLLOWING ELEMENT:" +obj);
				break;
			}
			case 3:
			{
				System.out.println("enter the string to search:");
				str=sc.next();
				j=obj.indexOf(str);
				if(j==1) {
					System.out.println("element not found ");
				}
				else {
					System.out.println("index of : " +str+ "is" +j);
					break;
				}}
				case 4:
					{
						System.out.println("enetr char for list that starts with specified character");
						str=sc.next();
						for(i=0;i<(obj.size());i++){
							str1=obj.get(i);
							if((str1).startsWith(str))
							{
								System.out.println(str1);
								
							}
						}break;
						
					}
				
			}System.out.println("press 0 to exit and 1 to continue");
			ch=sc.nextInt();
				
			}while(ch==1);
sc.close();
	}

}
