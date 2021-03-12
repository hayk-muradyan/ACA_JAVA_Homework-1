public class Person {

    private String name;
    private int age;

    public Person(String name, int age){
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }
    private void setName(String name) {
        if(name.matches("^[a-zA-Z\\s]+"))
            this.name = name;
    }

    public int getAge() {
        return age;
    }
    private void setAge(int age) {
        if(age > 0 && age < 100)
            this.age = age;
    }

    public void compareAge(Person p){
        if(p.age > this.age)
            System.out.println(p.name + " is older than me.");
        if(p.age < this.age)
            System.out.println(p.name + " is younger than me.");
        if(p.age == this.age)
            System.out.println(p.name + " is the same age as me.");
    }

}
