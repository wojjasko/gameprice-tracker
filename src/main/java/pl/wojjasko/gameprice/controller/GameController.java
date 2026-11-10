package pl.wojjasko.gameprice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wojjasko.gameprice.model.Game;
import pl.wojjasko.gameprice.repository.GameRepository;

import java.util.List;

@RestController //creating RESTAPI's endpoint
@RequestMapping("/api/games")
public class GameController {

    private final GameRepository gameRepository;

    public GameController(GameRepository gameRepository){
        this.gameRepository = gameRepository;
    }

    @GetMapping
    public List<Game> getAllGames(){
        return gameRepository.findAll();
    }
}
