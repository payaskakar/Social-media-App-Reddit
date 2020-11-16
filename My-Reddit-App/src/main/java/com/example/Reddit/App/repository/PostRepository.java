package com.example.Reddit.App.repository;

import com.example.Reddit.App.model.Post;
import com.example.Reddit.App.model.Subreddit;
import com.example.Reddit.App.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
