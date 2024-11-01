package students;

public class Student {
    //характеристики -> описват се в private полета
    //first name -> текст
    private String firstName;
    //last name -> текст
    private String lastName;
    //age -> цяло число
    private int age;
    //hometown -> текст
    private String hometown;

    //конструктор -> специфичен метод, чрез който създаваме обекти от класа
    //1. конструктор по подразбиране -> метод, който създава нов празен обект
    public Student() {
        //нов празен обект
        //firstName:
        //lastName:
        //age:
        //hometown:
    }

    //2. custom контруктори
    public Student(String firstName, String lastName, int age, String hometown) {
        //нов празен обект
        //firstName: John
        //lastName: Smith
        //age: 15
        //hometown: Sofia
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hometown = hometown;
    }

    //действия -> описват се чрез методи

    //getters -> методи, които ни осигуряват достъп до полетата
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public String getHometown() {
        return this.hometown;
    }

    //setters -> методи, които ни позволяват контролирано да задаваме стойност на полетата
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

}
