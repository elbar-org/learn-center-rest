package elbar.company.learn_center_rest.repository.system.skill;

import elbar.company.learn_center_rest.entity.system.level.Level;
import elbar.company.learn_center_rest.entity.system.skill.Skill;
import elbar.company.learn_center_rest.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.UUID;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer>, BaseRepository {
    @Transactional
    void deleteByCode(UUID code);

    Skill getByCode(UUID code);
}
