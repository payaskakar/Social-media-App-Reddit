package com.example.Reddit.App.repository;

import com.example.Reddit.App.model.Comment;
import com.example.Reddit.App.model.Post;
import com.example.Reddit.App.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);

}
