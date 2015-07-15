package com.fruntime.weneed.base.impl;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.fruntime.weneed.R;
import com.fruntime.weneed.base.BasePage;
import com.fruntime.weneed.base.MyBaseAdapter;
import com.fruntime.weneed.domin.WorkInfo;
import com.lidroid.xutils.util.LogUtils;

/**
 * 发布需求page
 * 
 * @author 温坤哲
 * @date 2015-7-12
 */
public class PublishPage extends BasePage implements OnClickListener {

	private ListView rl_publish;
	private Button btn_publish;

	private List<WorkInfo> works;

	public PublishPage(Context mContext) {
		super(mContext);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected View initView() {
		View view = View.inflate(mContext, R.layout.view_page_publish, null);

		btn_publish = (Button) view.findViewById(R.id.btn_publish);
		btn_publish.setOnClickListener(this);

		rl_publish = (ListView) view.findViewById(R.id.rl_publish);

		return view;
	}

	@Override
	public void initData() {
		works = new ArrayList<WorkInfo>();
		testData();
		PublishAdapter adapter = new PublishAdapter(mContext, works);
		rl_publish.setAdapter(adapter);
	}

	private void testData() {
		for (int i = 0; i < 10; i++) {
			WorkInfo work1 = new WorkInfo();
			work1.setSubject("家政服务");
			work1.setDate("7月11日 9:30");
			work1.setDetail("钟点计时清洁家居");
			work1.setAddress("创新花园1栋202");
			works.add(work1);
		}
	}

	@Override
	public void onClick(View v) {
		LogUtils.d("click publish");
	}

	private class PublishAdapter extends MyBaseAdapter<WorkInfo, ListView> {

		class ViewHolder{
			TextView tv_subject;
			TextView tv_date;
			TextView tv_detail;
			TextView tv_address;

			public ViewHolder(View convertView) {
				tv_subject = (TextView) convertView
						.findViewById(R.id.tv_subject);
				tv_date = (TextView) convertView.findViewById(R.id.tv_date);
				tv_detail = (TextView) convertView.findViewById(R.id.tv_detail);
				tv_address = (TextView) convertView
						.findViewById(R.id.tv_address);
			}

		}

		 private ViewHolder getHolder(View convertView) {
		 ViewHolder holder = (ViewHolder) convertView.getTag();
		 if (holder == null) {
		 holder = new ViewHolder(convertView);
		 convertView.setTag(holder);
		 }
		 return holder;
		 }

		private ViewHolder holder;

		public PublishAdapter(Context context, List<WorkInfo> list) {
			super(context, list);
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			if (convertView == null) {
				convertView = View.inflate(mContext,
						R.layout.view_lv_cell_publish, null);
			}
			holder = this.getHolder(convertView);

			WorkInfo work = works.get(position);
			holder.tv_subject.setText(work.getSubject());
			holder.tv_date.setText(work.getDate());
			holder.tv_detail.setText(work.getDetail());
			holder.tv_address.setText(work.getAddress());
			return convertView;
		}

	}
}