class Node{
    int data;
    Node next;
    Node(int data){
        this.data =data;
    }
}
class linkedlist{ 
     Node head,tail;
public void insert(int data){
   
        Node n= new Node(data);
        n.next=null;
        if(head==null){
            head=n;
            tail=n;
           
        }
            else{
              
                tail.next=n;
                tail=n;
            }
        }

public void display(){
    Node temp=head;
    while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
    }
}
}

public class Main{
    public static void main(String [] args){
        linkedlist l=new linkedlist();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.display();
    }
}