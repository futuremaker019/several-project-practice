package com.board.boardpractice.service;

import com.board.boardpractice.domain.type.SearchType;
import com.board.boardpractice.dto.ArticleDto;
import com.board.boardpractice.dto.ArticleUpdateDto;
import com.board.boardpractice.dto.ArticleWithCommentsDto;
import com.board.boardpractice.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;

    @Transactional(readOnly = true)
    public Page<ArticleDto> searchArticles(SearchType searchType, String searchKeyword, Pageable pageable) {
        return Page.empty();
    }

    @Transactional(readOnly = true)
    public ArticleDto searchArticle(long l) {
        return null;
    }

    public void saveArticle(ArticleDto dto) {

    }

    public void deleteArticle(long articleId) {

    }

    public ArticleWithCommentsDto getArticle(Long articleId) {
        return null;
    }

    public void updateArticle(ArticleDto dto) {

    }
}
