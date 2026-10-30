import java.util.Scanner;
class CheckThread extends Thread{
    public void run(){
        System.out.println("Hello from Thread TEST");
    }
}
class Timer extends Thread {
    int time;
    Timer(int time){
        this.time=time;
    }
    public void run(){
        try{


        int second=0;
        System.out.println("Timer Started :  MINUTE: "+time +"  Second : "+second);
        second=59;
        while(time>0) {
            second--;
            if (second < 0) {
                time = time - 1;
                second = 59;
            }
            System.out.println("Timer Started :  MINUTE: " + time + "  Second : " + second);
            Thread.sleep(1000);

        }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
public class TimerProjectUsingThreadConcept {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("--------------WEL_COME To Timer------------- ");
        System.out.print("           Please !Enter your time :>                   ");

        int Time=Sc.nextInt();
        Timer t1 = new Timer(Time);
        t1.start();
     /*   CheckThread t2=new CheckThread();
        t2.start();*/

    }
}
