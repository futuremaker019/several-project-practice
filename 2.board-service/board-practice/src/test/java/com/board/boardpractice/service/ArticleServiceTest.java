package com.board.boardpractice.service;

import com.board.boardpractice.domain.Article;
import com.board.boardpractice.domain.type.SearchType;
import com.board.boardpractice.dto.ArticleDto;
import com.board.boardpractice.repository.ArticleRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@DisplayName("비즈니스 로직 - 게시글")
@ExtendWith(MockitoExtension.class)
class ArticleServiceTest {

    @InjectMocks
    private ArticleService sut;     // 테스트될 필드를 명시할떄 sut를 사용한다.
    @Mock
    private ArticleRepository articleRepository;

    @DisplayName("게시글을 검색하면, 게시글 리스트를 반환한다.")
    @Test
    void givenSearchParameters_whenSearchingArticles_thenReturnsArticleList() {
        // given

        // when
        Page<ArticleDto> articles = sut.searchArticles(SearchType.TITLE, "search keyword");
        // Page에서 정렬도 가능하다.

        // then
        assertThat(articles).isNotNull();
    }
    @DisplayName("게시글을 조회학면, 게시글을 반환한다.")
    @Test
    void givenArticleId_whenSearchingArticles_thenReturnsArticle() {
        // given

        // when
        ArticleDto article = sut.searchArticle(1L);

        // then
        assertThat(article).isNotNull();
    }

}