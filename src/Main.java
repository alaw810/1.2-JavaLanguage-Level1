public class Main {
    public static void main(String[] args) throws EmptySaleException {
        Product prod1 = new Product("Apple", 0.89);
        Product prod2 = new Product("Banana", 0.30);
        Product prod3 = new Product("Pineapple", 4.90);

        Sale sale = new Sale();

        try {
            sale.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sale.addProduct(prod1);
        sale.addProduct(prod2);
        sale.addProduct(prod3);

        sale.calculateTotal();
        System.out.println("The final total is: " + sale.getTotalPrice());


        try {
            sale.errorMaker();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException: " + e.getMessage());
        }

    }
}