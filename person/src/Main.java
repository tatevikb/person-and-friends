public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[4];
        people[0] = new Person();
        people[1] = new Programmer();
        people[2] = new Dancer();
        people[3] = new Singer();

        for(Person p : people) {
            System.out.println(p.getClass().getName());
        }
    }
}
