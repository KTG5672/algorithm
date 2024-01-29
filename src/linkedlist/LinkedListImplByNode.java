package linkedList;

public class LinkedListImplByNode implements LinkedList {
    
    private int size = 0;
    private Node head;
    private Node first;
    
    @Override
    public void traverse() {
        Node search = first;
        while (search != null){
            System.out.print(search.getData() + " ");
            search = search.getNext();
        }
        System.out.println();
    }
    
    @Override
    public void insert(int index, int data) {
        
        if (index > size) {
            throw new IndexOutOfBoundsException(this + " : "+ index);
        }
        
        if (index == size) {
            addLast(data);
            return;
        } else if (index == 0) {
            addFirst(data);
            return;
        }
        
        Node search = first;
        for (int i = 0; i < index; i++) {
            search = search.getNext();
        }
        
        Node newNode = new Node(data);
        
        Node pre = search.getPre();
        newNode.setPre(pre);
        pre.setNext(newNode);
        
        newNode.setNext(search);
        search.setPre(newNode);
        
        size++;
    }
    
    @Override
    public void erase(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException(this + " : "+ index);
        }
        
        if (index == 0) {
            eraseFirst();
            return;
        } else if (index == (size - 1)) {
            eraseLast();
            return;
        }
        
        Node search = first;
        for (int i = 0; i < index; i++) {
            search = search.getNext();
        }
        Node next = search.getNext();
        Node pre = search.getPre();
        next.setPre(pre);
        pre.setNext(next);
        
        size--;
    }
    
    public void eraseFirst() {
        
        if (size == 0) {
            throw new IndexOutOfBoundsException();
        }
        
        Node next = first.getNext();
        if (next != null) {
            next.setPre(null);
        }
        first = next;
        size--;
    }
    
    public void eraseLast() {
        
        if (size == 0) {
            throw new IndexOutOfBoundsException();
        }
        
        Node pre = head.getPre();
        if (pre != null) {
            pre.setNext(null);
        }
        head = pre;
        size--;
    }
    
    public void addLast(int data) {
        Node newNode = new Node(data);
        
        if (size == 0) {
            init(newNode);
            return;
        }
        
        head.setNext(newNode);
        newNode.setPre(head);
        head = newNode;
        
        size++;
    }
    
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (size == 0) {
            init(newNode);
            return;
        }
        
        first.setPre(newNode);
        newNode.setNext(first);
        first = newNode;
        
        size++;
    }
    
    private void init(Node newNode) {
        head = newNode;
        first = newNode;
        size = 1;
        return;
    }
}

class Node {
    private Node next;
    private Node pre;
    private int data;
    
    public Node(int data) {
        this.data = data;
    }
    
    public Node getNext() {
        return next;
    }
    
    public void setNext(Node next) {
        this.next = next;
    }
    
    public Node getPre() {
        return pre;
    }
    
    public void setPre(Node pre) {
        this.pre = pre;
    }
    
    public int getData() {
        return data;
    }

}
