package com.alprsntrkk.AndroidMVVM.viewmodel;

import com.alprsntrkk.AndroidMVVM.repository.PostRepository;

public class PostViewModelFactory {
    private final PostRepository userRepository;

    public PostViewModelFactory(PostRepository userRepository) {
        this.userRepository = userRepository;
    }

    public PostViewModel create() {
        return new PostViewModel(userRepository);
    }
}
