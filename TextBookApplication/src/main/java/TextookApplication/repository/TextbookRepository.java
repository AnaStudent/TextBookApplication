package TextookApplication.repository;

import TextookApplication.entity.Textbook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TextbookRepository extends JpaRepository<Textbook, Long> {
}
