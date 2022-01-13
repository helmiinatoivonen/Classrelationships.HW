package com.company;

public class Main {

    public static void main(String[] args) {
	// Exercise 1
        /*
        1: the special property of a static method or field is that every class has
           both data and actions; values for the class data can change later
           without affecting other instances of the class
        2: association is the simplest relationship that is be represented with a
           solid line. E.g. employer *employs* employee etc.
        3: 2 advantages of polymorphism:
           - object actions can have the same name but different parameter lists and
             processes
           - subclasses inherit all parent data and actions without rewriting code
             and can alter the actions that they deem necessary -> code reusability
        4: the difference between inheritance and association:
           the inheritance relationship signifies that one object is a specialized
           form of another object whereas in the association relationship objects are
           just related. E.g. an employer and an employee are both people.
        5: difference between overriding and overloading:
           When two or more methods in the same class have the same name but different
           parameters, it’s called Overloading.
           When the method signature (name and parameters) are the same in the
           superclass and the child class, it’s called Overriding.
        7.1: life, organisms; a human, anatomy
        7.2: inheritance: chair, couch; aggregation: table, chair


        // Exercise 3 */

        Company.Project Cone = new Company.Project(1, "two");
        Company.Worker Wone = new Company.Worker("person1", true);
        Company.Worker Wtwo = new Company.Worker("person2", false);
        Company.Task Tone = new Company.Task ("Cleaning" , "person1");
        Company.Task Ttwo = new Company.Task ("Planning", "person2");
        
        System.out.println(Cone);
        System.out.println(Wone);
        System.out.println(Wtwo);
        System.out.println(Tone);
        System.out.println(Ttwo);
    }
}
