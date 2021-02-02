package com.alprsntrkk.AndroidMVVM.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.alprsntrkk.AndroidMVVM.entity.DtPost;
import com.alprsntrkk.AndroidMVVM.repository.PostRepository;

public class PostViewModel extends ViewModel {
    private PostRepository postRepository;
    public PostViewModel(PostRepository _postRepository) {
        postRepository=_postRepository;
    }

    private MutableLiveData<DtPost> post;

    public MutableLiveData<DtPost> getPost(){
        post = postRepository.getPost();
        return post;
    }
}
