package threads_java;

class HI extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
        System.out.println("HI");
        try{
        Thread.sleep(1000);
        }catch(Exception e){
            System.out.println(e);
        }
        }
    }
}

class HELLO extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("HELLO");
        try{
        Thread.sleep(1000);
        }catch(Exception e){
            System.out.println(e);
        }
        }
    }
}

public class ThreadExample {

	public static void main(String[] args) {
		HI hi=new HI();
        HELLO hello=new HELLO();
        
        hi.start();
        try{ Thread.sleep(10); }catch(Exception e){ System.out.println(e);}
        hello.start();

	}

}
