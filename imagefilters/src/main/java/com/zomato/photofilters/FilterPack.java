package com.zomato.photofilters;

import android.content.Context;

import com.zomato.photofilters.geometry.Point;
import com.zomato.photofilters.imageprocessors.Filter;
import com.zomato.photofilters.imageprocessors.subfilters.BrightnessSubFilter;
import com.zomato.photofilters.imageprocessors.subfilters.ColorOverlaySubFilter;
import com.zomato.photofilters.imageprocessors.subfilters.ContrastSubFilter;
import com.zomato.photofilters.imageprocessors.subfilters.SaturationSubfilter;
import com.zomato.photofilters.imageprocessors.subfilters.ToneCurveSubFilter;
import com.zomato.photofilters.imageprocessors.subfilters.VignetteSubfilter;

import java.util.ArrayList;
import java.util.List;

/**
 * Originally created by @author Varun on 01/07/15.
 * <p>
 * Added filters by @author Ravi Tamada on 29/11/17.
 * Added multiple filters, the filter names were inspired from
 * various image filters apps
 */
public final class FilterPack {

    private FilterPack() {
    }

    /***
     * the filter pack,
     * @param context
     * @return list of filters
     */
    public static List<Filter> getFilterPack(Context context) {
        List<Filter> filters = new ArrayList<>();
        filters.add(getAweStruckVibeFilter(context));
        filters.add(getClarendon(context));
        filters.add(getOldManFilter(context));
        filters.add(getMarsFilter(context));
        filters.add(getRiseFilter(context));
        filters.add(getAprilFilter(context));
        filters.add(getAmazonFilter(context));
        filters.add(getStarLitFilter(context));
        filters.add(getNightWhisperFilter(context));
        filters.add(getLimeStutterFilter(context));
        filters.add(getHaanFilter(context));
        filters.add(getBlueMessFilter(context));
        filters.add(getAdeleFilter(context));
        filters.add(getCruzFilter(context));
        filters.add(getMetropolis(context));
        filters.add(getAudreyFilter(context));
        return filters;
    }

    public static Filter getStarLitFilter(Context context) {
        Point[] rgbKnots;
        rgbKnots = new Point[8];
        rgbKnots[0] = new Point(0, 0);
        rgbKnots[1] = new Point(34, 6);
        rgbKnots[2] = new Point(69, 23);
        rgbKnots[3] = new Point(100, 58);
        rgbKnots[4] = new Point(150, 154);
        rgbKnots[5] = new Point(176, 196);
        rgbKnots[6] = new Point(207, 233);
        rgbKnots[7] = new Point(255, 255);
        Filter filter = new Filter();
        filter.setName(context.getString(R.string.starlit));
        filter.addSubFilter(new ToneCurveSubFilter(rgbKnots, null, null, null));
        return filter;
    }

    public static Filter getBlueMessFilter(Context context) {
        Point[] redKnots;
        redKnots = new Point[8];
        redKnots[0] = new Point(0, 0);
        redKnots[1] = new Point(86, 34);
        redKnots[2] = new Point(117, 41);
        redKnots[3] = new Point(146, 80);
        redKnots[4] = new Point(170, 151);
        redKnots[5] = new Point(200, 214);
        redKnots[6] = new Point(225, 242);
        redKnots[7] = new Point(255, 255);
        Filter filter = new Filter();
        filter.setName(context.getString(R.string.bluemess));
        filter.addSubFilter(new ToneCurveSubFilter(null, redKnots, null, null));
        filter.addSubFilter(new BrightnessSubFilter(30));
        filter.addSubFilter(new ContrastSubFilter(1f));
        return filter;
    }

    public static Filter getAweStruckVibeFilter(Context context) {
        Point[] rgbKnots;
        Point[] redKnots;
        Point[] greenKnots;
        Point[] blueKnots;

        rgbKnots = new Point[5];
        rgbKnots[0] = new Point(0, 0);
        rgbKnots[1] = new Point(80, 43);
        rgbKnots[2] = new Point(149, 102);
        rgbKnots[3] = new Point(201, 173);
        rgbKnots[4] = new Point(255, 255);

        redKnots = new Point[5];
        redKnots[0] = new Point(0, 0);
        redKnots[1] = new Point(125, 147);
        redKnots[2] = new Point(177, 199);
        redKnots[3] = new Point(213, 228);
        redKnots[4] = new Point(255, 255);


        greenKnots = new Point[6];
        greenKnots[0] = new Point(0, 0);
        greenKnots[1] = new Point(57, 76);
        greenKnots[2] = new Point(103, 130);
        greenKnots[3] = new Point(167, 192);
        greenKnots[4] = new Point(211, 229);
        greenKnots[5] = new Point(255, 255);


        blueKnots = new Point[7];
        blueKnots[0] = new Point(0, 0);
        blueKnots[1] = new Point(38, 62);
        blueKnots[2] = new Point(75, 112);
        blueKnots[3] = new Point(116, 158);
        blueKnots[4] = new Point(171, 204);
        blueKnots[5] = new Point(212, 233);
        blueKnots[6] = new Point(255, 255);

        Filter filter = new Filter();
        filter.setName(context.getString(R.string.struck));
        filter.addSubFilter(new ToneCurveSubFilter(rgbKnots, redKnots, greenKnots, blueKnots));
        return filter;
    }

    public static Filter getLimeStutterFilter(Context context) {
        Point[] blueKnots;
        blueKnots = new Point[3];
        blueKnots[0] = new Point(0, 0);
        blueKnots[1] = new Point(165, 114);
        blueKnots[2] = new Point(255, 255);
        Filter filter = new Filter();
        filter.setName(context.getString(R.string.lime));
        filter.addSubFilter(new ToneCurveSubFilter(null, null, null, blueKnots));
        return filter;
    }

    public static Filter getNightWhisperFilter(Context context) {
        Point[] rgbKnots;
        Point[] redKnots;
        Point[] greenKnots;
        Point[] blueKnots;

        rgbKnots = new Point[3];
        rgbKnots[0] = new Point(0, 0);
        rgbKnots[1] = new Point(174, 109);
        rgbKnots[2] = new Point(255, 255);

        redKnots = new Point[4];
        redKnots[0] = new Point(0, 0);
        redKnots[1] = new Point(70, 114);
        redKnots[2] = new Point(157, 145);
        redKnots[3] = new Point(255, 255);

        greenKnots = new Point[3];
        greenKnots[0] = new Point(0, 0);
        greenKnots[1] = new Point(109, 138);
        greenKnots[2] = new Point(255, 255);

        blueKnots = new Point[3];
        blueKnots[0] = new Point(0, 0);
        blueKnots[1] = new Point(113, 152);
        blueKnots[2] = new Point(255, 255);

        Filter filter = new Filter();
        filter.setName(context.getString(R.string.whisper));
        filter.addSubFilter(new ContrastSubFilter(1.5f));
        filter.addSubFilter(new ToneCurveSubFilter(rgbKnots, redKnots, greenKnots, blueKnots));
        return filter;
    }

    public static Filter getAmazonFilter(Context context) {
        Point[] blueKnots;
        blueKnots = new Point[6];
        blueKnots[0] = new Point(0, 0);
        blueKnots[1] = new Point(11, 40);
        blueKnots[2] = new Point(36, 99);
        blueKnots[3] = new Point(86, 151);
        blueKnots[4] = new Point(167, 209);
        blueKnots[5] = new Point(255, 255);
        Filter filter = new Filter(context.getString(R.string.amazon));
        filter.addSubFilter(new ContrastSubFilter(1.2f));
        filter.addSubFilter(new ToneCurveSubFilter(null, null, null, blueKnots));
        return filter;
    }

    public static Filter getAdeleFilter(Context context) {
        Filter filter = new Filter(context.getString(R.string.adele));
        filter.addSubFilter(new SaturationSubfilter(-100f));
        return filter;
    }

    public static Filter getCruzFilter(Context context) {
        Filter filter = new Filter(context.getString(R.string.cruz));
        filter.addSubFilter(new SaturationSubfilter(-100f));
        filter.addSubFilter(new ContrastSubFilter(1.3f));
        filter.addSubFilter(new BrightnessSubFilter(20));
        return filter;
    }

    public static Filter getMetropolis(Context context) {
        Filter filter = new Filter(context.getString(R.string.metropolis));
        filter.addSubFilter(new SaturationSubfilter(-1f));
        filter.addSubFilter(new ContrastSubFilter(1.7f));
        filter.addSubFilter(new BrightnessSubFilter(70));
        return filter;
    }

    public static Filter getAudreyFilter(Context context) {
        Filter filter = new Filter(context.getString(R.string.audrey));

        Point[] redKnots;
        redKnots = new Point[3];
        redKnots[0] = new Point(0, 0);
        redKnots[1] = new Point(124, 138);
        redKnots[2] = new Point(255, 255);

        filter.addSubFilter(new SaturationSubfilter(-100f));
        filter.addSubFilter(new ContrastSubFilter(1.3f));
        filter.addSubFilter(new BrightnessSubFilter(20));
        filter.addSubFilter(new ToneCurveSubFilter(null, redKnots, null, null));
        return filter;
    }

    public static Filter getRiseFilter(Context context) {
        Point[] blueKnots;
        Point[] redKnots;

        blueKnots = new Point[4];
        blueKnots[0] = new Point(0, 0);
        blueKnots[1] = new Point(39, 70);
        blueKnots[2] = new Point(150, 200);
        blueKnots[3] = new Point(255, 255);

        redKnots = new Point[4];
        redKnots[0] = new Point(0, 0);
        redKnots[1] = new Point(45, 64);
        redKnots[2] = new Point(170, 190);
        redKnots[3] = new Point(255, 255);

        Filter filter = new Filter(context.getString(R.string.rise));
        filter.addSubFilter(new ContrastSubFilter(1.9f));
        filter.addSubFilter(new BrightnessSubFilter(60));
        filter.addSubFilter(new VignetteSubfilter(context, 200));
        filter.addSubFilter(new ToneCurveSubFilter(null, redKnots, null, blueKnots));
        return filter;
    }

    public static Filter getMarsFilter(Context context) {
        Filter filter = new Filter(context.getString(R.string.mars));
        filter.addSubFilter(new ContrastSubFilter(1.5f));
        filter.addSubFilter(new BrightnessSubFilter(10));
        return filter;
    }

    public static Filter getAprilFilter(Context context) {
        Point[] blueKnots;
        Point[] redKnots;

        blueKnots = new Point[4];
        blueKnots[0] = new Point(0, 0);
        blueKnots[1] = new Point(39, 70);
        blueKnots[2] = new Point(150, 200);
        blueKnots[3] = new Point(255, 255);

        redKnots = new Point[4];
        redKnots[0] = new Point(0, 0);
        redKnots[1] = new Point(45, 64);
        redKnots[2] = new Point(170, 190);
        redKnots[3] = new Point(255, 255);

        Filter filter = new Filter(context.getString(R.string.april));
        filter.addSubFilter(new ContrastSubFilter(1.5f));
        filter.addSubFilter(new BrightnessSubFilter(5));
        filter.addSubFilter(new VignetteSubfilter(context, 150));
        filter.addSubFilter(new ToneCurveSubFilter(null, redKnots, null, blueKnots));
        return filter;
    }

    public static Filter getHaanFilter(Context context) {
        Point[] greenKnots;
        greenKnots = new Point[3];
        greenKnots[0] = new Point(0, 0);
        greenKnots[1] = new Point(113, 142);
        greenKnots[2] = new Point(255, 255);

        Filter filter = new Filter(context.getString(R.string.haan));
        filter.addSubFilter(new ContrastSubFilter(1.3f));
        filter.addSubFilter(new BrightnessSubFilter(60));
        filter.addSubFilter(new VignetteSubfilter(context, 200));
        filter.addSubFilter(new ToneCurveSubFilter(null, null, greenKnots, null));
        return filter;
    }

    public static Filter getOldManFilter(Context context) {
        Filter filter = new Filter(context.getString(R.string.oldman));
        filter.addSubFilter(new BrightnessSubFilter(30));
        filter.addSubFilter(new SaturationSubfilter(0.8f));
        filter.addSubFilter(new ContrastSubFilter(1.3f));
        filter.addSubFilter(new VignetteSubfilter(context, 100));
        filter.addSubFilter(new ColorOverlaySubFilter(100, .2f, .2f, .1f));
        return filter;
    }

    public static Filter getClarendon(Context context) {
        Point[] redKnots;
        Point[] greenKnots;
        Point[] blueKnots;

        redKnots = new Point[4];
        redKnots[0] = new Point(0, 0);
        redKnots[1] = new Point(56, 68);
        redKnots[2] = new Point(196, 206);
        redKnots[3] = new Point(255, 255);


        greenKnots = new Point[4];
        greenKnots[0] = new Point(0, 0);
        greenKnots[1] = new Point(46, 77);
        greenKnots[2] = new Point(160, 200);
        greenKnots[3] = new Point(255, 255);


        blueKnots = new Point[4];
        blueKnots[0] = new Point(0, 0);
        blueKnots[1] = new Point(33, 86);
        blueKnots[2] = new Point(126, 220);
        blueKnots[3] = new Point(255, 255);

        Filter filter = new Filter(context.getString(R.string.clarendon));
        filter.addSubFilter(new ContrastSubFilter(1.5f));
        filter.addSubFilter(new BrightnessSubFilter(-10));
        filter.addSubFilter(new ToneCurveSubFilter(null, redKnots, greenKnots, blueKnots));
        return filter;
    }
}
