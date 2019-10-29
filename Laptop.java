public class Laptop {

	private final int CPUBenchMark;
	private final int GPUBenchMark;
	private final int price;
	private final int battery;
	private final String category;

	/**
	 * 
	 * @param CPUBenchMark The CPU Benchmark of the laptop.
	 * @param GPUBenchMark The GPU Benchmark of the laptop.
	 * @param price        The price of the laptop.
	 * @param battery      The battery life of the laptop.
	 * @param category     The category of the laptop.
	 * 
	 * @precondition CPUBenchMark > 0, GPUBenchMark > 0, price > 0, battery > 0,
	 *               category can only be Very serious laptop, Gaming laptop,
	 *               Overpriced laptop, Featherweight laptop or Indestructible laptop.
	 *               
	 * @postcondition Guaranteeing the user that the Laptop object will be created.
	 */
	public Laptop(int CPUBenchMark, int GPUBenchMark, int price, int battery, String category) {
		assert CPUBenchMark > 0 : "CPU Benchmark should be greater then 0";
		assert GPUBenchMark > 0 : "GPU Benchmark should be greater then 0";
		assert price > 0 : "Price should be greater then 0";
		assert battery > 0 : "Battery life should be greater then 0";
		assert category == "Very serious laptop" || category == "Gaming laptop" || category == "Overpriced laptop"
				|| category == "Featherweight laptop" || category == "Indestructible laptop" 
				: "Category can only" + " be from the 5 categories given";

		this.CPUBenchMark = CPUBenchMark;
		this.GPUBenchMark = GPUBenchMark;
		this.price = price;
		this.battery = battery;
		this.category = category;
	}

	/**
	 * 
	 * @return the CPUBenchMark.
	 * @postcondition CPUBenchMark of the object will be returned after the method
	 *                is called.
	 */
	public int getCPUBenchMark() {
		return CPUBenchMark;
	}

	/**
	 * 
	 * @return the GPUBenchMark.
	 * @postcondition GPUBenchMark of the object will be returned after the method
	 *                is called.
	 */
	public int getGPUBenchMark() {
		return GPUBenchMark;
	}

	/**
	 * 
	 * @return the price.
	 * @postcondition Price of the object will be returned after the method is
	 *                called.
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * 
	 * @return the Battery.
	 * @postcondition Battery of the object will be returned after the method is
	 *                called.
	 */
	public int getBattery() {
		return battery;
	}

	/**
	 * 
	 * @return the category.
	 * @postcondition category of the object will be returned after the method is
	 *                called.
	 */
	public String getCategory() {
		return category;
	}

}
