/*
Thread safety is when the collections are run synchronously for operation of read/write/delete
not safe when they are async
Vector & ArrayList @ Stack (extends vector) are Sync
Linkedlist is Async  -- internally Doubly LL

@Testing - increase for loop to 1000 for both and you can see differences

@Author Atul Kumar Gupta
*/

import java.util.*;

public class ThreadSafe extends Thread{
    public static void main(String[] args){
        // LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list);
        Thread t1 = new Thread( () -> {
            for(int i = 0; i< 100; i++){
                System.out.println("Inside t1");
                list.add(i);
            }
        });

        Thread t2 = new Thread( () -> {
            for(int i = 0; i< 100; i++){
                System.out.println("Inside t2");
                list.add(i);
            }
        });

        t1.start();
        t2.start();
        try {
            System.out.println("run when t1 and t2 is finshed");
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(list.size());
        
    }
}


