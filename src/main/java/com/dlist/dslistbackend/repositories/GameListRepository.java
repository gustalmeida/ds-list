package com.dlist.dslistbackend.repositories;

import com.dlist.dslistbackend.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long> {

}