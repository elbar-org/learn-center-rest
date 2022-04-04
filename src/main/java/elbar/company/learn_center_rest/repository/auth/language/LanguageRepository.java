package elbar.company.learn_center_rest.repository.auth.language;

import elbar.company.learn_center_rest.entity.auth.language.Language;
import elbar.company.learn_center_rest.repository.BaseRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Integer>, BaseRepository {

    @Transactional
    void deleteByCode(UUID code);

    Language getByCode(UUID code);
}
