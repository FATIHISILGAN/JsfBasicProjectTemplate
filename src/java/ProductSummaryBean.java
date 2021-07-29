
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fatih
 */
@ManagedBean
@RequestScoped
public class ProductSummaryBean {
   
    private List<Product> productList;

    public ProductSummaryBean() {
       
        ProductRepo repo = new ProductRepo();
        
        productList=repo.list();
        
    }
    
    public List<Product> getProductList(){
       return productList;
    }
    
}
