package pl.wojjasko.gameprice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wojjasko.gameprice.model.Game;

import java.util.Optional;

public interface GameRepository extends JpaRepository<Game, Long> {

    Optional<Game> findByExternalId(String externalId);
}
