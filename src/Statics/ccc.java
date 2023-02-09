package Statics;

class Counter4 {
    static int count = 0; // static variable
    int nonStaticCount = 0;

    public void incrementCount() {
        count++;
        nonStaticCount++;
    }
}

 class Main {
    public static void main(String[] args) {
        Counter4 c1 = new Counter4();
        c1.incrementCount();
        c1.incrementCount();

        System.out.println("Static count: " + Counter4.count);
        System.out.println("nonStatic count: " + c1.nonStaticCount);

        Counter4 c2 = new Counter4();
        c2.incrementCount();
        c2.incrementCount();




        System.out.println("Static count: " + Counter4.count);
        System.out.println("nonStatic count: " + c2.nonStaticCount);
        // Output: Static count: 2
        //         nonStatic count: 2
    }
}