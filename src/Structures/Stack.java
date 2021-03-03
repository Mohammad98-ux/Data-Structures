package Structures;

public class Stack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public Stack(int s){
        maxSize=s;
        stackArray=new long[s];
        top=-1;
    }//End constructor
    public boolean isEmpty()
    {
        return (top == -1);
    }//End Function isEmpty
    public int size(){
        return top+1;
    }

    public void push(long j){
        if (top==stackArray.length-1){
            System.out.println("stack is full");
        }
        stackArray[++top]=j;
    }//End Function push

    public long pop(){
        if (isEmpty()){
            System.out.println("stack is empty");
        }
        long item=stackArray[top];
        top--;
        return item;
    }//End Function pop

    public long peek()
    {
        return stackArray[top];
    }//End function peek

    public boolean isFull()
    {
        return (top == maxSize-1);
    }//End isFull


}
