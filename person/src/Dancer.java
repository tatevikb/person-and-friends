public class Dancer extends Person {
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

  public void dancing()
  {
    System.out.println("dance");
  }

}
