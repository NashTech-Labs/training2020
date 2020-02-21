package com.training.knoldus.client;
import com.training.knoldus.factory.PrototypeFactory;
import com.training.knoldus.model.Sheep;
/* Prototype design pattern is used in scenarios where application needs to create
   a large number of instances of a class, which have almost same state or differ
   very little.*/

public class TestPrototypePattern {

    public static void main(String[] args){

        // Handles routing makeCopy method calls to the
        // right subclasses of Animal
        PrototypeFactory animalMaker = new PrototypeFactory();

        // Creates a new Sheep instance
        Sheep sally = new Sheep();

        // Creates a clone of Sally and stores it in its own
        // memory location
        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);

        // These are exact copies of each other
        System.out.println(sally);
        System.out.println(clonedSheep);

        System.out.println("Sally HashCode: " + System.identityHashCode(System.identityHashCode(sally)));
        System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(clonedSheep)));
    }

}
/*
    Prototype: Template of any object before the actual object is constructed
    Prototype Registry: Used as registry service to have all prototypes accessible using
    simple string parameters.
    Client: Client will be responsible for using registry service to access prototype instances
        - The client in this case being TestPrototypePattern

    - Overall Prototype pattern creates new objects by cloning other objects
    - Allows for adding of any subclass instance of a known super class at run time
    - When there are numerous potential classes that you want to only use if needed at runtime
    - Reduces the need for creating subclasses
 */