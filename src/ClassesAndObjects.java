public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.setname("Tolya");
        person1.age = 50;
        String s1 = "Vova";
        Person person2 = new Person();
        person2.setname(s1);
        person2.age = 20;
        person1.speak();
         }
}

class Person{
    String name;
    int age;

    void setname(String username){
        name = username;

    }
//
    int calculatorYearstoRetirement(){
        int years2 = 65 - age;
        return years2;
    }
    void speak(){ // этому методу данные для работы, поля. Второму методу не нужно ничего
        for(int i =0 ; i<3; i++)
            System.out.println("My name is "+ name + ", i'm " + age+" years old");
    }
    void sayHello(){
        System.out.println("Hello beaaach!");
    }

}


class test{

}
class test2{

}