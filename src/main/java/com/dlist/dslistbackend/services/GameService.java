package com.dlist.dslistbackend.services;

import com.dlist.dslistbackend.dto.GameMinDTO;
import com.dlist.dslistbackend.entities.Game;
import com.dlist.dslistbackend.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GameService implements IGameService{

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}
