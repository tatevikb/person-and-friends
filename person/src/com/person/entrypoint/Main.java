package com.person.entrypoint;

import com.person.core.containers.PersonList;
import com.person.core.enumeration.ActionType;
import com.person.core.enumeration.Profession;
import com.person.core.model.BasePerson;
import com.person.core.service.factory.PersonFactory;
import com.person.utils.Input;
import com.person.utils.PersonData;

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
                String actionStr = Input.string("Action");
                ActionType action = ActionType.getById(actionStr);
                while (ActionType.STOP != action) {
                    person.act(action);
                    actionStr = Input.string("Action");
                    action = ActionType.getById(actionStr);
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
                person = people.getByNameAndSurname(nm, sm);
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
