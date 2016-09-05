
package com.guppy.spring3beans.configurationInheritance;

/**
 *
 * @author kemalsamikaraca
 */
public class Customer {
    
    private int type;
    private String action;
    private String country;

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the action
     */
    public String getAction() {
        return action;
    }

    /**
     * @param action the action to set
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }
    
    public void printCustomerInfo(){
        System.out.println("\nCountry :: " + this.country
                            + "\ntype :: " + this.type
                            + "\naction :: " + this.action);
    }
    
}
