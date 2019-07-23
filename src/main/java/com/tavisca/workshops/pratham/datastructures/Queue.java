package com.tavisca.workshops.pratham.datastructures;

import java.util.ArrayList;

public class Queue<generic> {
    public static int defaultCapacity;
    private ArrayList<generic> queue;
    private int size;
    private int currentSize;
    private int rear;
    private int front;

    Queue(){
        size=currentSize=0;
        front=rear=-1;
    }

    Queue(int capacity) {
        size=capacity;
        queue=new ArrayList<generic>(size);
        for(int i=0;i<size;i++)
            queue.add(null);
        front=rear=-1;
        currentSize=0;
    }

    public void add(generic value) throws QueueFullException {
        if(isFull())
            throw new QueueFullException();
        else
        {
            rear = (rear+1)%size;
            queue.set(rear,value);
            currentSize++;
            if(front==-1)
                front=rear;
        }
    }

    public generic remove() throws QueueEmptyException {
        generic popValue;
        if(isEmpty())
            throw new QueueEmptyException();
        else
        {
            popValue=queue.get(front);
            //queue.remove(front);
            front=(front+1)%size;
            currentSize--;
        }
        return popValue;
    }

    public boolean isEmpty(){
        return (currentSize==0);
    }

    public boolean isFull(){
        return (currentSize==size);
    }

    public int capacity()
    {
        return size-currentSize;
    }

    public static class QueueFullException extends RuntimeException {
        @Override
        public String toString() {
            return "Queue is full";
        }
    }

    public static class QueueEmptyException extends RuntimeException {
        @Override
        public String toString() {
            return "Queue is empty";
        }
    }
}
