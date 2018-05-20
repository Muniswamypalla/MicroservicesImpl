# Inventory Service

1. All 
	a. With Feign and Zuul Api: `http://localhost:8096/inventory-service/inventory/`
	b. Normal `http://localhost:8282/inventory/` 
	
2. Single Product
	a. With Feign and Zuul Api: `http://localhost:8096/inventory-service/inventory/P002`
	b. Normal `http://localhost:8282/inventory/P002`

3. Lunching one more instance.
	`-Dserver.port=8283`