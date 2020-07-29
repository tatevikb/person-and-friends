package homeworks.person.core.model;

import homeworks.person.core.service.DancerAction;

public class Dancer extends BasePerson implements DancerAction {
  private String groupName;

  public Dancer(String name, String designation, String groupName)
  {
    super(name, designation);
    this.groupName = groupName;
  }

  /**
   * Set the value of groupName
   * @param groupName the new value of groupName
   */
  public void setGroupName(String groupName) {
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
    System.out.println("dancing.");
  }
}
