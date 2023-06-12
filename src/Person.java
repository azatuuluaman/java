public class Person {
    int height;
    float weight;

    void say (String str) { // функция void
        System.out.println(str);
    }
    Person (int height, float weight) { // конструктор
        this.height = height;
        this.weight = weight;
    }
    Person () {}

}

