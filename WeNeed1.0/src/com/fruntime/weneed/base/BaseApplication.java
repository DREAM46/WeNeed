package com.fruntime.weneed.base;

import android.app.Application;

/**
 * Application类，用于提供Context等共享变量
 * 
 * @author 温坤哲
 * @date 2015-7-12
 */
public class BaseApplication extends Application {

	private static BaseApplication mContext = null;

	public static BaseApplication getContext() {
		return mContext;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		mContext = this;
	}

}
