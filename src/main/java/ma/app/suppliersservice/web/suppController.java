/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.app.suppliersservice.web;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.app.productsapp.repositories.ProductRepository;
import ma.app.suppliersservice.entities.Supplier;
import ma.app.suppliersservice.repositories.SupplierRepository;

@RestController
@RequestMapping("/all")
public class suppController {
	 @Autowired
	    private SupplierRepository supRepository;
	    
    
    @GetMapping
    public List<Supplier> getsupliers() { 
        
    	return supRepository.findAll();
    }
 
}
