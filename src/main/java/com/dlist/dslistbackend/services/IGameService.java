package com.dlist.dslistbackend.services;

import com.dlist.dslistbackend.dto.GameMinDTO;
import com.dlist.dslistbackend.entities.Game;

import java.util.List;

public interface IGameService {
    List<GameMinDTO> findAll();
}
