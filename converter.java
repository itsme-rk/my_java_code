package converter;
import java.util.*;
import java.text.DecimalFormat;
public class converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double rupee,dollar,yen,euro,meter,kilometer,miles,hours,min,sec;
		int ch;
		DecimalFormat f=new DecimalFormat("##.###");
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("ENTER YOUR CHOICE \n 1] CURRENCY CONVERTER \n 2] DISTANCE CONVERTER \n 3] TIME CONVERTER \n 4] EXIT ");
			ch=sc.nextInt();
			switch(ch) {
			case 1: 
				System.out.println("ENTER AMOUNT IN DOLLARS TO CONVERT TO RUPEES:");
				dollar=sc.nextFloat();
				rupee=dollar*75;
				System.out.println("RUPEES:" +f.format(rupee));
				System.out.println("ENTER AMOUNT IN YEN TO CONVERT TO RUPEES:");
				yen=sc.nextFloat();
				rupee=yen/0.59;
				System.out.println("RUPEES:" +f.format(rupee));
				System.out.println("ENTER AMOUNT IN EURO TO CONVERT TO RUPEES:");
				euro=sc.nextFloat();
				rupee=euro*85;
				System.out.println("RUPEES:" +f.format(rupee));
				System.out.println("ENTER AMOUNT IN RUPEES TO CONVERT TO DOLLARS:");
				rupee=sc.nextFloat();
				dollar=rupee/75;
				System.out.println("DOLLARS:" +f.format(dollar));
				System.out.println("ENTER AMOUNT IN RUPEES TO CONVERT TO YEN:");
				rupee=sc.nextFloat();
				yen=rupee*0.59;
				System.out.println("YEN:" +f.format(yen));
				System.out.println("ENTER AMOUNT IN RUPEES TO CONVERT TO EURO:");
				rupee=sc.nextFloat();
				euro=rupee/75;
				System.out.println("EURO:" +f.format(euro));
				break;
			case 2:
				System.out.println("ENTER IN METER TO CONVERT TO KILOMETER");
				meter=sc.nextFloat();
				kilometer=meter/1000;
				System.out.println("KILOMETER:"+f.format(kilometer));
				System.out.println("ENTER IN MILES TO CONVERT TO KILOMETER");
				miles=sc.nextFloat();
				kilometer=miles/1.60934;
				System.out.println("KILOMETER:"+f.format(kilometer));
				System.out.println("ENTER IN KILOMETER TO CONVERT TO METER");
				kilometer=sc.nextFloat();
				meter=kilometer*1000;
				System.out.println("METER:"+f.format(meter));
				System.out.println("ENTER IN kilometer TO CONVERT TO miles");
				kilometer=sc.nextFloat();
				miles=kilometer*1.60934;
				System.out.println("KILOMETER:"+f.format(kilometer));
				break;
			case 3:
				System.out.println("ENTER IN HOURS TO CONVERT TO MINUTES");
				hours=sc.nextFloat();
			    min=hours*60;
				System.out.println("MINUTES:"+f.format(min));
				System.out.println("ENTER IN HOURS TO CONVERT TO SECONDS");
				hours=sc.nextFloat();
			    sec=hours*3600;
				System.out.println("SECONDS:"+f.format(sec));
				System.out.println("ENTER IN MINUTES TO CONVERT TO HOURS");
				min=sc.nextFloat();
			    hours=min/60;
				System.out.println("HOURS:"+f.format(hours));
				System.out.println("ENTER IN SECONDS TO CONVERT TO HOURS");
				sec=sc.nextFloat();
			    hours=sec/3600;
				System.out.println("HOURS:"+f.format(hours));
				break;
			case 4: System.out.println("EXITING THE PROGRAM__BYE_BYEEE!!!");
					System.exit(0);
					sc.close();
			}
		}
		

	}

}
