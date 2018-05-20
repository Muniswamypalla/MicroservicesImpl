package com.arya.catalogservice.services;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.arya.catalogservice.web.models.ProductInventoryResponse;

//@FeignClient("inventory-service") //with out zuul
@FeignClient("zuul-api-gateway")
@RibbonClient("inventory-service")
public interface InventoryServiceFeignClient {

	//@GetMapping("/inventory")//with out zuul
	@GetMapping("/inventory-service/inventory")
    List<ProductInventoryResponse> getInventoryLevels();

	//@GetMapping("/inventory/{productCode}") // with out zuul
	@GetMapping("/inventory-service/inventory/{productCode}")
    public ResponseEntity<ProductInventoryResponse> findInventoryByProductCode(@PathVariable("productCode") String productCode);
}
