package com.board.boardpractice.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private Article article;    // 개시글 Id
    private String content;     // 본문

    private LocalDateTime createdAt;
    private String createBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
