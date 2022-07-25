import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Weight = ");
        // double weight = scanner.nextDouble();
        // scanner.nextLine();

        // System.out.println("Height = ");
        // double height = scanner.nextDouble();

        // scanner.close();

        // double h2 = Math.pow(height/100, 2);

        // double BMI = weight / h2;

        // System.out.println("BMI = " + BMI);

        // if (BMI < 18.5) {
        //     System.out.println("Thieu Can");
        // } else if (BMI > 24.9) {
        //     System.out.println("Thua Can");
        // } else { 
        //     System.out.println("Can Doi");
        // }
        
        // String season = new String("SUMMER");
        // switch (season) {
        //     case "SPRING": {
        //         System.out.println("Mua xuan");
        //         break;
        //     }
        //     case "SUMMER": {
        //         System.out.println("Mua he");
        //         break;
        //     }
        //     case "AUTUMN": {
        //         System.out.println("Mua thu");
        //         break;
        //     }
        //     case "WINTER": {
        //         System.out.println("Mua dong");
        //         // break;
        //     }
        //     default:
        //         System.out.println("Khong co mua nay");
            
        // }
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("nhap 1 thang trong nam: ");
        // int thang = scanner.nextInt();
        // scanner.close();
        // switch (thang) {
        //     case 1:
        //     case 3:
        //     case 5:
        //     case 7:
        //     case 8:
        //     case 10:
        //     case 12: {
        //         System.out.println("tháng " + thang + " có 31 ngày");
        //         break;
        //     }
        //     case 2: {
        //         System.out.println("tháng " + thang + " có 28 hoặc 29 ngày");
        //         break;
        //     }
        //     case 4: 
        //     case 6: 
        //     case 9: 
        //     case 11: {
        //         System.out.println("tháng " + thang + " có 30 ngày");
        //         break;
        //     }
        //     default:
        //         System.out.println("Không có tháng này");
        //         break;
        // }

        // for (int index = 10; index >= 0; index++) {
        //     System.out.println("vong lap thu " + index);
        // }

        for (int index = 1; index < 10; index++) {
            System.out.println("vong lap: " + index);
            index = index + 2;
        }

        int count = 0;
        String text = "Toi la java coder";
        for (int index = 0; index < text.length(); index++) {
            //System.out.println("ky tu: " + text.charAt(index));
            char character = text.charAt(index);
            if (character == 'a') {
                System.out.println("ky tu a");
                count = count + 1;
            }
        }
        System.out.println("so ky tu a: " + count);

        for (int index = text.length() - 1; index >= 0; index--) {
            char character = text.charAt(index);
            if (character == 'o') {
                System.out.println("o xuat hien o vi tri: " + index);
            }
            switch (character){
                case 'a':
                case 'u':
                case 'i':
                case 'o':
                case 'e': {
                    System.out.println("nguyen am " + character + " o vi tri thu " + (index + 1));
                    break;
                }
                default:
                    break;             
            }
        }
        
        int index = 0;
        while (index < text.length()) {
            System.out.println("ky tu tai vi tri " + index + " la " + text.charAt(index));
            index = index + 1;
        }
        
        index = text.length() - 1;
        while (index >= 0) {
            System.out.println("index " + index + " ky tu " + text.charAt(index));
            index--;
        }

        // in ra tren man hinh cau hoi
        // Hay nhap mot so bat ky
        // neu so nhap la so chan thi in ra la ban da nhap dung
        // neu so nhap la so le thi yeu cau user nhap lai

        Scanner scanner = new Scanner(System.in);

        // boolean isEven = false;
        // do {
        //     System.out.println("Hay nhap 1 so bat ky: ");
        //     int inputNumber = scanner.nextInt();
        //     if (inputNumber % 2 == 0) {
        //         System.out.println("ban da nhap dung");
        //         isEven = true;
        //     }
        // } while(isEven == false);
        
        // scanner.close();

        // System.out.println("Hay nhap 1 so bat ky: ");
        // boolean isEven = false;
        // while(isEven == false) {
            
        //     int inputNumber = scanner.nextInt();
        //     if (inputNumber % 2 == 0) {
        //         System.out.println("ban da nhap dung");
        //         isEven = true;
        //     } else {
        //         System.out.println("Hay nhap 1 so bat ky: ");
        //     }
        // }

        for (int i = 0; i < text.length(); i++) {  
            char character = text.charAt(i);
            if (character == 'o') {
                System.out.println("ky tu o dau tien o: " + i);
                break;
            }
            System.out.println("ky tu " + character);
        }

        int j = 0;
        while (j < text.length()) {
            char character = text.charAt(j);
            if (character == 'o') {
                j++;
                continue;
            }
            System.out.println("ky tu " + character);
            j++;
        }

        while (true) {
            System.out.println("nhap so chan");
            int number =  scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println("ban nhap dung roi");
                break;
            }
        }
        
        // --------------- Bai 2 -------------------
        int primeCount = 0;
        int primeTotal = 0;
        int num = 2;
        while(primeCount <= 100) {
            if (num == 2) {
                // can lam gi?
            }
            boolean isPrime = true;
            for(int i = 2; i <= num / 2; i++) {
                int temp =  num % i;
                if(temp == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                // can lam gi?
            }
            // can lam gi?
        }

        // ---------- Bai 3 -------------
        // int positiveNumber = 0;
        // int digitSum = 0;
        // while(true) {
        //     int lastDigit = positiveNumber % 10;
        //     positiveNumber = positiveNumber / 10;

        // }
    }
}
