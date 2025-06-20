package com.koreait.dbms_study.service;

import com.koreait.dbms_study.dto.AddPostJpaReqDto;
import com.koreait.dbms_study.dto.AddPostReqDto;
import com.koreait.dbms_study.entity.JpaPost;
import com.koreait.dbms_study.entity.Post;
import com.koreait.dbms_study.repository.PostJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostJpaService {

    @Autowired
    private PostJpaRepository postJpaRepository;

    public JpaPost addPost(AddPostJpaReqDto addPostJpaReqDto){
        return postJpaRepository.save(addPostJpaReqDto.toJpaEntity());
    }
    public List<JpaPost> getPostList(){
        return postJpaRepository.findAll();
    }
}
