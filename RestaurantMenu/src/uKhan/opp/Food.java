package uKhan.opp;
/**
 *food class
 * has initialized values for name, glutenFree, price, calories, EDIBlE and type
 * note price and calories are primitive objects 
 * these values will have getter, setters, toString, equals and a sortedValue method in order to print them according to the requirement of the assignment
 @author Usman 
 */
public class Food implements Comparable<Food> {
    private String name = "Electricity";
    private boolean glutenFree = false;
    private Double price = 20.0 ;
    private Integer calories= 250;
    /**
     * EDIBLE is public because that is what was it required to be in Assignment 1, it is false because I am initializing values first and this EDIBLE is for electricity, and electricity is not edible therefore it is false 
     */
    public boolean EDIBLE= false ;
    private FoodType type = FoodType.OTHER;
    /**
     * Default constructor
     */
    public Food() {}
    /**
     * name and calories constructor
     * @param name calling name because it is private and has to be called
     * @param calories calling calories because it is private and has to be called 
     */
    public Food(String name, int calories) {}
    /**
     * name , calories, glutenFree, price and EDIBLE constructor
     * calling all the values in the constructor now without returning them
     * not calling type, because it would be included in a separate constructor 
     * @param name
     * @param calories
     * @param glutenFree
     * @param price
     * @param EDIBLE 
     */
    public Food(String name, Integer calories, boolean glutenFree, Double price, boolean EDIBLE) {}
    /**
     * name , calories, glutenFree, price, EDIBLE, type constructor
     * calling all the values now including type
     * this constructor will not be empty, it will have all the set values of the parameters below, so when I call them to print in my main method, the values show
     * @param name
     * @param calories
     * @param glutenFree
     * @param price
     * @param EDIBLE
     * @param type 
     */
    public Food(String name, Integer calories, boolean glutenFree, Double price, boolean EDIBLE, FoodType type) {
        setName(name);
        setCalories(calories);
        setGlutenFree(glutenFree);
        setPrice(price);
        setEDIBLIE(EDIBLE);
        setType(type);}
    /**
     * get method for type
     * @return type 
     */
    public FoodType getType() {
        return type;}
    /**
     * set method for type
     * @param type 
     */
    public void setType(FoodType type) {
        this.type = type;}
    /**
     * set method for name
     * with exception if name is null or empty
     * @param name 
     */
    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty: ");} 
        else {
            this.name = name;}}
    /**
     * set method for glutenFree
     * with exception if glutenFree is anything but true or false
     * if it is true or false it has a this statement
     * @param glutenFree 
     */
    public void setGlutenFree(boolean glutenFree) {
        if (glutenFree == true || glutenFree == false) {
            this.glutenFree = glutenFree;} else {
            throw new IllegalArgumentException("Write false or true : ");}}
    /**
     * set method for price
     * with exceptions where if price is equal to or less than 0 then it will allow price
     * if not then it will give IllegalArgumentException
     * @param price 
     */
    public void setPrice(Double price) {
        if (price >= 0) {
            this.price = price;
        } else if (price < 0) {
            throw new IllegalArgumentException("price cannote be a negative");
        } else {
            System.out.println("Must be a number");}}
    /**
     * set method for calories
     * with exception where calories is equal to or less than 0 then it will allow price
     * if not then it will give the IllegalArgumentException
     * @param calories 
     */
    public void setCalories(Integer calories) {
        if (calories >= 0) {
            this.calories = calories;
        } else {
            throw new IllegalArgumentException("calories cannote be a negative or a character");}}
    /**
     * set method for EDIBILE
     * since EDIBILE cannot be changed (according to the first Assignment), this will just give EDIBILE back
     * @param EDIBILE 
     */
    public void setEDIBLIE(boolean EDIBILE) {
        this.EDIBLE = EDIBILE;}
    /**
     * get method for name
     * returns name
     * @return 
     */
    public String getName() {
        return name;}
    /**
     * get method for glutenFree 
     * returns glutenFree
     * @return 
     */
    public boolean getGlutenFree() {
        return glutenFree;}
    /**
     * get method for price 
     * returns price
     * @return 
     */
    public double getPrice() {
        return price;}
    /**
     * get method for calories
     * returns calories
     * @return 
     */
    public int getCalories() {
        return calories;}
    /**
     * get method for EDIBILE
     * returns EDIBILE
     * @return 
     */
    public boolean getEDIBLE() {
        return EDIBLE;}
    /**
     * compareTo method 
     * this method might look useless, but is very important when I sort the arrays I made in my main class
     * although the compareTo method does not show or is has its value printed anywhere, but its function is to show the calories (of the array I made) subtracted by the calories (of this class, which I initialized)
     * @param o
     * @return 
     */
   @Override
    public int compareTo(Food o) {
        return calories - o.calories;}
    /**
     * the following is a toString method, where it basically would show all the values I stored in an array in a tabular format
     * @return name, calories, glutenFree, price, EDIBLE ,type 
     */
    @Override
    public String toString() {
        return "  \t\t" +name + "\t\t   " + calories + "\t\t\t    " + glutenFree + "\t\t $" + price + "\t\t  " + EDIBLE + "\t\t\t" + type;}
    /**
     * this method will basically print the values of name and calories in the for loop of the sorted Array in the main class
     * the values for this will be shown in a tabular format
     * @return name, calories
     */
    public String sortedValue(){
        return "\t\t" + name + "\t\t\t" + calories;}
    /**
     * this method will basically print the values of name and calories in the for loop of the not sorted Array in the main class, which will show how the data was before getting sorted
     * the values for this will be shown in a tabular format 
     * @return name, calories
     */
    public String notSortedValue(){
        return "\t\t" + name + "\t\t\t" + calories;}
    /**
     * equals method to validate all the values
     * makes an primitive object is o
     * has 3 if statements
     * first if statement, checks if o is an instance of food, which it is, then it assigns itself to another variable called f, and then all the variable values are returned
     * second if statement checks if o has a value, and returns true
     * third if statement checks if o is null, and returns false
     * @param o
     * @return 
     */
    @Override
    public boolean equals(Object o){
        if (o instanceof Food){
            Food f = (Food)o;
            return ((f.getGlutenFree() == glutenFree) && (f.getPrice() == price) && (f.getName().equals(name)) && (f.getType() == type)   && (f.getCalories() == calories) );}
        if (o == this) return true;
        if (o == null) return false;
        return false;}
}