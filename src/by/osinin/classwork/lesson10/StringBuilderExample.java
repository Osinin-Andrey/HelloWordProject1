package by.osinin.classwork.lesson10;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("1xample: ");
        builder.append("First")
                .append(" ")
                .append("example");
        builder.setCharAt(0, 'E'); //поставить E вместо 1.
        builder.insert(9, "First"); //поставить first на 9 место
        builder.delete(15, 20); //с 15 по 20 строчку удалить
        System.out.println(builder.indexOf("First"));
        //System.out.println(builder.replace(0,2,"abc")); //какую на что позиции менять
        //builder.reverse(); //выводит строчку задом наперед
        builder.deleteCharAt(0); //удалить какую-то букву


        String result = builder.toString();
        System.out.println(builder.toString());

        String testCase = "This abba not";
        System.out.println(isPalindrome(1, testCase));
        System.out.println(isPalindrome(2, testCase));
        System.out.println(isPalindrome(10, testCase));
        System.out.println(isPalindrome(3, testCase));

    }

    private static boolean isPalindrome(String str) {
        StringBuilder builder = new StringBuilder(str);
        return str.equals(builder.reverse().toString());
    }

    private static boolean isNewPalindrome(String str) {
        char[] arr = str.toCharArray();
        int size = arr.length / 2;
        for (int i = 0; i < size; i++){
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }


    private static boolean isPalindrome(int number, String str) {
        String[] arr = str.split(" ");
        if (number > arr.length) {
            System.out.println("number is to long");
            return false;
        }
        return isPalindrome(arr[number - 1]); //isNewPalindrome поставить можно для проверки
    }
}
