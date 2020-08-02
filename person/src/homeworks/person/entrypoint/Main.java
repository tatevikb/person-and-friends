package homeworks.person.entrypoint;

import homeworks.person.core.enums.Profession;
import homeworks.person.core.model.BasePerson;
import homeworks.person.core.model.Dancer;
import homeworks.person.core.model.Programmer;
import homeworks.person.core.model.Singer;
import homeworks.person.core.service.factory.PersonFactory;
import homeworks.person.utils.Input;

public class Main {
    public static void main(String[] args)
    {
        int errorCount = 0;

        while(errorCount <= 3) {
            System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
            int num = Input.number("Person type");
            if(num > 3 || num < 1) {
                errorCount++;
                System.out.println("Person not supported!");
                continue;
            }

            BasePerson person = PersonFactory.create(Profession.values()[num - 1]);

            String name = Input.string("Name");
            person.setName(name);

            String lastName = Input.string("Last name");
            person.setLastName(lastName);

            String surname = Input.string("Surname");
            person.setSurname(surname);

            String nickname = Input.string("Nickname");
            person.setNickname(nickname);

            String designation = Input.string("Designation");
            person.setDesignation(designation);

            int age = Input.number("Age");
            person.setAge(age);

            String email = Input.string("E-mail");
            person.setEmail(email);

            String gender = Input.string("Gender");
            person.setGender(gender);

            if (person instanceof Dancer) {
                String groupName = Input.string("Group");
                ((Dancer) person).setGroupName(groupName);
            }

            if (person instanceof Programmer) {
                String companyName = Input.string("Company");
                ((Programmer) person).setCompanyName(companyName);
            }

            if (person instanceof Singer) {
                String bendName = Input.string("Band");
                ((Singer) person).setBandName(bendName);
            }
        }
    }
}
