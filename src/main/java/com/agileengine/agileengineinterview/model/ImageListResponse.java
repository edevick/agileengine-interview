package com.agileengine.agileengineinterview.model;

import java.util.List;

public class ImageListResponse {

    private List<Picture> pictures;
    private long page;
    private long pageCount;
    private boolean hasMore;

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(final List<Picture> pictures) {
        this.pictures = pictures;
    }

    public long getPage() {
        return page;
    }

    public void setPage(final long page) {
        this.page = page;
    }

    public long getPageCount() {
        return pageCount;
    }

    public void setPageCount(final long pageCount) {
        this.pageCount = pageCount;
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(final boolean hasMore) {
        this.hasMore = hasMore;
    }

}
