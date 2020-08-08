package homeworks.person.entrypoint;

import homeworks.person.core.containers.PersonList;
import homeworks.person.core.enums.Profession;
import homeworks.person.core.model.BasePerson;
import homeworks.person.core.service.factory.PersonFactory;
import homeworks.person.utils.Input;
import homeworks.person.utils.PersonData;

public class Main {
    public static void main(String[] args)
    {
        PersonList people = new PersonList();
        BasePerson person = null;

        int errorCount = 0;
        while(errorCount < 3) {
            System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
            String command = Input.string("Command");

            if(command.equals("new")) {
                int num = Input.number("Person type (1 - Dancer, 2 - Programmer, 3 - Singer)");
                if (num > 3 || num < 1) {
                    errorCount++;
                    System.out.println("Person not supported!");
                    continue;
                }

                person = PersonFactory.create(Profession.values()[num - 1]);
                PersonData.input(person);
                people.add(person);
            }
            else if(command.equals("action")) {
                String actionType = Input.string("Action");
                while (!actionType.equals("stop")) {
                    person.act(actionType);
                    actionType = Input.string("Action");
                }
            }
            else if(command.equals("remove")) {
                String nm = Input.string("Name");
                String sm = Input.string("Surname");
                people.remove(nm, sm);
            }
            else if(command.equals("edit")) {
                String nm = Input.string("Name");
                String sm = Input.string("Surname");
                person = people.get(nm, sm);
                if(person != null) {
                    PersonData.input(person);
                }
            }
            else if(command.equals("exit")) {
                break;
            }
        }
    }
}
