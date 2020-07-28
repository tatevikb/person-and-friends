public class Person {
    protected String name;
    protected String designation;
  
    public Person(String name, String designation)
    {
        this.name = name;
        this.designation = designation;
    }

  /**
   * Set the value of name
   * @param name the new value of name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Get the value of name
   * @return the value of name
   */
  public String getName() {
    return name;
  }

  /**
   * Set the value of designation
   * @param designation the new value of designation
   */
  public void setDesignation(String designation) {
    this.designation = designation;
  }

  /**
   * Get the value of designation
   * @return the value of designation
   */
  public String getDesignation() {
    return designation;
  }

  public void learn()
  {
      System.out.println("learning");
  }

  public void eat()
  {
      System.out.println("eating");
  }

  public void walk()
  {
      System.out.println("walking");
  }

}
