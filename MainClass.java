// Outer class
class OuterClass {

    // Outer class method
    void display() {
        System.out.println("This is the display method of the Outer class.");
    }

    class InnerClass {

        // Inner class method
        void display() {
            System.out.println("This is the display method of the Inner class.");
        }
    }
}

public class MainClass {

    public static void main(String[] args) {

        // Creating an instance of the outer class
        OuterClass out = new OuterClass();
        out.display();  // Calling the outer class's display method

        // Creating an instance of the inner class
              OuterClass.InnerClass in = out.new InnerClass();
        in.display();   // Calling the inner class's display method
    }
}


