/*
  * Class: Object-Oriented Design and Analysis
  * Professor: Orlando Montalvo
  * Assignment: HW 1   
  * Student Manaswitha
*/
/*
  * Guitar class describes all the parameters of guitars
  * @author manaswitha
 */

public class Guitar {

  private String serialNumber, builder, model, type, backWood, topWood;
  private double price;
/*
 * Constructor Guitar creates new guitar
 * @param serialNumber
 * @param price
 * @param builder
 * @param model
 * @param type
 * @param backwood
 * @param topwood
 */
  public Guitar(String serialNumber, double price,
                String builder, String model, String type,
                String backWood, String topWood) {
    this.serialNumber = serialNumber;
    this.price = price;
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.backWood = backWood;
    this.topWood = topWood;
  }

  /*
   * @return serialNumber
   */
  public String getSerialNumber() {
    return serialNumber;
  }

/*
 * @return price
 */
  public double getPrice() {
    return price;
  }
/*
  * sets new price to the guitar
  * @param newPrice
 */
  public void setPrice(float newPrice) {
    this.price = newPrice;
  }
  
/*
 * @return builder
 */
  public String getBuilder() {
    return builder;
  }
  
/*
 * @return model
 */
  public String getModel() {
    return model;
  }
  
/*
 * @return type
 */
  public String getType() {
    return type;
  }
  
/*
 * @return backWood
 */
  public String getBackWood() {
    return backWood;
  }
  
/*
 * @return topWood
 */
  public String getTopWood() {
    return topWood;
  }
}
