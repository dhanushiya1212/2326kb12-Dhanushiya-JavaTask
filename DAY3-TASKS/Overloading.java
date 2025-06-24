package task.corejava;

public class Overloading {
	public int sum(int a, int b) {
        return a + b;
    }

   
    public double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();

       
        int intResult = obj.sum(10, 20);
        System.out.println("Sum of integers: " + intResult);

        
        double doubleResult = obj.sum(5.5, 4.3);
        System.out.println("Sum of doubles: " + doubleResult);
    
}


}
