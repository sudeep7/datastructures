package com.ds.queue;

public class QueueMain {

    public static void main(String[] args) throws Exception {
        QueueImpl<Integer> queue = new QueueImpl<Integer>(10,5);
        System.out.println(queue.enque(23));
        System.out.println(queue.enque(25));
        System.out.println(queue.enque(39));
        System.out.println(queue.enque(67));

        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.deque());

    }
}
