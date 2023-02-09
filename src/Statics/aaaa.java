package Statics;

class Counter2 {
    static int count = 0; // static variable
    int number;
    public Counter2() {
        count++;
    }

}

 class Main2 {
    public static void main(String[] args) {
        Counter2 c1 = new Counter2();
        Counter2 c2 = new Counter2();
        Counter2 c3 = new Counter2();

        c1.number=5;
        c2.number=4;
        c3.number=1;

        System.out.println("Number of instances: " + Counter2.count);


        Counter2.count=10;

        System.out.println("c1.number = " + c1.number);
        System.out.println("Number of instances: " + Counter2.count);
        // Output: Number of instances: 3
    }
}
