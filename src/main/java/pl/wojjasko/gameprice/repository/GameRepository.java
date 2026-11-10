package pl.wojjasko.gameprice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wojjasko.gameprice.model.Game;

@Repository // this component is responsible for operations on database
public interface GameRepository extends JpaRepository<Game, Long> {
}
