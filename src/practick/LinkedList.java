package practick;

public class LinkedList {
    Node element;
    public LinkedList() {
        element=null;
        //PUT YOUR CODE HERE
        //PUT YOUR CODE HERE
    }

    public void add(Integer data) {
        Node a=new Node();
        a.setData(data);
        Node current= element;
        if (current==null){
            element=a;
            return;
        }
        while (current.getNext()!=null){
            current=current.getNext();
        }
        element.setNext(a);

        //PUT YOUR CODE HERE
    }

    public Integer get(int index) {
        if(index<=0){
            return -1;
        }
        Node current=element;
        for(int c=1;c<index;c++) {
            current = current.getNext();
        }

        return current.getData();
    }

    public boolean delete(int index) {
        //переменна до має бути рівна попередньому елементу списка
        Node before=null;
        //переменна після має бути рівна наступному елементу списка
        Node current=element;
        if (index==0){
            return false;
        }
        else {
        for(int c=1;c<index;c++){
            before=current;
            if (current.getNext()!=null)
            current=current.getNext();
            else return false;
        }
        return true;}
    }

    public int size() {

        //PUT YOUR CODE HERE
        //PUT YOUR CODE HERE
        return 5;
    }
}
