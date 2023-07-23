import java.util.Scanner;

class student {
String name;
String usn;
String branch;
Long phone;
void display()
{
	System.out.println("name is"+name);
	System.out.println("usn is"+usn);
	System.out.println("branch is"+branch);
	System.out.println("phone numvber is"+phone);

}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	int n;
	student s[]= new student[100];
  Scanner cs = new Scanner(System.in);
		System.out.println("enter the number of students");
		n=cs.nextInt();
		for(int i=0;i<n;i++)
		{
			s[i]= new student();
			System.out.println("enter the name of the student");
			s[i].name= cs.next();
			System.out.println("enter the usn");
			s[i].usn= cs.next();
			System.out.println("enter the branch");
			s[i].branch= cs.next();
			System.out.println("enter the phone number");
			s[i].phone= cs.nextLong();
		}
		
	System.out.println("STUdENT DETAILS:");
	for(int i=0;i<n;i++) {
		System.out.println("details of student number" +i );
		s[i].display();
		cs.close();
}

}
}