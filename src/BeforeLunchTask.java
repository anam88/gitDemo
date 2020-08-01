public class BeforeLunchTask {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int sum = num1 + num2 + num3;

        System.out.println("Sum of numbers: " +sum);
        System.out.println("==================================");
        //write a program that check which is bigger number


        boolean n1Bigger = num1 > num2 && num1 > num3;
        boolean n2Bigger = num2 > num1 && num2 > num3;
        boolean n3Bigger = num3 > num1 && num3 > num2;

        if(n1Bigger){
            System.out.println("n1 is bigger");
        }
        if(n2Bigger){
            System.out.println("n2 is bigger");
        }
        if(n3Bigger){
            System.out.println("n3 is bigger");
        }

    }
}
