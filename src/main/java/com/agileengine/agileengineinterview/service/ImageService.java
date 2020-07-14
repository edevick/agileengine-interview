package com.agileengine.agileengineinterview.service;


import com.agileengine.agileengineinterview.model.HttpUtil;
import com.agileengine.agileengineinterview.model.ImageDetail;
import com.agileengine.agileengineinterview.model.ImageListResponse;
import com.google.gson.Gson;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@EnableCaching
public class ImageService {


    public ImageListResponse fetchImageList(String pageNumber) throws IOException {

        final String responseString = HttpUtil.get("/images/?page=" + pageNumber);

        Gson gson = new Gson();

        final ImageListResponse response = gson.fromJson(responseString, ImageListResponse.class);

        return response;
    }

    public ImageDetail getImageDetail(final String id) throws IOException{
        final String responseString = HttpUtil.get("/images/" + id);

        Gson gson = new Gson();

        final ImageDetail response = gson.fromJson(responseString, ImageDetail.class);

        return response;
    }
}
