package com.example.demo.dto;

import lombok.Data;

@Data
public class PostRequestDto {
    private Long userId;
    private String title;
    private String content;
}
