//creating a linked list using a class based approach in java
//author: Avishek Mondal
import java.util.Scanner;
import java.util.*;
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
        if(temp==null)
        System.out.println("Linked List is Empty");
        else {
        System.out.print("The linked list is :");
        while (temp != null){
            System.out.print(temp.data+" ") ;
            System.out.println();
            temp = temp.next;
            }
        }
    }
    public void delete(){
        Node temp=head;
        if(temp==null){
            System.out.println("List is Empty");
        }
        else{
        
            System.out.println(temp.data+ "is deleted from the list.");
            temp=temp.next;
            head=temp;
        
    }

    }
}

 class linkedlist2{
public static void main(String[] args){
    Linkedlist ob=new Linkedlist();
    //Menu driven program
    while(true){
    System.out.println("======MENU======");
    System.out.println("1.Insert at beginning");
    System.out.println("2.Delete");
    System.out.println("3.Display");
    int choice,element;
    System.out.print( "Enter your choice: ");
    Scanner sc= new Scanner(System.in);
    choice=sc.nextInt();
    
    switch(choice) {
        case 1:
        System.out.print("Enter element to be inserted: ");
        ob.insert(element=sc.nextInt());
        break;

        case 2:
           
                ob.delete();

            
            break;
            case 3:
            ob.display();
            break;
        default : System.out.println("Invalid Choice!");
        }
    }

   }

}

