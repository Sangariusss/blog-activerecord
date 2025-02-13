package com.sangarius.blogactiverecord.dto;

import java.util.List;

public record ArticleDTO(Long id, String title, String content, List<CommentDTO> comments) {
}
