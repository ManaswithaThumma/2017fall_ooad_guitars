/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 1   
 * Date 2017-9-20
 */
 

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Adds guitar to the inventory and is used to search guitar with the given specifications
 * @author Manaswitha
 * @version 1.3
 */
public class Inventory {
  private List<Guitar> guitars;

/**
 * Constructor inventory initializes guitars
 */
  public Inventory() {                                 
    guitars = new LinkedList<Guitar>();
  }

/**
 * Adds new guitar to the inventory by providing the parameters
 * serialNumber, price, builder, model, type, backWood and TopWood
 * @param serialNumber the Guitar serial number
 * @param price the Guitar price
 * @param builder the Guitar builder
 * @param model the Guitar model
 * @param type the Guitar type
 * @param backwood the wood used for back of the Guitar
 * @param topwood the wood used for front of the Guitar
 */
  public void addGuitar(String serialNumber, double price,
                        String builder, String model,
                        String type, String backWood, String topWood) {
    Guitar guitar = new Guitar(serialNumber, price, builder,
                               model, type, backWood, topWood);
    guitars.add(guitar);
  }
  
  /**
   * Finds and returns guitar with provided serial number
   * @param serialNumber the Guitar serial number
   * @return the guitar with the given serialNumber, or null if guitar not found 
   */
  public Guitar getGuitar(String serialNumber) {
    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }
  
  /**
   * Finds and returns the guitar that matches with the given searchGuitar
   * @param searchGuitar the Guitar with given specifications
   * @return guitar if searchGuitar matches existing guitar or return null if no guitar found
   */
  public Guitar search(Guitar searchGuitar) {
    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      // Ignore serial number since that's unique
      // Ignore price since that's unique
      String builder = searchGuitar.getBuilder().toLowerCase();
      if ((builder != null) && (!builder.equals("")) &&
          (!builder.equals(guitar.getBuilder().toLowerCase())))
        continue;
      String model = searchGuitar.getModel().toLowerCase();
      if ((model != null) && (!model.equals("")) &&
          (!model.equals(guitar.getModel().toLowerCase())))
        continue;
      String type = searchGuitar.getType().toLowerCase();
      if ((type != null) && (!searchGuitar.equals("")) &&
          (!type.equals(guitar.getType().toLowerCase())))
        continue;
      String backWood = searchGuitar.getBackWood().toLowerCase();
      if ((backWood != null) && (!backWood.equals("")) &&
          (!backWood.equals(guitar.getBackWood().toLowerCase())))
        continue;
      String topWood = searchGuitar.getTopWood().toLowerCase();
      if ((topWood != null) && (!topWood.equals("")) &&
          (!topWood.equals(guitar.getTopWood().toLowerCase())))
        continue;
      return guitar;
    }
    return null;
  }
}
