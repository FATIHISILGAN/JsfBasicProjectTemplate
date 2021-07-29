
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean
@RequestScoped

public class ProductDetailBean {
    private Product product;

    public ProductDetailBean() {
        
     long productId = getProductId();

        if(productId==0){
            product=new Product();
        }
        else{
            ProductRepo repository=new ProductRepo();
            product=repository.find(productId);
        }
    
    }
  
    private long getProductId(){
     HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        long productId = 0;
        if (request.getParameter("productId") != null) {
            productId = Long.parseLong(request.getParameter("productId"));
        }
        return productId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public void save(){
        System.out.println("Saklanıyor:" + product.getProductId()
                + " " + product.getProductName() + " " + product.getSalesPrice());
        ProductRepo repository = new ProductRepo();
        long productId=getProductId();
        if(productId==0){
            repository.insert(product);
        }else{
            repository.update(product);
        }
        repository.insert(product);
    }

   

}