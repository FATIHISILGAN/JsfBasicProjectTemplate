
import java.lang.reflect.Array;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;


public class ProductRepo {

public List<Product> list(){

List<Product> productList = new ArrayList<Product>();

productList.add(new Product(301,"cep tel",3402));
productList.add(new Product(302,"cep tel1",3400));
productList.add(new Product(303,"cep tel2",3424));


return productList;

}    

public void insert(Product product){

    System.out.println("Ekleniyor " + product.getProductId() + " ad: " + product.getProductName() + " satış:" +product.getSalesPrice() );
    
    
}
public void update(Product product){

    System.out.println("Güncelliyor " + product.getProductId() + " ad: " + product.getProductName() + " satış:" +product.getSalesPrice() );
    
    
}
public Product find(long productId){
 
    Product product = new Product(301,"cep tel",340);
    
    return product;
    
}

}
