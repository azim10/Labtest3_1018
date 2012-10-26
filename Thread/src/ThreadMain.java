
public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread mt1=new MyThread();
		AnotherThread at1=new AnotherThread();
		
		mt1.start();
		at1.start();
		/*
		Thread mt2=new Thread(new MyThread());
		Thread at2=new Thread(new AnotherThread());
		

		mt2.start();
		at2.start();*/
	}

}
