
public class DoublyLinkedList {
	   
       private Link head;
       private int size;
       public DoublyLinkedList() {
    	   head = null;
    	   size = 0;
       }
       public void addFront(int data) {
    	     if(head==null)
    	    	 head = new Link(null, data ,head);
    	     else {
    	    	 Link newLink = new Link(null, data, head);
    	    	 head.previous = newLink;
    	    	 head = newLink;
    	     }
    	     size++;
    	     
       }
       public void addRear(int data) {
    	   if(head == null)
    		   head = new Link(null, data, null);
    	   else {
    		   Link current = head;
    		   while(current.next != null) {
    			   current = current.next;
    		   }
    		   Link newLink = new Link(current, data, null);
    		   current.next = newLink;
    	   }
    	   size++;
       }
       public void removeFront() {
    	   if(head == null)return;
    	   head= head.next;
    	   head.previous = null;
    	   size--;
       }
       public void removeRear() {
    	   if(head == null) return;
    	   
    	   if(head.next == null) {
    	   head = null;
    	   size--;
    	   return;
       }
       Link current = head;
       while(current.next.next != null) {
       current = current.next;
       }
       current.next = null;
       size--;
       }
       public void insertAt(int data, int index) {
    	   if(head == null) return;
    	   if(index < 1|| index > size) return;
    	   
    	   Link current = head;
    	   int i = 1;
    	   while(i < index) {
    		   current = current.next;
    		   i++;
    	   }
    	   if(current.previous == null) {
    		   Link newLink = new Link(null, data, current);
    		   current.previous = newLink;
    		   head = newLink;
    	   }
    	   else {
    		   Link newLink = new Link(current.previous, data, current);
    		   current.previous.next = newLink;
    		   current.previous = newLink;
    	   }
    	   size++;
       }
       public void removeAt(int index) {
    	   if(head == null) return;
    	   if(index < 1 || index >size) return;
    	   
    	   Link current = head;
    	   int i = 1;
    	   while(i < index) {
    		   current = current.next;
    		   i++;
    	   }
    	   if(current.next == null) {
    		   current.previous.next = null;
    	   }
    	   else if(current.previous == null) {
    		   current = current.next;
    		   current.previous = null;
    		   head = current;
    	   }
    	   else
    	   {
    		   current.previous.next =current.next;
    		   current.next.previous = current.previous; 		   
    	   }
    	   size--;
       }
      
       
       public int size() {
    	   return size;
       }
       public void print() {
    	   Link current = head;
    	   while(current != null) {
    		   System.out.println(current.Data());
    		   current = current.next;
    	   }
       }
       public boolean isEmpty() {
    	   return head == null;
       }
	public static void main(String[] args) {
		DoublyLinkedList DoublyList = new DoublyLinkedList();
		System.out.println(" adding on the front");
		System.out.println();
		 DoublyList.addFront(5);
		 DoublyList.addFront(20);
		 DoublyList.addFront(21);
		 DoublyList.addFront(22);
		 DoublyList.print();
		System.out.println();
		System.out.println(" adding on the rear");
		System.out.println();
		 DoublyList.addRear(10);
		 DoublyList.addRear(11);
		 DoublyList.addRear(12);
		
		 DoublyList.print();
		
		System.out.println();
		System.out.println(" removing from the front");
		 DoublyList.removeFront();
		 DoublyList.removeFront();
		 DoublyList.print();
		System.out.println();
		System.out.println(" removing from the rear");
		System.out.println();
		 DoublyList.removeRear();
		 DoublyList.removeRear();
		 DoublyList.print();
		System.out.println("size  " +  DoublyList.size());
		System.out.println(" inserting At");
		// DoublyList.insertAt(15,1);
		// DoublyList.insertAt(15,2);
		 DoublyList.insertAt(15,3);
		 DoublyList.insertAt(15,4);
		 DoublyList.insertAt(45, 1);
		 DoublyList.print();
		System.out.println("size  " +  DoublyList.size());
		System.out.println("removing At");
		 DoublyList.removeAt(1);
		 DoublyList.removeAt(2);
		 DoublyList.removeAt(2);
		 DoublyList.removeAt(3);
		 DoublyList.print();
		System.out.println("size  " +  DoublyList.size());
		
	}

}
  









 