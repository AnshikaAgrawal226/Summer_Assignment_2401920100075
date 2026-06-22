import java.util.Random;
abstract class Compartment{
    abstract String notice();
}
class FirstClass extends Compartment{
    String notice(){
        return "Welcome to the First Class";
    }
}
class Ladies extends Compartment{
    String notice(){
        return "Welcome to the Ladies Compartment";
    }
}

class General extends Compartment{
    String notice(){
        return "Welcome to the General Compartment";
    }
}

class Luggage extends Compartment{
    String notice(){
        return "Welcome to the Luggage Compartment";
    }
}

class TestCompartment{
    public static void main(String[] args) {
        Compartment [] arr = new Compartment[10];
         Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {

            int choice = rand.nextInt(4) + 1; 

            switch (choice) {
                case 1:
                    arr[i] = new FirstClass();
                    break;

                case 2:
                    arr[i] = new Ladies();
                    break;

                case 3:
                    arr[i] = new General();
                    break;

                case 4:
                    arr[i] = new Luggage();
                    break;
            }
        }

        System.out.println("Compartments:");

        for (Compartment c : arr) {
            System.out.println(c.notice());
        }

    }
}
