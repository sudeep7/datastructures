package com.ds.stack;

import com.ds.DataNode;
import sudeep.*;

public class StackImpl<T> {

    private DataNode<T> top;
    private Integer stackLimit = 100; //default size to be 100 element
    private Integer stackSize=0;
    private Boolean SUCCESS=Boolean.TRUE,FAILURE=Boolean.FALSE;


    public StackImpl(T topElement, Integer stackLimit) {
        top = new DataNode<T>(topElement);
        this.stackLimit = stackLimit;
    }

    public StackImpl(T topElement) {
        top = new DataNode<T>(topElement);
    }

    public StackImpl() {
    }
//Define operations

    public T pop() throws Exception {
        if(top == null){
            throw new Exception("Operation Not Permitted. Empty Stack.");
        }
        DataNode<T> data =  new DataNode<>(top.getData());
        top = top.getNext();
        return data.getData();
    }

    public Boolean push(T element) throws Exception{

        if (null != element) {
            if(stackSize == stackLimit){
                throw new Exception("Operation not permitted. Stack is Full.");
            }
            DataNode<T> dataNode = new DataNode<T>(element);
            if (top != null) {
                dataNode.setNext(top);
            }
            top = dataNode;
            return SUCCESS;
        }else{
            throw new Exception("Invalid data. Null value not permitted.");
        }
    }
}
