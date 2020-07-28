public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[4];
        people[0] = new Person("Tatevik Badalyan", "person");
        people[1] = new Programmer("Bill Gates", "programmer", "Microsoft");
        people[2] = new Dancer("Susanna Reid", "dancer", "Paso doble");
        people[3] = new Singer("Fabian Manzano","singer", "Boyce Avenue");

        for(Person p : people) {
            System.out.println(p.getClass().getName());
        }

        System.out.print(people[0].getName() + " is ");
        people[0].walk();

        System.out.print(people[1].getDesignation() + " is ");
        if(people[1] instanceof Programmer) {
            Programmer pr = (Programmer)people[1];
            pr.coding();
        }

        if(people[2] instanceof Dancer) {
            Dancer dr = (Dancer)people[2];
            System.out.print(dr.getGroupName() + " is a ");
            dr.dancing();
        }

        if(people[3] instanceof Singer) {
            Singer sr = (Singer)people[3];
            System.out.print(people[3].getName() + " is ");
            sr.playGuitar();
        }
    }
}
