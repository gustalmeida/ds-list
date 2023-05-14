package com.dlist.dslistbackend.services;

import com.dlist.dslistbackend.dto.GameDTO;
import com.dlist.dslistbackend.dto.GameMinDTO;

import java.util.List;

public interface IGameService {
    List<GameMinDTO> findAll();
    GameDTO findById(Long id);
    List<GameMinDTO> findByList(Long listId);

}
