package Constructor;

public class constructorP01 {
    // Default constructor
    public constructorP01() {
        System.out.println("This is a constructor");
        System.out.println("This is a constructor lecture 1");
        // will not return value
        // name of constructor should be the class name

    }

// Parameterized constructor
   public constructorP01(int a, int b){
   System.out.println("This is a parametrized constructor");

   }

    public void getData() {
        System.out.println("This is a method");
    }


    public static void main(String[] args) {

        constructorP01 ob = new constructorP01();
        constructorP01 ob1 = new constructorP01(5, 10);
        ob.getData();
        
// compile will call implicit constructor if you have not defined constructor block
// When ever you create an object constructor is called
// block of code when ever an object is crated
    }
}