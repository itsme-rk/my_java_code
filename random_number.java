package thread;
import java.util.Random;
class random_number implements Runnable {
	public void run() {
		Random ra=new Random();
		for(int i=0;i<10;i++) {
			int r =ra.nextInt(100);
			System.out.println("the random value is " +r);
			square s=new square(r);
			s.start();
			cube c=new cube(r);
			c.start();
			try {
				Thread.sleep(1000);	
			}catch(InterruptedException ex) {
			System.out.println(ex);
		}
		
		
	}

}
}
class square extends Thread {
	int x;
	public square(int r) {
		x=r;
	}
	public void run()
	{
		int sq;
		sq=x*x;
		System.out.println("THE SQUARE OF THE NUMBER " +x+ " is " +sq);
	
	}
}
class cube extends Thread{
	int x;
	public cube(int r) {
		x=r;
	}public void run(){
		int cu=x*x*x;
		System.out.println("THE CUBE OF THE NUMBER " +x+ " is " +cu);
	}

public static void main(String[] args) {
	random_number n= new random_number();
	Thread t=new Thread(n);
	t.start();
}
}