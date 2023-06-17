package com.board.boardpractice.repository;

import com.board.boardpractice.dto.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
}
