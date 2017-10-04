/**
  * Class: Object-Oriented Design and Analysis
  * Professor: Orlando Montalvo
  * Assignment: HW 1   
  * Date 2017-9-20
  */

/**
  * Holds all the characteristics of guitar
  * @author Manaswitha
  * @version 1.3
  */
public class Guitar {

  private String serialNumber, builder, model, type, backWood, topWood;
  private double price;

/**
 * Constructor Guitar creates new guitar
 * @param serialNumber the Guitar serial number
 * @param price the Guitar price 
 * @param builder the Guitar builder
 * @param model the Guitar model
 * @param type the Guitar type
 * @param backwood the wood used for back of the Guitar
 * @param topwood the wood used for front of the Guitar
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

  /**
   * Gets the Guitar serialNumber
   */
  public String getSerialNumber() {
    return serialNumber;
  }

/**
 * Gets the Guitar price
 */
  public double getPrice() {
    return price;
  }
/**
 * Sets new price to the guitar
 * @param newPrice for the Guitar
 */
  public void setPrice(float newPrice) {
    this.price = newPrice;
  }
  
/**
 * Gets the Guitar builder
 */
  public String getBuilder() {
    return builder;
  }
  
/**
 * Gets the Guitar model
 */
  public String getModel() {
    return model;
  }
  
/**
 * Gets the Guitar type
 */
  public String getType() {
    return type;
  }
  
/**
 * Gets the wood used for back of the Guitar
 */
  public String getBackWood() {
    return backWood;
  }
  
/**
 * Gets the wood used for front of the Guitar
 */
  public String getTopWood() {
    return topWood;
  }
}
