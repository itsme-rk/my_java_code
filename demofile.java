import java.io.*;
import java.util.Scanner;
public class demofile {
	void p(String str){
		System.out.println(str);
	}
	void analyze(String s) {
		File f=new File(s);
		if(f.exists()) {
			p(f.getName()+ "is the file name");
			p(f.canRead()? "is readable" : "is not readable");
			p(f.canWrite()? "is writeable" : " is not writeable");
			p("file size is "+f.length()+ "bytes" );
			p("last modified" +f.lastModified());
		}
		else {
			System.out.println("the file " +s+ "is not present" );
		}
	}
	

	public static void main(String[] args) throws IOException{
		demofile fd=new demofile();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the filename");
		String s=sc.nextLine();
		fd.analyze(s);
		sc.close();
}
}