package com.dlist.dslistbackend.controllers;

import com.dlist.dslistbackend.dto.GameListDTO;
import com.dlist.dslistbackend.dto.GameMinDTO;
import com.dlist.dslistbackend.services.IGameListService;
import com.dlist.dslistbackend.services.IGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private IGameListService gameListService;
    @Autowired
    private IGameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        return gameService.findByList(listId);
    }
}
