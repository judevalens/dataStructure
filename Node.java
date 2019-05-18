public class Node{
  String value;
  Node next;

  public Node(String v){
    value = v;
    next  = null;
  }

  public void setNext(Node n){
    if(next == null){
    next = n;
    }else{
      next.setNext(n);
    }
  }

  public String get(){
    if(next == null){
      return value;
    }
    return value + next.get();
  }

  public void remove(int i){
    
  }
}
