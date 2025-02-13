package com.sangarius.blogactiverecord.service;

import com.sangarius.blogactiverecord.model.Comment;
import com.sangarius.blogactiverecord.repository.CommentRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }
}
