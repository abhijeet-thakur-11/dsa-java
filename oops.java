class pen {
    String color;
    String type;

    public void write() {
        System.out.println("writing something ");

    }

    public void printcolor() {
        System.out.println(this.color);
    }
}

class student {
    String name;
    int id;

    public void printinfo(String name) {
        System.out.println(name);
    }

    public void printifo(int id) {
        System.out.print(id);
    }

    public void printinfo(String name, int id) {
        System.out.println(name + " " + id);
    }

    /*
     * //constructors
     * student(){
     * System.out.println("constructor called");
     * }
     * // parameterize constructors
     * student(String name , int id){
     * this.name = name;
     * this.id= id;
     * }
     * // copy comstructor
     * student(student s2){
     * this.name = s2.name;
     * this.id=s2.id;
     * 
     * }
     */

}

class shape {
    String color;

    public void area() {
        System.out.println("Display area");
    }
}

class tringle extends shape {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

class circle extends shape {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

class equilateral extends tringle {
    public void are(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

class account {
    public String name;
    protected String email;
    private String password;

    // getter and setter
    public String getpassword() {
        return this.password;

    }

    public void setpassword(String password) {
        this.password = password;
    }
}
/*
 * //abstraction using abstract class
 * abstract class animal{
 * abstract void walk();
 * public void eats(){
 * System.out.println("animals eats ");
 * }
 * 
 * }class horse extends animal{
 * public void walk(){
 * System.out.println("Walks on 4 legs");
 * }
 * 
 * }
 */

interface animal {
    public void walk();

}

interface herbivores {

}

class horse implements animal, herbivores {
    public void walk() {
        System.out.println("walks on 4 legs ");

    }

}

public class oops {
    public static void main(String[] args) {

        // polymorphisim :- different functions with same name but different parameters
        // fuction overloading :- ceating same name fucntion single class , also a type
        // of polymorphisim

        // inheritence :- when a class inherits the properties/methods of another class,
        // increase resuability and reduce redundancy
        // single level inheritence :- when a class inherits the properties of another
        // class
        // multilevel inheritence :- when a class inherits the properties of another
        // class which is already inherited from another class
        // heirarchical inheritence :- when multiple classes inherits the properties of
        // a single class
        // multiple inheritence :- when a class inherits the properties of multiple
        // classes (not supported in java)
        // hybrid inheritence :- combination of multiple and multilevel inheritence (not
        // supported in java)
        // packages :- a collection of classes and interfaces, used to avoid name
        // conflicts and to control access, also to make searching/locating and usage of
        // classes, interfaces, enumerations and annotations easier
        // access modifiers :- keywords used to specify the access level of a class,
        // method or variable
        // examples of access modifier :- public (accessible everywhere) , default
        // (access within the package ) , private (access within the class ) , protected
        // encapsulation :- data and uske fuction(properties and methids) ko ek hi class
        // mein encapsulate krna
        // abstraction :- to show only showable data to user and hide the sensitive data
        // , it can be done by either interference or abstract class

        account account1 = new account();
        account1.name = "raju";
        account1.email = "raju@example.com";
        // account1.password = "abcd"; can not use the privatevariables outside the
        // class
        // for doing this we can use getter and setter methods
        account1.setpassword("abcd");
        // System.out.println(account1.getpassword());

        horse horse1 = new horse();
        horse1.walk();

    }
}
