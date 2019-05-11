public class Course {
  private String courseName;
  public int classSize =0;
  private ArrayList<Person> StudentList;
  private ArrayList<Person> mentorList;
  public Course(String _courseName){
    courseName = _courseName;

    StudentList = new ArrayList<Person>();
    mentorList = new ArrayList<Person>();
  }

  public void addStudent(Person s){
    StudentList.add(s);
    classSize++;
  }

  public void setMentor(Person m){
  mentorList.add(m);
  }

  public void removeMentor(Person m){
    mentorList.remove(m);
  }

  public void removeMentor(Person s){
    StudentList.remove(s);
  }

  public void isNanoInTheClass(Person s){
    return StudentList.contains(s);
  }
  
  public void rosterSortedAlphabetically(){
    for(int i =1; i < StudentList.size(); i++){
    int lowest  = 0; 
      for(int j = i; j < StudentList.size(); j++){
        if(StudentList.get(j).getName().compareTo(StudentList.get(lowest).getName()) < 0){
          lowest = j;
        }
      }

      Person s = StudentList.get(lowest);
      StudentList.remove(lowest);
      StudentList.add(i,s); 
    }
  }
