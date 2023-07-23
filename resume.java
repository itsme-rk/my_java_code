import java.util.Scanner;
interface resume {
public void boidata();

void biodata();
}

class teacher implements resume{
	String name;
	String emailid;
	long phone;
	int age;
	String address;
	String qualification;
	String achievements;
	Float experience;
	@Override
	public void biodata(){
		System.out.println("teachers details");
		System.out.println("NAME " +name);
		System.out.println("EMAIL ID "  +emailid);
		System.out.println("PHONE NUMBER " +phone);
		System.out.println("AGE " +age);
		System.out.println("ADDRESS " +address);
		System.out.println("QUaLIFIcTION " +qualification);
		System.out.println("ACHIEVEMNET  " +achievements);
		System.out.println("EXPERIENCE " +experience);
	}
}
class student_resume implements resume{
	String name;
	String emailid;
	long phone;
	int age;
	String address;
	Double results;
	String disipline;
	@Override
	public void biodata() {
	System.out.println("STUDENT DETAILS ");
	System.out.println("NAME " +name);
	System.out.println("EMAIL ID " +emailid);
	System.out.println("PHONE NUMBER " +phone);
	System.out.println("AGE " +age);
	System.out.println("ADRESS " +address);
	System.out.println("RESULTS " +results);
	System.out.println("DISIPLINE " +disipline);
}


	public static void main(String[] args) {
		teacher t=new teacher();
		student_resume s=new student_resume();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the name of teacher:");
		t.name=sc.next();
		System.out.println("enter the emailid of teacher:");
		t.emailid=sc.next();
		System.out.println("enter the phone number of teacher:");
		t.phone=sc.nextLong();
		System.out.println("enter the age of teacher:");
		t.age=sc.nextInt();
		System.out.println("enter the address of teacher:");
		t.address=sc.next();
		System.out.println("enter the qualification of teacher:");
		t.qualification=sc.next();
		System.out.println("enter the achievemnets of teacher:");
		t.achievements=sc.next();
		System.out.println("enter the experience of teacher:");
		t.experience=sc.nextFloat();
		t.biodata();
		System.out.println("enter the name of Student:");
		s.name=sc.next();
		System.out.println("enter the emailid of Student:");
		s.emailid=sc.next();
		System.out.println("enter the phone number of Studentr:");
		s.phone=sc.nextLong();
		System.out.println("enter the age of Student:");
		s.age=sc.nextInt();
		System.out.println("enter the address of Student:");
		s.address=sc.next();
		System.out.println("enter the results of Student:");
		s.results=sc.nextDouble();
		System.out.println("enter the DISIPLINE of Student:");
		s.disipline=sc.next();
		s.biodata();
		sc.close();
		
	}
}