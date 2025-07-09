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
        public void insertAtpos(int pos,int data){
            if(pos==0){
                Node newnode=new Node(data);
                newnode.next=head;
                head=newnode;
                return;
            }
            Node newnode=new Node(data);
            Node temp=head;
            for(int i=1;i<pos;i++){
                temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
        }
        public void deleteval(int data){
            if(head==null){
               System.out.println("List is empty");
            }
            if(head.data==data){
                head=head.next;
                return;
            }
            Node prev=head;
            Node temp=head.next;
            while(temp!=null){
                if(temp.data==data){
                    prev.next=temp.next;
                    
                }
            }
        }
        public void delete(int pos){
            Node prev=null;
            Node temp=head;
            for(int i=1;i<=pos;i++){
                prev=temp;
                temp=temp.next; 
            }
            prev.next=temp.next;
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
        l.insertAtpos(2,40);
        l.insertAtpos(0,70);
        l.delete(2);
        l.deleteval(70);
        l.display();
    }
}