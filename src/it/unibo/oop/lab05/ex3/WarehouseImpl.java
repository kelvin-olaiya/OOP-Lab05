package it.unibo.oop.lab05.ex3;

import java.util.*;

public class WarehouseImpl implements Warehouse {
	
	protected final Set<Product> store;
	
	public WarehouseImpl() {
		store = new HashSet<>();
	}

	public void addProduct(Product p) {
		store.add(p);
	}

	public Set<String> allNames() {
		var names = new TreeSet<String>();
		for (var product : store) {
			names.add(product.getName());
		}
		return names;
	}

	public Set<Product> allProducts() {
		return Set.copyOf(store);
	}

	public boolean containsProduct(Product p) {
		return store.contains(p);
	}
	
	private Product getProduct(final String name) {
		for (var elem : store) {
			if (name.equals(elem.getName())) {
				return elem;
			}
		}
		return null;
	}

	public double getQuantity(String name) {
		Product res = this.getProduct(name);
		if(res == null) {
			return -1;
		}
		return res.getQuantity();
	}

}
