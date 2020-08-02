package homeworks.person.core.model;

import homeworks.person.core.service.ProgrammerAction;

public class Programmer extends BasePerson implements ProgrammerAction {
  private String companyName;

  public Programmer(String name, String designation, String companyName)
  {
    super(name, designation);
    this.companyName = companyName;
  }

  /**
   * Set the value of companyName
   * @param companyName the new value of companyName
   */
  public void setCompanyName (String companyName) {
    this.companyName = companyName;
  }

  /**
   * Get the value of companyName
   * @return the value of companyName
   */
  public String getCompanyName () {
    return companyName;
  }

  @Override
  public void coding() {
    System.out.println("writing a code.");
  }
}
