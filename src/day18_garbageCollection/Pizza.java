package day18_garbageCollection;

public class Pizza {

    public char size;
    public int numberOfCheese;
    public int numberOfPepperoni;

    // calculates the total price of the pizza, returns it as double
   public double calcCost(){
       double totalPrice = 0;

       switch (size){
           case 'S':
           case 's':
               totalPrice = 10 + (numberOfCheese+numberOfPepperoni)*2;
               break;
           case 'M':
           case 'm':
               totalPrice = 12 + 2*(numberOfCheese + numberOfPepperoni);
               break;
           case 'L':
           case 'l':
               totalPrice = 14 + 2*(numberOfCheese+numberOfPepperoni);
               break;
           default:
               System.out.println("Invalid size: " + size);
       }
       return totalPrice;


    }

    public void setInfo(char size, int numberOfCheese, int numberOfPepperoni) {
        this.size = size;
        this.numberOfCheese = numberOfCheese;
        this.numberOfPepperoni = numberOfPepperoni;
    }

    // displays
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheese=" + numberOfCheese +
                ", numberOfPepperoni=" + numberOfPepperoni +
                ", totalPrice=" + calcCost() +
                '}';
    }
}






/*Create a class named Pizza:
			Attributes:
				1. size
				2. numberOfCheeseTopping
				3. numberOfPepperoniTopping
				Actions:
				calcCost(): returns the total cost of the pizza
				toString(): returns a String containing the pizza size, quantity
				of each topping, and the pizza cost as calculated by calcCost()

		Pizza cost is determined by:
		                S: $10 + $2 per topping
		                M: $12 + $2 per topping
		                L: $14 + $2 per topping


 */






