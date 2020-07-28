public class Singer extends Person {
  private String bandName;

  public Singer (String name, String designation, String bandName)
  {
    super(name, designation);
    this.bandName = bandName;
  }

  /**
   * Set the value of bandName
   * @param bandName the new value of bandName
   */
  public void setBandName(String bandName) {
    this.bandName = bandName;
  }

  /**
   * Get the value of bandName
   * @return the value of bandName
   */
  public String getBandName() {
    return bandName;
  }

  public void singing()
  {
    System.out.println("singing");
  }

  public void playGuitar()
  {
    System.out.println("playing guitar");
  }

}
