package com.techelevator;

import java.util.ArrayList;
import java.util.List;

/**
 * ShoppingCart
 */
public class ShoppingCart {

	// *** Change from MediaItem to Purchasable
	private List<Purchasable> itemsToBuy = new ArrayList<>();

	// *** Change from MediaItem to Purchasable
	public void add(Purchasable itemToAdd) {
		itemsToBuy.add(itemToAdd);
	}

	public double getTotalPrice() {
		double total = 0.0;
		// *** Change from MediaItem to Purchasable
		for (Purchasable item : itemsToBuy) {
			total += item.getPrice();
		}
		return total;
	}

	public String receipt() {
		String receipt = "\nReceipt\n";
		// *** Change from MediaItem to Purchasable
		for (Purchasable item : itemsToBuy) {
			receipt += item;
			receipt += "\n";
		}

		receipt += "\nTotal: $" + getTotalPrice();

		return receipt;
	}
}
