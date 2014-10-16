import java.util.ArrayList;

public class InventoryManager {

	static private ArrayList<ProductManager> allProducts;

	static public void addProduct() {
		allProducts.add(new ProductManager(-
				+product, quantity));
	}

	static public boolean attemptPurchase(String itemCode, int[] currentValue) {
		if()
		{
			if(InventoryManager.isInStock(itemCode))
			{
				return true;
			}
		}
		else
			 return false;
	}

	static public ProductManager find(String itemCode) {

	}

	static public boolean isInStock(String itemCode) {
		if (ProductManager.quantity == 0) {
			return false;
		} else
			return false;
	}

	static public boolean isValidItemCode(String itemCode) {
		if(ProductManager.itemCode)
	}

	static public ArrayList<ProductManager> listProducts() {
		return allProducts;

	}

	static public ArrayList<Product> productsByPrice(int[] price) {

	}
}
