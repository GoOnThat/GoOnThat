package com.ohgiraffers.goonthatbackend.metamate.freeboard.command.domain.aggregate.vo;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Getter
@EqualsAndHashCode
public class BoardHits {

    @Column(name = "FREE_BOARD_HITS", nullable = false)
    private Integer boardHits;

    protected BoardHits() {

    }

    public BoardHits(Integer boardHits) {
        validateBoardHits(boardHits);
        this.boardHits = boardHits;
    }

    private void validateBoardHits(Integer boardHits) {

        if (boardHits < 0) {
            throw new IllegalArgumentException("조회수는 음수일 수 없습니다.");
        }
    }
}