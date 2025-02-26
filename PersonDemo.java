class Person{
  String name;
  int age;
  
  public Person(String name, int age){ // contructor with parameters
    this.name = name;
    this.age = age;
  }
  
  public Person(){ // constructor without parameters
    this.name = "Unknown";
    this.age = 0;
  }
  
  public void displayPerson(){
    System.out.println("Name: " + name + ", Age: " + age);
  }
}

public class PersonDemo{
public static void main(String[] args){  //main method
  Person person1 = new Person("Bob", 30);
  Person person2 = new Person();
  
  person1.displayPerson();
  person2.displayPerson();
}
}
