package com.Kumar.blog.services;

import com.Kumar.blog.domain.entities.User;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);
}
