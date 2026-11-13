package com.melodieliona.todolist.dto;

import java.time.LocalDateTime;

import com.melodieliona.todolist.entity.Category;

import lombok.Builder;

@Builder
public record TaskResponse(Long id, String title, String description, Boolean completed, LocalDateTime createdAt,
        CategoryResponse category) {
}
