import javax.swing.*;
import java.time.LocalTime;
import java.util.Scanner;

class DigitalWatch extends Thread{
    boolean startvalue=true;
    public void stopwatch(){
        startvalue=false;
    }
    public void run(){
        try{


        while(startvalue) {


            LocalTime now = LocalTime.now();
            System.out.println("Current Time :" + "HH  :" + now.getHour() + "   MM  :" + now.getMinute() + "    SS:   " + now.getSecond());
        Thread.sleep(1000);
        }} catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
public class WatchProjectUsingSleepMethod {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc=new Scanner(System.in);
        System.out.println("..........WEL_COME TO DIGITAL WATCH................");
        System.out.println("____________Enter Your Choice ______________________");
        System.out.println("____________Press 1:Start The Watch _________________");
        System.out.println("____________Press 2:Stop The Watch___________________");

        System.out.println("____________Press 3: Exit From Thre Watch___________________");
        while(true){
            int choice =sc.nextInt();
            DigitalWatch watch=new DigitalWatch();

            switch(choice){
                case 1:
                    System.out.println("Watch Statred ");
                   watch.start();
                    break;
                case 2:
                    System.out.println("Digital Watch Sucessfully Stoped");
                    watch.stopwatch();
                    return;

                default:
                    System.out.println("Invalid Choice :Please Re-Enter Your Choice");

            }
        }
    }
}
