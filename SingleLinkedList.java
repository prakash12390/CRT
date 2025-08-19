class LinkedList {
    node head=null;

    void insertBegin(int data){
        if(head==null){
            head=new node(data);
        }
        else{
            node newnode=new node(data);
            newnode.next=head;
            head=newnode;
        }
    }
    void insertMiddle(int data,int pos){
        if(head==null){
            head=new node(data);
        }
        else{
            node newnode=new node(data);
            node temp=head;

           for(int i=0;i<pos&&temp.next!=null;i++){
               temp=temp.next;
           }
            temp.next=newnode;
            newnode.next=temp;
        }
    }
   void deleteBegin(){
        if(head==null){
            return;
        }
        else{
            node temp=head;
            head=head.next;
        }
   }
   void deleteEnd(){
        if(head==null){
            return;
        }
        else{
            node current=head;
            node prev=null;
            while(current.next!=null){
                prev=current;
                current=current.next;
            }
            prev.next=null;

        }
   }

    void insertEnd (int data) {
        node newNode = new node(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void print() {
        node current = head;
        while(current != null) {
            System.out.print(" "+current.data);
            current = current.next;
        }
        System.out.println();
    }
}
public class SingleLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println("insert elements at end:");
       list.insertEnd (4);
       list.insertEnd(5);
       list.insertEnd (6);
       list.insertEnd (7);
       list.print();
       System.out.println("insert element 10 at begin:");
       list.insertBegin(10);
        list.print();
        System.out.println("delete element at Begin:");
        list.deleteBegin();
        list.print();
        System.out.println("delete element at End:");
        list.deleteEnd();
        list.print();



    }
}
