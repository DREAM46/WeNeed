package com.fruntime.weneed.base.impl;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.fruntime.weneed.base.BasePage;

/**
 * 个人中心page
 * 
 * @author 温坤哲
 * @date 2015-7-13
 */
public class PersonalPage extends BasePage {

	public PersonalPage(Context mContext) {
		super(mContext);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected View initView() {
		TextView tv = new TextView(mContext);
		tv.setText(PersonalPage.class.getSimpleName());
		return tv;
	}

	@Override
	public void initData() {
		// TODO Auto-generated method stub

	}

}
