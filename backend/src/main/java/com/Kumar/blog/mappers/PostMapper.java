package com.Kumar.blog.mappers;

import com.Kumar.blog.domain.dtos.PostDto;
import com.Kumar.blog.domain.entities.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PostMapper {

    @Mapping(target ="author", source = "author")
    @Mapping(target ="category", source = "category")
    @Mapping(target ="tags", source = "tags")
    PostDto toDto(Post post);
}
