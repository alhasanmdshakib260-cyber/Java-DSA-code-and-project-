
package myagro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import myagro.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}