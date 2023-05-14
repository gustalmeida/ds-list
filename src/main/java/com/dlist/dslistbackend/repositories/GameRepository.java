package com.dlist.dslistbackend.repositories;

import com.dlist.dslistbackend.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long>{

}
