package com.board.boardpractice.domain;

import java.time.LocalDateTime;

public class Article {
    private Long id;
    private String title;       // 제목
    private String content;     // 내용
    private String hashtag;     // 해시태그 (검색을 위한)

    private LocalDateTime createdAt;
    private String createBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
