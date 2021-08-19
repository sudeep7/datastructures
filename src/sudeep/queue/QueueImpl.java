package sudeep.queue;

import sudeep.DataNode;

public class QueueImpl<T> {

    private DataNode<T> front=null, rear=null;
    private Integer queueLimit = 100;
    private Integer queueSize = 0;
    private Boolean SUCCESS = Boolean.TRUE, FAILURE=Boolean.FALSE;

    public QueueImpl(T firstElement, Integer queueLimit) {
        DataNode<T> temp = new DataNode<>(firstElement);
        this.front = temp;
        this.rear = temp;
        this.queueLimit = queueLimit;
        queueSize++;
    }

    public QueueImpl(T firstElement) {
        DataNode<T> temp = new DataNode<>(firstElement);
        this.front = temp;
        this.rear = temp;
        queueSize++;
    }

    public QueueImpl(Integer queueLimit) {
        this.queueLimit = queueLimit;
    }

    public QueueImpl() {
    }

    //Define Operations
    public T deque() throws Exception{
        //Empty Check
        if(queueSize==0)
            throw new Exception("Operation not permitted. Queue is Empty.");

        T data = rear.getData();
        rear = rear.getPrevious();
        queueSize--;
        return data;
    }

    public Boolean enque(T element) throws Exception{
        //Size Check
        if(queueSize == queueLimit){
            throw new Exception("Operation not permitted. Queue is Full.");
        }
        DataNode<T> temp = new DataNode<>(element);
        if(queueSize==0){
            front = rear = temp;
        }

       front.setPrevious(temp);
       temp.setNext(front);
       front=temp;

        queueSize++;
        return SUCCESS;
    }

    public T peek() throws Exception{
        //size check
        if(queueSize==0)
            throw new Exception("Operation not permitted. Queue is Empty.");
        return rear.getData();
    }
}
