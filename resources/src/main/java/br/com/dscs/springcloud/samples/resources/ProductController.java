package br.com.dscs.springcloud.samples.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/products")
public class ProductController {

    public @GetMapping(value = "/rate") List<Product> getProductsRates() {
        return Arrays.asList(Product.builder().name("product1").id(1l).build(), Product.builder().id(2l).name("product2").build());
    }

    public @GetMapping(value = "/ranking") List<Product> getProductRanking() {
        return Arrays.asList(Product.builder().name("product3").id(3l).build(), Product.builder().id(4l).name("product3").build());
    }
}