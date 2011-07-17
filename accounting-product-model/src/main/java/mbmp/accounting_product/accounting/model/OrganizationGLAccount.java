package mbmp.accounting_product.accounting.model;

import mbmp.accounting.model.OrganizationGlAccount;
import mbmp.product.model.Product;
import mbmp.product.model.category.ProductCategory;

/**
 * @author jimbarrows
 * @version 1.0
 * @created: Apr 2, 2010 12:32:56 AM
 */
public class OrganizationGLAccount extends OrganizationGlAccount {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Product referencingProduct;

    public Product getReferencingProduct() {
        return referencingProduct;
    }

    public ProductCategory getReferencingProductCategory() {
        return referencingProductCategory;
    }

    private ProductCategory referencingProductCategory;

    public void setReferencingProduct(Product referencingProduct) {
        this.referencingProduct = referencingProduct;
    }

    public void setReferencingProductCategory(
            ProductCategory referencingProductCategory) {
        this.referencingProductCategory = referencingProductCategory;
    }


}
