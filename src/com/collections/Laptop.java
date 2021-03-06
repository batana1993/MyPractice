package com.collections;

public class Laptop implements Comparable<Laptop> {

	public String brand;
	public int ram;
	public int price;

	public Laptop(String brand, int ram, int price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;

	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(Laptop lap) {
		if (this.getPrice() > lap.getPrice()) {
			return 1;
		} else {
			return -1;
		}

	}

}
