public class LinkedList{
  Node head;
public LinkedList(){
head = null;
}

public void add(Node n){
  if(head == null){
    head = n;
  }else{
    head.setNext(n);
  }
}

public String print(){
  return head.get();
}
}
