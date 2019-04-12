package practick;

public class LinkedList {
    Node element;

    public LinkedList() {
        element = null;
        //PUT YOUR CODE HERE
        //PUT YOUR CODE HERE
    }

    public void add(Integer data) {
        Node a = new Node();
        a.setData(data);
        Node current = element;
        if (current == null) {
            element = a;
            return;
        }
        //current.setNext(a);
        while (current.getNext() != null) {
            current = current.getNext();
        }
        element.setNext(a);

        //PUT YOUR CODE HERE
    }

    public Integer get(int index) {
        // Отримати елемент по індексу, повертає null якщо такий елемент недоступний
        if (index <= 0) {
            return null;
        }
        Node current = element;
        for (int c = 1; c < index; c++) {
            current = current.getNext();
        }

        return current.getData();
    }

    public boolean delete(int index) {
        //переменна до має бути рівна попередньому елементу списка
        Node before = null;
        //переменна після має бути рівна наступному елементу списка
        Node current = element;
        if (index == 0) {
            return false;
        } else {
            for (int c = 1; c < index; c++) {
                before = current;
                if (current.getNext() != null)
                    current = current.getNext();
                else return false;
            }
            return true;
        }
    }


    public int size() {
        //Повертає розмір списку: якщо елементів в списку нема то повертає 0
        //PUT YOUR CODE HERE
        /*Node current = element;
        if (current == null) {
            return 0;

        } else {
            for (int i = 1; current != null; i++) {
                current = current.getNext();

                int size=i;
                return size;
            }
        }*/
        return 5;
    }
    //PUT YOUR CODE HERE

}
