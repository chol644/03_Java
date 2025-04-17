package ch07;

public class Dog extends Animal{
    public Dog(){
        name="댕댕";
    }

    @Override
    public void sound(){
        System.out.println(name + " : 멍멍,왈왈,낑낑");
    }
}