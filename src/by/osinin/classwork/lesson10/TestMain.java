package by.osinin.classwork.lesson10;

public class TestMain {
    public static void main(String[] args) {
        String str = "This is my string";
        String str2 = "This is my string";
        String str3 = new String("This is my string");
        System.out.println(str == str2);
        System.out.println(str == str3);
        System.out.println(str.equals(str3)); //для сравнения строк
        System.out.println(str.compareTo(str3)); //насколько сильно отличаются строчки


        String addString = str + str2;
        System.out.println(addString); //склеивания строк
        System.out.println(str.concat(str2)); //склеивания строк
        System.out.println(String.join("... ", str, str2, str3)); //склеивание строк и добавление между ними что-то
        String[] arr = new String[]{str, str2,str3}; //создание массива
        System.out.println(String.join(". ", arr)); //склеивание массивов


        String myBestString = "   This is string   ";
        System.out.println(myBestString.length());
        System.out.println(myBestString.trim()); //убирает пробелы до и после фразы написанной
        myBestString = myBestString.trim(); //сохраняем без пробелов
        System.out.println(myBestString.length()); //считает строчки

        System.out.println(myBestString.charAt(5)); //считает символ (напрмиер 5ый по счёту, начиает с 0)
        //для циклов так делать нельзя
//        for (int i=0; i<myBestString.length(); i++) {
//            System.out.println(myBestString.charAt(i));

        char[] charArr = myBestString.toCharArray(); //считаем сколько раз была буква i (итого 3)
        int count = 0;
        for (char ch: charArr) {
            //символы или число или 'i'
            if (ch == 'i'){
                count ++;
            }
        }
        System.out.println("Count: "+ count);


        System.out.println(myBestString.substring(5)); //убирает 5 символов и пишет остальное
        System.out.println(myBestString.substring(5, 8)); //пишет с 5 по 8 символ




    }

}
