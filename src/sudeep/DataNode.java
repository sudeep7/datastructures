package sudeep;

public class DataNode<T> {
    private T data=null;
    private DataNode<T> next =null, previous=null;

    public DataNode(T data, DataNode nextNode, DataNode preNode) {
        this.data = data;
        next = nextNode;
        previous = preNode;
    }

    public DataNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DataNode getNext() {
        return next;
    }

    public void setNext(DataNode<T> nextNode) {
        next = nextNode;
    }

    public DataNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(DataNode<T> preNode) {
        previous = preNode;
    }
}
