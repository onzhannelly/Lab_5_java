package repository;

import model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository<Category> extends JpaRepository<Category, Long> {
}
