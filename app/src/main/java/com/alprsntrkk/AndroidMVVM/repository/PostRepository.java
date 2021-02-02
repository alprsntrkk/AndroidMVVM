package com.alprsntrkk.AndroidMVVM.repository;

import androidx.lifecycle.MutableLiveData;

import com.alprsntrkk.AndroidMVVM.retrofit.PostService;
import com.alprsntrkk.AndroidMVVM.entity.DtPost;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PostRepository {
    private final MutableLiveData<DtPost> dtPost = new MutableLiveData<>();
    private PostService postService;

    public PostRepository(PostService _postService) {
        postService=_postService;
    }

    public MutableLiveData<DtPost> getPost(){


        postService.getPost().enqueue(new Callback<DtPost>() {
            @Override
            public void onResponse(Call<DtPost> call, Response<DtPost> response) {
                dtPost.setValue(response.body());
            }

            @Override
            public void onFailure(Call<DtPost> call, Throwable t) {
                dtPost.postValue(null);
            }
        });
        return dtPost;
    }
}
