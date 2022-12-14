package com.test.springboot.web.Dto;

import com.test.springboot.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveRequestDto(String title, String content, String ahthor){
        this.title = title;
        this.content = content;
        this.author = ahthor;

    }

    public Posts toEntity(){
        return Posts.builder().title(title).content(content).author(author).build();

    }
}
