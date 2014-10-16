import java.util.ArrayList;

public class InventoryManager {

	static private ArrayList<ProductManager> allProducts;

	static public void addProduct() {
		allProducts.add(new ProductManager(Product.product, ProductManager.quantity));
	}

	public boolean attemptPurchase(String itemCode, int[] currentValue) {
		

	}

	public ProductManager find(String itemCode) {

	}

	public boolean isInStock(String itemCode) {

	}

	public boolean isValidItemCode(String itemCode) {

	}

	public ArrayList<ProductManager> listProducts() {
		return allProducts;
		
	}

	public ArrayList<Product> productsByPrice(int[] price) {

	}
}
