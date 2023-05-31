package com.dlist.dslistbackend.dto;

import com.dlist.dslistbackend.entities.Game;

import com.dlist.dslistbackend.projections.GameMinProjection;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();

    }

    public GameMinDTO(GameMinProjection entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getGameYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();

    }
}
