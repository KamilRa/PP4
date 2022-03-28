package pl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.jkanclerz.creditcard.NameProvider;
import pl.krachwal.productcatalog.ProductCatalog;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    NameProvider createNameProvider(){
        return new NameProvider();
    }

    @Bean
    ProductCatalog createMyProductCatalog(){
        ProductCatalog productCatalog = new ProductCatalog();
        String productId1 = productCatalog.addProduct ("lego-set-1", "Nice lego set");
        productCatalog.assignImage(productId1, <img>);
        
    }
}
