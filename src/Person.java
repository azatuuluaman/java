public class Person {
    int height;
    float weight;

    public static int summ = 478;

    void say (String str) { // функция void
        System.out.println(str);
    }
    Person (int height, float weight) { // конструктор
        this.height = height;
        this.weight = weight;
    }
    Person () {}

}

