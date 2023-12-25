import java.lang.Math;

class GenThree {
    public static void main(String args[]) {

        int minRange = Integer.parseInt(args[0]);
        int maxRange = Integer.parseInt(args[1]);

        int num1 = (int) (minRange + Math.random() * (maxRange - minRange));
        System.out.println(num1);

        int num2 = (int) (minRange + Math.random() * (maxRange - minRange));
        System.out.println(num2);

        int num3 = (int) (minRange + Math.random() * (maxRange - minRange));
        System.out.println(num3);

        int minNum = Math.min(num1, Math.min(num2, num3));

        System.out.println("The minimal generated number was " + minNum);
    }
}
