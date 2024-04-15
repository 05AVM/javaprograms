//creating a linked list using a class based approach in java
//author: Avishek Mondal

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=next;
    }
}

class Linkedlist{
    Node head;

    public Linkedlist(){
        this.head=null;

    }

    public void insert(int data){
        Node nnode=new Node(data);
        if(head==null)
        head=nnode;
        else {
            Node temp=head;
            while (temp.next!= null){
                temp=temp.next;
            }
            temp.next=nnode;
        }
    }

    public void display(){
        Node temp=head;
        System.out.print("The linked list is :");
        while (temp != null){
            System.out.print(temp.data+" ") ;
            //System.out.println();
            temp = temp.next;
            }
    }
}

 class linkedlist2{
public static void main(String[] args){
    Linkedlist ob=new Linkedlist();
    ob.insert(10);
    ob.insert(20);
    ob.insert(30);
    ob.insert(40);
    ob.insert(50);
    ob.display();
   }

}

