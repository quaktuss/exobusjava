public class BusOperator extends Human {
    private int license;

    public BusOperator(String name, int age, String sex, int license) {
        this.name = name;
        if (age >= 18) this.age = age; else {
            System.out.println("You cant be a bus operator.");
            return;
        }
        this.sex = sex;
        this.license = license;
        System.out.printf("Hello my name is %s, I am %d years old, I'm a %s and I am bus operator. No License : %d.\n", this.name, this.age, this.sex, this.license);
    }
}
