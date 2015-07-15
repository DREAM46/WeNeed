package com.fruntime.weneed.base;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/**
 * Framentª˘¿‡
 * 
 * @author Œ¬¿§’‹
 * @date 2015-7-12
 */
public abstract class BaseFragment extends Fragment {

	protected Context mContext;
	protected FrameLayout fl_main;
	protected View rootView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mContext = BaseApplication.getContext();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return initView(inflater);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		initData();
	}

	protected abstract View initView(LayoutInflater inflater);

	protected abstract void initData();

}
