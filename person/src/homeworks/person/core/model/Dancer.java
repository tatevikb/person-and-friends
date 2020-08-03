package homeworks.person.core.model;

import homeworks.person.core.enums.DancerType;
import homeworks.person.core.enums.Profession;
import homeworks.person.core.exceptions.InvalidNameException;
import homeworks.person.core.service.DancerAction;
import homeworks.person.core.service.impl.PersonActionFactory;

public class Dancer extends BasePerson implements DancerAction {
    private DancerType designation;
    private String groupName;

    private boolean full;

    private int count = 0;

    public Dancer()
    {
        actions = PersonActionFactory.getPersonAction(Profession.DANCER);
    }

    /**
     * Set the value of groupName
     * @param groupName the new value of groupName
     */
    public void setGroupName(String groupName)
    {
        if(name.length() > 255)
            throw new InvalidNameException();

        this.groupName = groupName;
    }

  /**
   * Get the value of groupName
   * @return the value of groupName
   */
  public String getGroupName() {
    return groupName;
  }

    @Override
    public void dancing() {
      if(full) {
          System.out.printf("%s %s", name, surname + " is dancing.");
          System.out.println();
          ((DancerAction) actions).dancing();
      }
      else System.out.println("She/He is not ate, she/he can't dance.");
    }

    @Override
    public void learn() {
        System.out.printf("%s %s", name, surname + " is learning.");
        System.out.println();
        actions.learn();
    }

    @Override
    public void eat() {
        if(count < 3) {
            count++;
            full = true;
            System.out.printf("%s %s", name, surname + " is eating.");
            System.out.println();
            actions.eat();
        }
        else {
            System.out.println("She/He has eaten 3 times, she/he can't eat anything else!");
        }
    }

    @Override
    public void walk() {
        System.out.printf("%s %s", name, surname + " is walking.");
        System.out.println();
        actions.walk();
    }

    @Override
    public void setDesignation(String designation) {
      this.designation = DancerType.valueOf(designation);
    }

    @Override
    public String getDesignation() {
        return designation.toString();
    }

    @Override
    public void act(String actionType)
    {
        switch (actionType) {
            case "eat":
                eat();
                break;
            case "walk":
                walk();
                break;
            case "learn":
                learn();
                break;
            case "dancing":
                dancing();
                break;
        }
    }
}
