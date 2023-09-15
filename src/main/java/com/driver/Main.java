package com.driver;

class A {
    public String meth() {
        return "Invoking method from class A";
    }
}
class B extends A {
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of class B
        B objB = new B();

        // Task 5: Call the overridden method from the object of class B
        String result = objB.meth();
        System.out.println(result);
    }

}