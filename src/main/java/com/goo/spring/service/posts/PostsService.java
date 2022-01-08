package com.goo.spring.service.posts;

import lombok.RequiredArgsConstructor;
import com.goo.spring.domain.posts.PostsRepository;
import com.goo.spring.web.dto.PostsSaveRequestDto;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
