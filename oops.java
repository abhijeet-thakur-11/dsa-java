class pen{
    String color ; 
    String type ;

    public void write(){
        System.out.println("writing something ");

    }
    public void printcolor(){
        System.out.println(this.color);
    }
}
class student{
    String name;
    int id;

    public void printinfo(String name ){
        System.out.println(name);
    }
    public void printifo(int id){
        System.out.print(id);
    }public void printinfo(String name , int id){
        System.out.println(name+" "+id);
    }


    /* 
    //constructors 
    student(){
        System.out.println("constructor called");
    }
    // parameterize constructors 
    student(String name , int id){
        this.name = name;
        this.id= id;
    }
    // copy comstructor 
    student(student s2){
        this.name = s2.name;
        this.id=s2.id;

    }*/

}

class shape {
    String color;
    public void area (){
        System.out.println("Display area");
    }
}
class tringle extends shape {   
    public void area( int l , int h){
        System.out.println(0.5*l*h);
    }
}class circle extends shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}
class equilateral extends tringle{
    public void are(int l , int h ){
        System.out.println(0.5*l*h);
    }
}

public class oops {
    public static void main(String[] args) {

        // polymorphisim :- different functions with same name but different parameters 
        //fuction overloading :- ceating same name fucntion single class , also a type of polymorphisim
        
        //inheritence :- when a class inherits the properties/methods of another class, increase resuability and reduce redundancy
        // single level inheritence :- when a class inherits the properties of another class
        // multilevel inheritence :- when a class inherits the properties of another class which is already inherited from another class
        //heirarchical inheritence :- when multiple classes inherits the properties of a single class
        // multiple inheritence :- when a class inherits the properties of multiple classes (not supported in java)
        // hybrid inheritence :- combination of multiple and multilevel inheritence (not supported in java)

        
      
}
}
