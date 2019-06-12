package ryudung.example.application.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ryudung.example.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
