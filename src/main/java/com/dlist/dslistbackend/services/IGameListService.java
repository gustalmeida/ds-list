package com.dlist.dslistbackend.services;

import com.dlist.dslistbackend.dto.GameListDTO;

import java.util.List;

public interface IGameListService {
    List<GameListDTO> findAll();
    void move(Long listId, int sourceIndex, int destinationIndex);
}
