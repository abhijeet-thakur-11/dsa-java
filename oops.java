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

    public void printname(){
        System.out.println(this.name);

    }public void printid(){
        System.out.println(this.id);
    }


}

public class oops {
    public static void main(String[] args) {
       /* 
        pen pen1=new pen();
        pen1.color = "Blue";
        pen1.type= "ball";

       pen pen2 = new pen();
       pen2.color = "black";
       pen2.type= "gel";

       pen1.printcolor();
       pen2.printcolor();
       */
       

       student s1 = new student();
       s1.name ="Rohit";
       s1.id= 1;
       student s2 = new student();
       s2.name = "Erick";
       s2.id = 2;

       s1.printname();
       s1.printid();
       s2.printname();    
       s2.printid();
       

}
}
