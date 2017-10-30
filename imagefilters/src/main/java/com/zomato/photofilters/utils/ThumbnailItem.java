package com.zomato.photofilters.utils;

import android.graphics.Bitmap;

import com.zomato.photofilters.imageprocessors.Filter;

/**
 * @author Varun on 01/07/15.
 * Updated on 30/10/2017 @author Ravi Tamada
 */
public class ThumbnailItem {
    public String filterName;
    public Bitmap image;
    public Filter filter;

    public ThumbnailItem() {
        image = null;
        filter = new Filter();
    }
}
