import java.util.ArrayList;

public class CafeUtil {

    // Method to get the streak goal after numWeeks weeks
    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    // Method to calculate the total order amount from an array of item prices
    public double getOrderTotal(double[] prices) {
        double total = 0.0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    // Method to display the menu items with their index
    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    // Method to add a customer to the list of customers
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        int numAhead = customers.size();
        System.out.println("There are " + numAhead + " people in front of you.");
        customers.add(userName);
        System.out.println(customers);
    }

    // Bonus method to print the price chart for a product
    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        for (int i = 1; i <= maxQuantity; i++) {
            double total = price * i;
            System.out.printf("%d - $%.2f\n", i, total);
        }
    }

    // Bonus method to display menu items with prices
    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() != prices.size()) {
            return false;
        }

        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%d %s -- $%.2f\n", i, menuItems.get(i), prices.get(i));
        }

        return true;
    }
}
