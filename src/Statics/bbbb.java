package Statics;

class Calculator {

    int x;
    static int y;

    public Calculator(int x) {
        this.x = x;
    }

    static int add(int a, int b) { // static method

        return a + b+ y;
    }

    int  addx(int a)
    {
        return y+x+a;
    }


}

class Main3 {
    public static void main(String[] args) {

        int result = Calculator.add(5, 10);

        Calculator calculator=new Calculator(6);
        System.out.println("calculator.x = " + calculator.x);


        System.out.println("Result: " + result);
        // Output: Result: 15
    }
}
