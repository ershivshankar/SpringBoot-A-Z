import java.util.Scanner;
class MovieTicketBook{

   static  int totalticket =7;

    public synchronized void ticketBook(int number){
        if(number<=totalticket){
            totalticket=totalticket-number;
            System.out.println("You Have Sucessffully Booked "+number+"Ticket");
        }else{
            System.out.println("Invalid ! Total Ticket Availale only "+totalticket);
        }

    }

}
class TicketSystem extends Thread{
    int numberofTicketBook;
     MovieTicketBook movie;
    TicketSystem(int numberofTicketBook, MovieTicketBook movie){
        this.numberofTicketBook=numberofTicketBook;
         this.movie=movie;    }

    public void run(){
        movie.ticketBook(numberofTicketBook);
    }
}
public class MovieTicketUsingSynchronization {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MovieTicketBook m1=new MovieTicketBook();

        System.out.println("_____________________WEL_COME TO MOVIE BOOKING SYSTEM _____________________");
        System.out.println(" Please ! Enter Your Number You want to Book Ticket for the select Movie :->");
        TicketSystem t1=new TicketSystem(5,m1);
        TicketSystem t2=new TicketSystem(5,m1);
        t1.start();
        t2.start();
    }
}
