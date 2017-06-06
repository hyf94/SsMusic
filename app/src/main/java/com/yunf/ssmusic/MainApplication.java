package com.yunf.ssmusic;

import android.app.Application;
import android.content.Context;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;

import com.bilibili.magicasakura.utils.ThemeUtils;
import com.google.gson.Gson;

/**
 * Created by Administrator on 2017/5/15 0015.
 */

public class MainApplication extends Application implements ThemeUtils.switchColor {
    public static Context context;
    private static Gson gson;
    public static Gson gsonInstance() {
        if (gson == null) {
            gson = new Gson();
        }
        return gson;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        ThemeUtils.setSwitchColor(this);
    }

    //捕获全局Exception 重启界面
//    public void initCatchException() {
//        //设置该CrashHandler为程序的默认处理器
//        UnceHandler catchExcep = new UnceHandler(this);
//        Thread.setDefaultUncaughtExceptionHandler(catchExcep);
//    }

    @Override
    public int replaceColorById(Context context, @ColorRes int colorId) {
        return 0;
    }

    @Override
    public int replaceColor(Context context, @ColorInt int color) {
        return 0;
    }

//    private String getTheme(Context context) {
//        if (ThemeHelper.getTheme(context) == ThemeHelper.CARD_STORM) {
//            return "blue";
//        } else if (ThemeHelper.getTheme(context) == ThemeHelper.CARD_HOPE) {
//            return "purple";
//        } else if (ThemeHelper.getTheme(context) == ThemeHelper.CARD_WOOD) {
//            return "green";
//        } else if (ThemeHelper.getTheme(context) == ThemeHelper.CARD_LIGHT) {
//            return "green_light";
//        } else if (ThemeHelper.getTheme(context) == ThemeHelper.CARD_THUNDER) {
//            return "yellow";
//        } else if (ThemeHelper.getTheme(context) == ThemeHelper.CARD_SAND) {
//            return "orange";
//        } else if (ThemeHelper.getTheme(context) == ThemeHelper.CARD_FIREY) {
//            return "red";
//        }
//        return null;
//    }
}
