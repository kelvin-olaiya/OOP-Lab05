package it.unibo.oop.lab05.ex4;
import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.WarehouseImpl;
import java.util.*;

public class OrderedWarehouse extends WarehouseImpl {
	
	public Set<Product> allProducts() {
		return new TreeSet<>(super.allProducts());
	}
}
