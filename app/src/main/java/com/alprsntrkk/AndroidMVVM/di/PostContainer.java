package com.alprsntrkk.AndroidMVVM.di;

import com.alprsntrkk.AndroidMVVM.viewmodel.PostViewModel;
import com.alprsntrkk.AndroidMVVM.viewmodel.PostViewModelFactory;
import com.alprsntrkk.AndroidMVVM.repository.PostRepository;
import com.alprsntrkk.AndroidMVVM.retrofit.PostService;
import com.alprsntrkk.AndroidMVVM.retrofit.RetrofitClient;

import retrofit2.Retrofit;

public class PostContainer {
    public Retrofit retrofit = RetrofitClient.getRetrofitInstance();

    public PostService postService = retrofit.create(PostService.class);

    public PostRepository postRepository = new PostRepository(postService);

    public PostViewModelFactory postViewModelFactory = new PostViewModelFactory(postRepository);

    public PostViewModel postViewModel = postViewModelFactory.create();
}
