import java.io.*;
import java.util.*;
import java.util.Collections;
import java.util.Comparator;

public class Driver {
	public static void main(String[] args) {

		ArrayList<Laptop> arr = new ArrayList<Laptop>();
		final String[] arr1 = { "Very serious laptop", "Gaming laptop", "Overpriced laptop", "Featherweight laptop",
				"Indestructible laptop" };
		
		Laptop L1 = new Laptop(1000, 3300, 1499, 18, arr1[0]);
		Laptop L2 = new Laptop(2300, 3350, 1299, 20, arr1[1]);
		Laptop L3 = new Laptop(2321, 3200, 2299, 40, arr1[2]);
		Laptop L4 = new Laptop(3000, 2500, 1999, 20, arr1[3]);
		Laptop L5 = new Laptop(1500, 3000, 3299, 8, arr1[4]);
		Laptop L6 = new Laptop(1200, 900, 999, 15, arr1[0]);
		Laptop L7 = new Laptop(725, 1000, 899, 6, arr1[2]);

		arr.add(L1);
		arr.add(L2);
		arr.add(L3);
		arr.add(L4);
		arr.add(L5);
		arr.add(L6);
		arr.add(L7);
		
		Comparator<Laptop> compareBattery = 
				new Comparator<Laptop>() {

			public int compare(Laptop o1, Laptop o2) {
				return Integer.compare(o1.getBattery(), o2.getBattery());
			}

		};
		
		Comparator<Laptop> compareCPU = new Comparator<Laptop>() {
			public int compare(Laptop L1, Laptop L2) {
				return Integer.compare(L1.getCPUBenchMark(), L2.getCPUBenchMark());

			}
		};
		
		Comparator<Laptop> compareGPU = new Comparator<Laptop>() {
			public int compare(Laptop L1, Laptop L2) {
				return Integer.compare(L1.getGPUBenchMark(), L2.getGPUBenchMark());
			}
		};
		
		Comparator<Laptop> comparePrice = new Comparator<Laptop>() {
			public int compare(Laptop L1, Laptop L2) {
				return Integer.compare(L1.getPrice(), L2.getPrice());
			}
		};
		
		Comparator<Laptop> compareCategory = new Comparator<Laptop>() {
			public int compare(Laptop L1, Laptop L2) {
				return L1.getCategory().compareTo(L2.getCategory());
			}
		};
		System.out.println("Testing the class by printing the sorted object based on variables: ");
		System.out.println();
		
		System.out.println("Battery Sorted: ");
		Collections.sort(arr, compareBattery);
		for (Laptop L : arr)
			System.out.println("CPUBenchMark: " + L.getCPUBenchMark() + ", GPUBenchMark: " + L.getGPUBenchMark()
					+ ", Battery: " + L.getBattery() + ", hrs Price: $" + L.getPrice() + ", Category: " + L.getCategory());
		System.out.println();

		System.out.println("CPU Sorted: ");
		Collections.sort(arr, compareCPU);
		for (Laptop L : arr)
			System.out.println("CPUBenchMark: " + L.getCPUBenchMark() + ", GPUBenchMark: " + L.getGPUBenchMark()
			+ ", Battery: " + L.getBattery() + ", hrs Price: $" + L.getPrice() + ", Category: " + L.getCategory());
System.out.println();

		System.out.println("GPU Sorted:");
		Collections.sort(arr, compareGPU);
		for (Laptop L : arr)
			System.out.println("CPUBenchMark: " + L.getCPUBenchMark() + ", GPUBenchMark: " + L.getGPUBenchMark()
			+ ", Battery: " + L.getBattery() + ", hrs Price: $" + L.getPrice() + ", Category: " + L.getCategory());
System.out.println();

		System.out.println("Price Sorted: ");
		Collections.sort(arr, comparePrice);
		for (Laptop L : arr)
			System.out.println("CPUBenchMark: " + L.getCPUBenchMark() + ", GPUBenchMark: " + L.getGPUBenchMark()
			+ ", Battery: " + L.getBattery() + ", hrs Price: $" + L.getPrice() + ", Category: " + L.getCategory());
System.out.println();

		System.out.println("Category Sorted");
		Collections.sort(arr, compareCategory);
		for (Laptop L : arr)
			System.out.println("CPUBenchMark: " + L.getCPUBenchMark() + ", GPUBenchMark: " + L.getGPUBenchMark()
			+ ", Battery: " + L.getBattery() + ", hrs Price: $" + L.getPrice() + ", Category: " + L.getCategory());
System.out.println();

	}

}
