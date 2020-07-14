package com.agileengine.agileengineinterview.controller;

import com.agileengine.agileengineinterview.model.ImageDetail;
import com.agileengine.agileengineinterview.model.ImageListResponse;
import com.agileengine.agileengineinterview.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/images")
public class ImageController {

    @Autowired
    ImageService imageService;

    @RequestMapping(method = RequestMethod.GET, value = "/list/{page}")
    public ImageListResponse getImageList(@PathVariable("page") String pageNumber) throws IOException {
        return imageService.fetchImageList(pageNumber);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/detail/{id}")
    public ImageDetail getImageDetail(@PathVariable("id") String id) throws IOException {
        return imageService.getImageDetail(id);
    }


}
