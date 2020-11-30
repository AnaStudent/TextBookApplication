package TextookApplication.repository;

import TextookApplication.entity.StudClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudClassRepository extends JpaRepository<StudClass, Integer> {
}
