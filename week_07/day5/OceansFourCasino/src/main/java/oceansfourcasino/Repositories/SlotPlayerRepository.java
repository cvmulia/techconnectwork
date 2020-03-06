package oceansfourcasino.Repositories;

import oceansfourcasino.Models.SlotPlayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlotPlayerRepository  extends JpaRepository<SlotPlayer, Long> {
}
