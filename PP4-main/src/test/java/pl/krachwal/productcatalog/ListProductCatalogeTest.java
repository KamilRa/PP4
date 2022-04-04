package pl.krachwal.productcatalog;

import org.junit.jupiter.api.Test;

public class ListProductCatalogeTest {
    
    @Test
    void itAllowsToStoreAndLoadProduct() {
    ProductData product = thereIsExampleProduct();
    ProductStorage listProductStorage = thereIsListProductStorage();
    
    listProductStorage.save(product);
    ProductData loaded = listProductStorage.load(product.getId());


        assertsEquals(product.getId(), loaded.getId());
    assertsEquals(product.getName(), loaded.getName());
    }

    private ProductStorage thereIsListProductStorage() {
    }

    private void thereIsExampleProduct() {
    }
}
}
