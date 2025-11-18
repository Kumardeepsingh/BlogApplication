package com.Kumar.blog.services.impl;

import com.Kumar.blog.domain.entities.Tag;
import com.Kumar.blog.repositories.TagRepository;
import com.Kumar.blog.services.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TagServiceImpl implements TagService {

    private final TagRepository tagRepository;

    @Override
    public List<Tag> getTags() {
        return tagRepository.findAllWithPostCount();
    }
}
