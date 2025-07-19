public class Main {
    public static void main(String[] args) {

        Box<String> myStringBox = new Box<>();
        myStringBox.add("Hello, Generics!");
        Box<Integer> myNumericBox = new Box<>();
        myNumericBox.add(123);
        Box<Object> myObjectBox = new Box<>();
        myObjectBox.add("This is an object");

        // Using the generic method to print items in the boxes
        Until.printBox(myStringBox.get());
        Until.printBox(myNumericBox.get());
        Until.printBox(myObjectBox.get());

    }
}

class Box<T> {
    private T item;

    public void add(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }

}

class Until{

    public static <T> void printBox(T item) {
        System.out.println("Item in box: " + item);
    }
}