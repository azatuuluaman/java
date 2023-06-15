public class Arrays {
    public static void main (String [] args) { // типы данных: примитивные, ссылочные
        int number = 10; // primitive
        char character = 'a'; //primitive
        String s = "hello";
        String s1 = new String("Hello"); // Create class object

        int [] numbers = new int[5];   // целочисленный массив numbers -> [arrays] link data type
        for( int i = 0; i<numbers.length; i++){
            numbers[i] = i*10;
        }
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

    }
}
