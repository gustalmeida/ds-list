package com.dlist.dslistbackend.dto;

import com.dlist.dslistbackend.entities.GameList;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@NoArgsConstructor
public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO(GameList entity) {
        BeanUtils.copyProperties(entity, this);
    }

}
