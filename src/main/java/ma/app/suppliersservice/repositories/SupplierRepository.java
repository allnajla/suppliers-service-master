package ma.app.suppliersservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ma.app.suppliersservice.entities.Supplier;

@RepositoryRestResource
public interface SupplierRepository extends JpaRepository<Supplier,Long> {
}
