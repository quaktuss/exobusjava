public class Students extends Human {

    public Students(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        System.out.printf("Hi, I'm %s im a(n) %s, Im %d yo. I'm a student!!\n", name, sex, age);
    }
}
