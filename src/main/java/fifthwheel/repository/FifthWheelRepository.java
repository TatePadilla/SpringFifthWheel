/**
 * @author Tate - tlpadilla
 * CIS175 - Fall 2023
 * Oct 20, 2023
 */
package fifthwheel.repository;

/**
 * @author Tate
 *
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import fifthwheel.beans.FifthWheel;
@Repository
public interface FifthWheelRepository extends JpaRepository<FifthWheel, Long> { }