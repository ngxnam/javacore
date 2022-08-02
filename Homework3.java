public class Homework3 {
    public static void main(String[] args) {

        String text = "Toi la  t  coder";

        String[] array = text.split(" ");
        for (int index = 0; index < array.length; index++) {
            // System.out.println(array[index]);
            String word = array[index];
            if (word.length() > 0) {
                if (word.equals("t")) {
                    String firstCharactor = word.substring(0, 1);
                    System.out.println(firstCharactor);
                    firstCharactor = firstCharactor.toUpperCase();
                    String last = word.substring(1);
                    System.out.println(last);
                    System.out.println(firstCharactor + last);
                }
                
            }
        }
        System.out.println(Character.isLetter('0'));
    }
}
