

import com.emotion.em.Entity.TbDiaryContents; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.util.Optional;

@Repository
public class DiaryRepository extends JpaRepository<TbDiaryContents,Long> {

    // Optional<TbDiaryContents> findByName(String name); 
    // void deleteByName(String name); 
    
}