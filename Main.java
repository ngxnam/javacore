
public class Main {
    static int globalVar;
    public static void main(String[] args) {
        float temp;
        double dNumber;
        boolean yesno;

        int globalVar = 2;

        System.out.println(globalVar);

        System.out.println("Hello world");
        System.out.println("Hello java");
        System.out.print("Hello java again");
        System.out.print("Xin chao moi nguoi");
        System.out.println("");
        int intNumber = 4;
        long longNumber = 100L;
        System.out.println(intNumber);
        System.out.println(longNumber);

        float floatNumber = 10.3f;
        System.out.println(floatNumber);

        double doubleNumber = 5.3;
        System.out.println(doubleNumber);

        boolean booleanValue = true;
        System.out.println(booleanValue);

        temp = 13.0f;

        float temp1;
        temp1 = 16.3f;

        dNumber = 10.4;
        yesno = false;
        
        int a = 2;
        int b = 4;
        int studenCount = 12;
        System.out.println(temp);

        byte byteNumer = 5;
        short shortNumber = byteNumer;

        System.out.println(shortNumber);

        longNumber = byteNumer;
        System.out.println(longNumber);

        double height = 1.7;
        int heightInt = (int)height;
        System.out.println(heightInt);

        long weight = 100;
        int weightInt = (int)weight;
        System.out.println(weightInt);

        final float piNumber = 3.14f;
        
        boolean result = height == heightInt;
        System.out.println(result);

        System.out.println(height >= heightInt);

        weight++;
        System.out.println(weight);
        weight--;
        System.out.println(weight);

        boolean andResult = (100 > 40) && ((30 > 10) || (5 > 10));
        System.out.println(andResult);

        double randomNum = Math.random();
        System.out.println(randomNum);

        int x = -2;
        int y = 5;
        System.out.println(x > 0);

    } 

}