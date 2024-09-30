public class JavaPro {

    public int sumValue(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        JavaPro myObj = new JavaPro();
        
        System.out.println("The sum is: " + myObj.sumValue(50,60));
    }
}