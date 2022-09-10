
class HI implements Runnable{
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

class HELLO implements Runnable{
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

public class RunnableExample {
	public static void main(String[] args) {
		HI hi=new HI();
        HELLO hello=new HELLO();

        Thread t1=new Thread(hi);
        Thread t2=new Thread(hello);

        t1.start();
        try{ Thread.sleep(10); }catch(Exception e){ System.out.println(e);}
        t2.start();
	}
}

