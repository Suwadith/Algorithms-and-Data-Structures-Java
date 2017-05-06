import java.util.LinkedList;

/**
 * Created by Suwadith on 5/4/2017.
 */

class Queue<obj>{
    LinkedList<obj> queue = new LinkedList<>();

    public void enQueue(obj item){
        queue.addLast(item);
    }

    public void deQueue(){
        queue.poll();
    }

    public obj peek(){
        return queue.peek();
    }

    public int size(){
        return queue.size();
    }

    public boolean isEmpty(){
        if(queue.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}

public class QueueClass {

    public static void main(String[] args) {

        Queue queue = new Queue();

        queue.enQueue(25);
        System.out.println(queue.peek());
        queue.enQueue(30);
        System.out.println(queue.peek());
        queue.deQueue();
        System.out.println(queue.peek());

    }


}


