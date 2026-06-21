abstract class Compartment{
    public abstract String notice();
}
abstract class FirstClass extends Compartment{
    public abstract String notice(){
        System.out.println("Welcome to the First Class");
    }
}
abstract class Ladies extends Compartment{
    public String notice(){
        System.out.println("Welcome to the Ladies Compartment");
    }
}
