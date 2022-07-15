package uKhan.opp;
/**
 *this is an enum class
 * makes enum values like fruit, vegetable, nut, dairy, meat, grain, drink, other
 * the main purpose of this class is to basically show what type of food it is, like is red apple a fruit vegetable or etc
 * it shows the type of that certain food
 * after the enum there is a little description in the bracket which has the same thing (value like fruit, vegetable and etc) and there is a small description about how it is basically made
 * @author Usman
 */
public enum FoodType {
    /**has FRUIT as the constant, and "Fruit, Comes from ovary of a flower or a plant" as the description*/
    FRUIT("Fruit, Comes from ovary of a flower or a plant"), 
    /**has VEGETABLE as the constant, and "Vegetable, Comes from plants" as the description */
    VEGETABLE("Vegetable, Comes from plants"), 
    /**has NUT as the constant, and "Nut, Dry hard fruit" as the description*/
    NUT("Nut, Dry hard fruit"), 
    /**has DAIRY as the constant, and "Dairy, Comes from milk of a mammal" as the description*/
    DAIRY("Dairy, Comes from milk of a mammal"), 
    /**has MEAT as the constant, and "Meat, Comes from animal meat" as the description*/
    MEAT("Meat, Comes from animal meat"), 
    /**has GRAIN as the constant, and "Grain, Small hard dry seed" as the description*/
    GRAIN("Grain, Small hard dry seed"), 
    /** has DRINK as the constant, and "Drink, A liquid which can be consumed" as the description*/
    DRINK("Drink, A liquid which can be consumed"), 
    /**has OTHER as the constant, and "Other, anything but is Edible (can be consumed)" as the description*/
    OTHER("Other, anything but is Edible (can be consumed)");
    private String description;
    /**
     * constructor for FoodType
     * since description was private it gives it make (remember there is no set method which is why it does this.description = description in the constructor)
     * @param description 
     */
    private FoodType(String description){
        this.description = description;}
    /**
     * get method for description
     * @return description 
     */
    public String getDescription() {
        return description;}
    /**
     * toString method for description
     * shows how description will be printed at the end (in the main class)
     * @return description 
     */
    public String toString(){
        return "\t" + description;}
}