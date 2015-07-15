package com.fruntime.weneed.fragment;

import java.util.ArrayList;
import java.util.List;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

import com.fruntime.weneed.R;
import com.fruntime.weneed.base.BaseFragment;
import com.fruntime.weneed.base.BasePage;
import com.fruntime.weneed.base.impl.ChatPage;
import com.fruntime.weneed.base.impl.NearByPage;
import com.fruntime.weneed.base.impl.PersonalPage;
import com.fruntime.weneed.base.impl.PublishPage;
import com.fruntime.weneed.view.NoScrollPager;

/**
 * 主界面的fragment
 * 
 * @author 温坤哲
 * @date 2015-7-13
 */
public class MainContentFragment extends BaseFragment implements
		OnCheckedChangeListener {

	private RadioGroup mRadioGroup;

	private List<BasePage> pages;

	private NoScrollPager pager_main;

	@Override
	protected View initView(LayoutInflater inflater) {

		View view = inflater.inflate(R.layout.view_content_layout, null);

		pages = new ArrayList<BasePage>();

		BasePage page = new PublishPage(mContext);
		page.initData();
		pages.add(page);
		pages.add(new NearByPage(mContext));
		pages.add(new ChatPage(mContext));
		pages.add(new PersonalPage(mContext));

		pager_main = (NoScrollPager) view.findViewById(R.id.pager_main);
		pager_main.setAdapter(new MyPagerAdapter());

		mRadioGroup = (RadioGroup) view.findViewById(R.id.rg_main);
		mRadioGroup.setOnCheckedChangeListener(this);

		return view;
	}

	@Override
	protected void initData() {

	}

	private class MyPagerAdapter extends PagerAdapter {

		@Override
		public int getCount() {
			return pages.size();
		}

		public boolean isViewFromObject(View view, Object obj) {
			return view == obj;
		}

		@Override
		public Object instantiateItem(ViewGroup container, int position) {
			BasePage page = pages.get(position);
			View view = page.getRootView();
			page.initData();
			container.addView(view);
			return view;
		}

		@Override
		public void destroyItem(ViewGroup container, int position, Object object) {
			container.removeView((View) object);
		}

	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		int pos = -1;
		switch (checkedId) {
		case R.id.rb_content_fragment_publish:
			pos = 0;
			break;
		case R.id.rb_content_fragment_neaeBy:
			pos = 1;
			break;
		case R.id.rb_content_fragment_chat:
			pos = 2;
			break;
		case R.id.rb_content_fragment_personal:
			pos = 3;
			break;
		}
		pages.get(pos).initData();
		pager_main.setCurrentItem(pos);
	}

}
