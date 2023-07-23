import java.util.Scanner;
public class staff_details {
	String staffid;
	String name;
	String phone;
	double salary;
	public static void main(String[] args) {
		String dom,per,skill,pub;
		Scanner sc = new Scanner(System.in);
	    teaching t1= new teaching();
	    technical t2 = new technical();
	    contract t3 = new contract();
	    System.out.println("ENTEr TEACHING STAFF DETAILS:");
	    System.out.println("enter staff id of staff:");
	    t1.staffid=sc.next();
	    System.out.println("enter name:");
	    t1.name=sc.next();
	    System.out.println("enter phone");
	    t1.phone=sc.next();
	    System.out.println("enter salary");
	    t1.salary=sc.nextDouble();
	    System.out.println("enter domain");
	    dom=sc.next();
	    System.out.println("enter publication");
	    pub=sc.next();  
	    System.out.println("ENTEr TEchincal STAFF DETAILS:");
	    System.out.println("enter staff id of staff:");
	    t2.staffid=sc.next();
	    System.out.println("enter name:");
	    t2.name=sc.next();
	    System.out.println("enter phone");
	    t2.phone=sc.next();
	    System.out.println("enter salary");
	    t2.salary=sc.nextDouble();
	    System.out.println("enter skills");
	    skill=sc.next();
	    System.out.println("ENTEr Contractor STAFF DETAILS:");
	    System.out.println("enter staff id of staff:");
	    t3.staffid=sc.next();
	    System.out.println("enter name:");
	    t3.name=sc.next();
	    System.out.println("enter phone");
	    t3.phone=sc.next();
	    System.out.println("enter salary");
	    t3.salary=sc.nextDouble();
	    System.out.println("enter period");
	    per=sc.next();
	    t1.display(dom,pub);
	    t2.display(skill);
	    t3.display(per);
	    sc.close();
	    }

}
class teaching extends staff_details{
	String domain;
	String publication;
	void display(String dom,String pub) {
		domain=dom;
		publication=pub;
		System.out.println("THE TEACHERS DETAILS!!:");
		System.out.println("STAFFIS:" +staffid);
		System.out.println("NAME:" +name);
		System.out.println("PHONE:"+phone);
		System.out.println("Salary:" +salary);
		System.out.println("DOMAIN:" +domain);
		System.out.println("PUBLICATION:"+publication);
		
	}
}
class technical extends staff_details{
	String skills;
	void display(String skill) {
		skills=skill;
		System.out.println("THE technical DETAILS!!:");
		System.out.println("STAFFIS:" +staffid);
		System.out.println("NAME:" +name);
		System.out.println("PHONE:"+phone);
		System.out.println("Salary:" +salary);
		System.out.println("SKILLS:" +skills);
	}
}
class contract extends staff_details{
	String period;
	void display(String per) {
		period=per;
		System.out.println("THE contractor DETAILS!!:");
		System.out.println("STAFFIS:" +staffid);
		System.out.println("NAME:" +name);
		System.out.println("PHONE:"+phone);
		System.out.println("Salary:" +salary);
		System.out.println("PERIOD:" +period);
	}
}
	