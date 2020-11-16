package com.example.Reddit.App.repository;

import com.example.Reddit.App.model.Post;
import com.example.Reddit.App.model.User;
import com.example.Reddit.App.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
