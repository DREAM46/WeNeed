package com.fruntime.weneed.base;

import android.app.Application;

/**
 * Application�࣬�����ṩContext�ȹ������
 * 
 * @author ������
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
