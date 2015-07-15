package com.fruntime.weneed.base;

import java.util.List;

import android.content.Context;
import android.widget.BaseAdapter;

/**
 * Adapter适配器基类
 * 
 * @author 温坤哲
 * @date 2015-7-12
 * @param <T>
 *            适配器的数据类型
 * @param <Q>
 *            适配器的View类型
 */
public abstract class MyBaseAdapter<T, Q> extends BaseAdapter {

	public Context context;
	public List<T> list;//
	public Q view; // 这里不一定是ListView,比如GridView,CustomListView

	public MyBaseAdapter(Context context, List<T> list, Q view) {
		this.context = context;
		this.list = list;
		this.view = view;
	}

	public MyBaseAdapter(Context context, List<T> list) {
		this.context = context;
		this.list = list;
	}

	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

}
