class Main {
  public static void main(String[] args) {
    LinkedList l = new LinkedList();

    Node h = new Node("h");
    Node e  = new Node("e");
    Node ll=  new Node("ll");
    Node o=  new Node("o");

    l.add(h);
    l.add(e);
    l.add(ll);
    l.add(o);


    System.out.print(l.print());
  }
}
