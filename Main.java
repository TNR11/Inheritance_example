package task_6;
/**
 * Assignment task 6: Inheritance
 * Author: Aadil Imran, 2022
 */
import static java.lang.System.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<LeafyGreen> veges = new LinkedList<>();
		veges.add(new LeafyGreen(10, 3.5, "Cabbage"));
		veges.add(new LeafyGreen(5, 2.94, "Lettuce"));
		veges.add(new LeafyGreen(20, 5.45, "Broccoli"));
		veges.add(new LeafyGreen(7, 1.94, "Lettuce"));
		veges.add(new LeafyGreen(15, 2.8, "Lettuce"));
		veges.add(new LeafyGreen(30, 2.5, "Cabbage"));
		veges.add(new LeafyGreen(28, 4.4, "Broccoli"));
		veges.add(new LeafyGreen(20, 5.5, "Cabbage"));
		veges.add(new LeafyGreen(16, 3.9, "Broccoli"));
		veges.add(new LeafyGreen(26, 4.8, "Broccoli"));		
		calculateStats(veges); 
	}
	
	public static void calculateStats(List<LeafyGreen> veges) {
		double totalveg = 0;
		double totalc = 0;
		double totall = 0;
		double totalb = 0;
		for(LeafyGreen v : veges) {
			totalveg += (v.getPrice()) * (v.getWeight());
			if (v.getType().equalsIgnoreCase("cabbage")) {
				totalc += v.getWeight();
			} else if (v.getType().equalsIgnoreCase("lettuce")) {
				totall += v.getWeight();
			} else if (v.getType().equalsIgnoreCase("broccoli")) {
				totalb += v.getWeight();
			}
		}
		out.printf("Total vegetable cost: $%.1f\n", totalveg);
		out.printf("Total cabbage weight: %.1fKg\n", totalc);
		out.printf("Total broccoli weight: %.1fKg\n", totalb);
		out.printf("Total lettuce weight: %.1fKg\n", totall);
	}
}


