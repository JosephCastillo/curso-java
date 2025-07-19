package generics.managemet;

public class MyGenericArrayList {

    // This is the main method to demonstrate the usage of MyGenericArrayListDemo class
    public static void main(String[] args) {
        MyGenericArrayListDemo<String> stringList = new MyGenericArrayListDemo<>();
        stringList.setItems("Hello, Generics!");
        System.out.println(stringList.getItems());
    }
}

class MyGenericArrayListDemo<T> {

    private T items;

    MyGenericArrayListDemo() {

        items = null;

    }

    public void setItems(T items) {
        this.items = items;
    }

    public T getItems() {
        return items;
    }

}
