
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//set 9

class Product {
	int id;
	String name;
	int price;
	
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
class maxPrice implements Comparator<Product>{
	@Override
    public int compare(Product e1, Product e2) {
        if(e1.getPrice()>e2.getPrice())
        	return 1;
        else
        	 if(e1.getPrice()<e2.getPrice())
        		 return -1;
        	 else return 0;
    }
}
public class ProductImplementation {
	double sumOfPrice(ArrayList<Product> productList) {
		double sum =0;
		for(Product p:productList)
		{
			sum+=p.getPrice();
		}
		return sum;
	}
	float  maxPrice(ArrayList<Product> productList) {
		
		float max=Collections.max(productList,new maxPrice()).getPrice();
		
		return max;
		
	}
	/*float  minPrice(ArrayList<Product> productList) {
		
		return min;
		
	}*/
	List<String> getProductNameList(ArrayList<Product> productList) {
		List<String> namesList=new ArrayList<String>();
		for(Product p:productList)
		{
			namesList.add(p.getName());
		}
		return namesList;
	}
	public static void main(String[] args) {
		ArrayList plist=new ArrayList<Product>();
		plist.add(new Product(20,"Bag",897));
		plist.add(new Product(21,"Book",87));
		plist.add(new Product(22,"Table",89));
		plist.add(new Product(23,"pen",597));
		ProductImplementation pa=new ProductImplementation();
		System.out.println(pa.getProductNameList(plist));
		System.out.println(pa.sumOfPrice(plist));
		System.out.println(pa.maxPrice(plist));
		
	}
}
