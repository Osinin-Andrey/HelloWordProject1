package by.osinin.homework.lesson11.task1;

public class Main {
    public static void main(String[] args) {
        String document = "1234-aBc-5678-DiF-9j0K";
        System.out.println();
        String[] arr = document.split("-");
        //System.out.println(Arrays.toString(arr));
        System.out.println(arr[0] + " " + arr[2]);
        //Вывести на экран в одну строку два первых блока по 4 цифры.
        try {
            printLettersAbc(document);
        } catch (MissingAbcException e) {
            System.out.println(e.getMessage());
        }

        try {
            printNumbers555(document);
        } catch (Missing555Exception e) {
            System.out.println(e.getMessage());

        }

        try {
            printSymbol1a2b(document);
        } catch (Missing1a2bException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void printLettersAbc(String document) throws MissingAbcException {
        String LettersAbc = "ABC";
        if (document.contains(LettersAbc.toLowerCase()))
            System.out.println("Document has: " + LettersAbc.toLowerCase());
        else if (document.contains(LettersAbc.toUpperCase()))
            System.out.println("Document has: " + LettersAbc.toUpperCase());
        else {
            throw new MissingAbcException("Document does not have: Abc or Abc");
            //Проверить содержит ли номер документа последовательность abc
            //и вывети сообщение содержит или нет(причем, abc и ABC считается
            // одинаковой последовательностью).
        }
    }


    private static void printNumbers555(String document) throws Missing555Exception {
        String numbers555 = "555";
        if (document.startsWith(numbers555))
            System.out.println("Document has numbers 555 at first");
        else {
            throw new Missing555Exception("Document does not have numbers 555 at first");

        }
        //Проверить начинается ли номер документа с последовательности 555.
    }

    private static void printSymbol1a2b(String document) throws Missing1a2bException {
        String symbol1a2b = "1a2b";
        if (document.endsWith(symbol1a2b))
            System.out.println("Document has symbol 1a2b at end");
        else { throw new Missing1a2bException("Document does not have symbol 1a2b at end");

        }
        //Проверить заканчивается ли номер документа на последовательность 1a2b.
    }


}
