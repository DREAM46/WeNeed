package com.fruntime.weneed.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * ÎÞ·¨·­Ò³µÄViewPager
 * @author ÎÂÀ¤ÕÜ
 * @date 2015-7-13
 */
public class NoScrollPager extends ViewPager {

	public NoScrollPager(Context context) {
		super(context);
	}

	public NoScrollPager(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent arg0) {
		return false;
	}

	@Override
	public boolean onTouchEvent(MotionEvent arg0) {
		return false;
	}

}
