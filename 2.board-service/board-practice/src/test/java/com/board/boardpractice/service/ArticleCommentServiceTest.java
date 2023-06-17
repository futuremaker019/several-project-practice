package com.board.boardpractice.service;

import com.board.boardpractice.domain.Article;
import com.board.boardpractice.domain.ArticleComment;
import com.board.boardpractice.domain.UserAccount;
import com.board.boardpractice.dto.ArticleCommentDto;
import com.board.boardpractice.repository.ArticleCommentRepository;
import com.board.boardpractice.repository.ArticleRepository;
import com.board.boardpractice.repository.UserAccountRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

@DisplayName("비즈니스 로직 - 댓글")
@ExtendWith(MockitoExtension.class)
class ArticleCommentServiceTest {

    @InjectMocks
    private ArticleCommentService sut;

    @Mock private ArticleRepository articleRepository;
    @Mock private ArticleCommentRepository articleCommentRepository;
    @Mock private UserAccountRepository userAccountRepository;


    @DisplayName("댓글 id를 조회하면, 해당하는 댓글 리스트를 반환한다.")
    @Test
    public void givenArticleId_whenSearchComments_thenReturnsArticleComments() {
        // given
        Long articleId = 1L;
        UserAccount userAccount = userAccountRepository.save(UserAccount.of("jung", "1122", null, null, null));
        Optional<Article> article = Optional.of(Article.of(userAccount,"title", "content", "#java"));
        given(articleRepository.findById(articleId)).willReturn(article);

        // when
        List<ArticleCommentDto> articleComments = sut.searchArticleComment(articleId);

        // then
        assertThat(articleComments).isNotNull();
        then(articleRepository).should().findById(articleId);
    }

    @DisplayName("댓글 정보를 저장하면, 댓글을 저장한다.")
    @Test
    public void givenArticleId_whenSave_thenReturnsArticleComments() {
        // given

        // when
//       sut.save(ArticleCommentDto.of("content"));

        // then
    }
}