// Q28. Create a final method in parent Try to override in child → show error



class Parent {
    final void show() {
        System.out.println("This is a final method in Parent");
    }
}

class Child extends Parent {

    // ❌ Trying to override final method (This will cause an error)
    /*
    void show() {                    // ERROR
        System.out.println("Child class method");
    }
    */
}
