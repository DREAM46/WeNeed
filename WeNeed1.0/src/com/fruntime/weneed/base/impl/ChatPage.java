package com.fruntime.weneed.base.impl;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.fruntime.weneed.base.BasePage;

/**
 * ÁÄÌìpage
 * 
 * @author ÎÂÀ¤ÕÜ
 * @date 2015-7-13
 */
public class ChatPage extends BasePage {

	public ChatPage(Context mContext) {
		super(mContext);
	}

	@Override
	protected View initView() {
		TextView tv = new TextView(mContext);
		tv.setText(ChatPage.class.getSimpleName());
		return tv;
	}

	@Override
	public void initData() {

	}

}
