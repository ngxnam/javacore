import java.util.Scanner;




public class Main4 {

    static Scanner scanner;

    static void initScanner(){
        // scanner = new Scanner(System.in);
        System.out.println("khoi tao scanner");
    }
    static void closeScanner() {
        // scanner.close();
        System.out.println("Dong scanner");
    }
    static void bai1(Scanner inputScanner) {
        System.out.println("==== Bai 1========");
        //code bai 1 o day
        // Scanner input = new Scanner(System.in);
        // int intNum = inputScanner.nextInt();
        // inputScanner.nextLine();
        int intNum = scanner.nextInt();
        inputScanner.nextLine();
        // input.close();
        System.out.println("int Num: " + intNum);

    }
    static void bai2(Scanner inputScanner) {
        // code bai 2 o day
        System.out.println("==== bai 2 ====");
    }
    static void bai3(Scanner inputScanner) {
        System.out.println("==== bai 3=====");
        // code bai 3 o day
        // Scanner input = new Scanner(System.in);
        // int num = inputScanner.nextInt();
        int num = scanner.nextInt();
        System.out.println("num: " + num);
        // input.close();
    }
    public static void main(String[] args) {
        int methodVar = 10;
        for (int i = 0; i < 10; i++) {
            // System.out.println("var: " + var);
            int var = 3;
            System.out.println("total: " + (var + i));
            System.out.println("method var inside block: " + methodVar);
        }
        // System.out.println("var is: " + var);
        System.out.println("method var out side block: " + methodVar);

        // initScanner();
        Scanner input = new Scanner(System.in);
        bai1(input);
        bai3(input);
        bai2(input);
        // closeScanner();
        input.close();

        // String[] text = new String[4];
        // text[0] = "Toi la java codder";
        // text[1] = "Toi dang hoc java co ban";
        // text[2] = "Toi se hoc lap trinh web";
        // for (int index = 0; index < text.length; index++) {
        //     System.out.println(text[index]);
        // }
        
        // int[][] twoDimensionArray;
        // twoDimensionArray = new int[3][4];

        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 4; j++) {
        //         // System.out.println(twoDimensionArray[i][j]);
        //         twoDimensionArray[i][j] = 1;
        //     }
        // }

        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 4; j++) {
        //         System.out.println(twoDimensionArray[i][j]);
                
        //     }
        // }

        // int[][][] threeDimensions = new int[2][3][4]; // 2* 3 * 4 = 24


        // for (int index = 0; index < text.length; index++) {
        //     System.out.println("for:" + text[index]);
        //     if (text[index] == null) {
        //         text[index] = "chuoi khac null";
        //     }
        // }

        // for (String t : text) {
        //     System.out.println("for each: " + t);
        // }
        
    }
}
