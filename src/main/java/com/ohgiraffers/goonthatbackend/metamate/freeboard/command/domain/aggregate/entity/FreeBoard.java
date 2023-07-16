package com.ohgiraffers.goonthatbackend.metamate.freeboard.command.domain.aggregate.entity;


import com.ohgiraffers.goonthatbackend.metamate.domain.AuditingFields;
import com.ohgiraffers.goonthatbackend.metamate.freeboard.command.domain.aggregate.vo.*;
import lombok.*;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="freeboard")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
public class FreeBoard extends AuditingFields {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="BOARD_NO")
    private Long boardNo;

    private BoardCategory boardCategory;

    private BoardTitle boardTitle;

    private BoardContent boardContent;

    private BoardWriter boardWriter;

    private BoardHits boardHits;

    private BoardDeleteYn boardDeleteYn;

}

