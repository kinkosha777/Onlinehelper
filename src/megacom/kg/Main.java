package megacom.kg;

import megacom.kg.models.Ticket;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Queue<Ticket> queue = new PriorityQueue<>(Collections.reverseOrder());

        Ticket ticket = new Ticket(1000,true);
        Ticket ticket1 = new Ticket(500,false);
        Ticket ticket2 = new Ticket(500,false);
        Ticket ticket3 = new Ticket(1000,true);
        Ticket ticket4 = new Ticket(500,false);
        Ticket ticket5 = new Ticket(500,false);
        Ticket ticket6 = new Ticket(1000,true);

        Queue<Ticket> queue1 = new PriorityQueue<>(Collections.reverseOrder());

        Ticket ticket7 = new Ticket(1000,true);
        Ticket ticket8 = new Ticket(1000,true);
        Ticket ticket9 = new Ticket(500,false);
        Ticket ticket10 = new Ticket(1000,true);
        Ticket ticket11 = new Ticket(500,false);
        Ticket ticket12 = new Ticket(1000,true);
        Ticket ticket13 = new Ticket(500,false);

        queue1.offer(ticket7);
        System.out.println(queue1);
        queue1.offer(ticket10);
        System.out.println(queue1);
        queue1.offer(ticket8);
        System.out.println(queue1);
        queue1.offer(ticket11);
        System.out.println(queue1);
        queue1.offer(ticket9);
        System.out.println(queue1);
        queue1.offer(ticket12);
        System.out.println(queue1);
        queue1.offer(ticket13);
        System.out.println(queue1);

        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());

        queue.offer(ticket);
        System.out.println(queue);
        queue.offer(ticket6);
        System.out.println(queue);
        queue.offer(ticket3);
        System.out.println(queue);
        queue.offer(ticket4);
        System.out.println(queue);
        queue.offer(ticket5);
        System.out.println(queue);
        queue.offer(ticket2);
        System.out.println(queue);
        queue.offer(ticket1);
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());



    }
}
