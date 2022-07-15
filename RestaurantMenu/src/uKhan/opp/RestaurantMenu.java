package uKhan.opp;
import java.util.Arrays;
/**
 *main method
 * the following method implements, toString(), sortedValue(), notSortedValue(), use of arrays, for and for each loop
 * this class will all the values being printed and displayed in a tabular format as required
 * @author Usman
 */
public class RestaurantMenu {
    /**
     * has "welcome" and "the end" lines,
     * make 5 object instances and gave them a name and gave them a value for name, calories, glutenFree, price, EDIBLE and type from the Food class
     * made an array called foodArrays and gave it a memory to store 5 arrays
     * inserted those names in each array
     * used foreach loop to print out the values (name, calories, glutenFree, price, EDIBLE and type) for each array using the toString() method 
     * used another foreach loop to print out unsorted values for name and calories
     * used final foreach loop to print out sorted values for name and calories
     * these 3 foreach loops are done to show user the difference before and after sorted
     * all the values are in tabular format once compiled
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n------------------------------------------------------------------------------Welcome!---------------------------------------------------------------------------------\n\n");
        Food Usman = new  Food("Red Apple", 300, true, 2.25, true, FoodType.FRUIT);
        Food Jacob = new Food("Beef Shawarma", 250, true, 10.25, true, FoodType.MEAT);
        Food Karen = new Food("Orange Carrots", 50, true, 3.15, true, FoodType.VEGETABLE);
        Food John = new Food("Poisoned Water", 0, true, 0.15, false, FoodType.DRINK );
        Food James = new Food("Jolly Rancher", 150, false, 0.75, true, FoodType.OTHER);
        Food[] foodArrays = new Food[5];
        foodArrays[0] = Usman; 
        foodArrays[1] = Jacob;
        foodArrays[2] = Karen;
        foodArrays[3] = John; 
        foodArrays[4] = James;
        System.out.println("The following values for every food.\n");
        System.out.println("\t\t Food Name \t\t Calories \t\t Gluten Free \t\t Price \t\t Edibile \t\t\t Type of Food with Description \n");
        for (Food  foodArray:  foodArrays) {
            System.out.println(foodArray);}
        System.out.println("\nThe following values for every food name and its calories which are not sorted (are not in any sequence).\n");
        System.out.println("\t\tFood  Name \t\t Number  of  Calories\n");
        for (Food  foodArray:  foodArrays) {
            System.out.println(foodArray.notSortedValue());}
        System.out.println("\nThe following values will be sorted from its calories going from lowest to highest.\n");
        Arrays.sort(foodArrays);
        System.out.println("\t\tFood  Name \t\t Number  of  Calories\n");
        for (Food  foodArray:  foodArrays) {
            System.out.println(foodArray.sortedValue());}
        System.out.println("\n\n---------------------------------------------------------------------------------The End!---------------------------------------------------------------------------------");}}