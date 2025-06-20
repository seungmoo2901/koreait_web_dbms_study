package com.koreait.dbms_study.dto;

import com.koreait.dbms_study.entity.JpaPost;
import com.koreait.dbms_study.entity.Post;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class AddPostJpaReqDto {
    private String title;
    private String content;
    private Integer userId;

    public JpaPost toJpaEntity(){
        return JpaPost.builder()
                .title(this.title)
                .content(this.content)
                .userId(this.userId)
                .createDt(LocalDateTime.now())
                .build();
    }


}
