package com.alprsntrkk.AndroidMVVM.retrofit;

import com.alprsntrkk.AndroidMVVM.entity.DtPost;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostService {

    @GET("posts/1")
    Call<DtPost> getPost();
}
