public class Person{
  String type,name,email;
  public Person(String _type,String _name, String _email){
    type=_type;
    name=_name;
    email=_name;
  }

  public String getName(){
    return name;
  }

  public String getNameAndEmail(){
    return name+ " "+email;
  }
}
