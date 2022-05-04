package elbar.company.learn_center_rest.repository.system.tag;

import elbar.company.learn_center_rest.entity.system.skill.Skill;
import elbar.company.learn_center_rest.entity.system.tag.Tag;
import elbar.company.learn_center_rest.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.UUID;

@Repository
public interface TagRepository extends JpaRepository<Tag, Integer>, BaseRepository {
    @Transactional
    void deleteByCode(UUID code);

    Tag getByCode(UUID code);
}
