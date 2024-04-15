import java.util.*;

class linkedlist{
    public static void main(String[] args){
        LinkedList<Integer> ll=new LinkedList<>();
        //to add elements

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);
        ll.add(70);

        //print the linked list
        System.out.println("Linked List: "+ll);

        //removing the 4th element in this list
        //int index = 4;
        int count=0;
        for(int i=0;i<ll.size();i++){
            count=count+1;
            if(count==3) {
                ll.remove(3);
                break;
        }
        

    }
    System.out.println("Linked List: "+ll); 
}

}