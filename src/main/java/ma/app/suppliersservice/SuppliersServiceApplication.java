package ma.app.suppliersservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import ma.app.suppliersservice.entities.Supplier;
import ma.app.suppliersservice.repositories.SupplierRepository;




@SpringBootApplication
public class SuppliersServiceApplication implements CommandLineRunner{
@Autowired 
SupplierRepository supplierRepository;
	public static void main(String[] args) {
		SpringApplication.run(SuppliersServiceApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		supplierRepository.save(new Supplier(1L,"JBOSS","JBOSS"));
		supplierRepository.save(new Supplier(2L,"Tomcat","Tomcat"));
		supplierRepository.save(new Supplier(3L,"Springboot","Springboot"));
		
	}


}
