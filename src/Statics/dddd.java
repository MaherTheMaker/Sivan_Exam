package Statics;

class MyUtility {
    int x=5;
    static void printMessage(String message) {
        System.out.println(message);
    }
    static double PI()
    {
        return  3.14;
    }
}

 class Main5 {
    public static void main(String[] args) {
        MyUtility.printMessage("Hello, World!");
    }
}
