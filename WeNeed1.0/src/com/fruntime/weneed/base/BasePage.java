package com.fruntime.weneed.base;

import android.content.Context;
import android.view.View;

/**
 * pageª˘¿‡
 * 
 * @author Œ¬¿§’‹
 * @date 2015-7-13
 */
public abstract class BasePage {

	private View rootView;

	protected Context mContext;

	public BasePage(Context mContext) {
		this.mContext = BaseApplication.getContext();
		this.rootView = this.initView();
	}

	public View getRootView() {
		return rootView;
	}

	protected abstract View initView();

	public abstract void initData();

}
