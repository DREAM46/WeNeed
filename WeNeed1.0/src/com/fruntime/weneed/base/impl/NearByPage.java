package com.fruntime.weneed.base.impl;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.fruntime.weneed.R;
import com.fruntime.weneed.base.BasePage;
import com.fruntime.weneed.base.MyBaseAdapter;
import com.fruntime.weneed.domin.PersonInfo;

/**
 * 附近的人界面的page
 * 
 * @author 温坤哲
 * @date 2015-7-13
 */
public class NearByPage extends BasePage {

	private ListView rl_nearby;
	private ImageButton ib_nearby_spinner;
	private ImageButton ib_slidingMenu;

	private NearByAdapter adapter;

	private List<PersonInfo> persons;

	public NearByPage(Context mContext) {
		super(mContext);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected View initView() {
		View view = View.inflate(mContext, R.layout.view_page_nearby, null);
		rl_nearby = (ListView) view.findViewById(R.id.rl_nearby);
		ib_nearby_spinner = (ImageButton) view
				.findViewById(R.id.ib_nearby_spinner);
		ib_slidingMenu = (ImageButton) view.findViewById(R.id.ib_slidingMenu);
		return view;
	}

	@Override
	public void initData() {
		persons = new ArrayList<PersonInfo>();
		for (int i = 0; i < 10; i++) {
			PersonInfo person = new PersonInfo();
			person.setFirstName("温");
			person.setSecondName("坤哲");
			person.setSex(i % 2);
			person.setDetail("勤劳，任劳任怨");
			person.setDistance("100m");
			person.setExperince("3年开发经验");
			persons.add(person);
		}
		adapter = new NearByAdapter(mContext, persons);
		rl_nearby.setAdapter(adapter);
	}

	private class NearByAdapter extends MyBaseAdapter<PersonInfo, ListView> {

		class ViewHolder {
			ImageView img_nearby_sex;
			TextView tv_nearby_name;
			TextView tv_nearby_distance;
			TextView tv_experince;
			TextView tv_detail;

			public ViewHolder(View convertView) {
				img_nearby_sex = (ImageView) convertView
						.findViewById(R.id.img_nearby_sex);
				tv_nearby_name = (TextView) convertView
						.findViewById(R.id.tv_nearby_name);
				tv_nearby_distance = (TextView) convertView
						.findViewById(R.id.tv_nearby_distance);
				tv_experince = (TextView) convertView
						.findViewById(R.id.tv_experince);
				tv_detail = (TextView) convertView.findViewById(R.id.tv_detail);

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

		public NearByAdapter(Context context, List<PersonInfo> list) {
			super(context, list);
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			if (convertView == null) {
				convertView = View.inflate(mContext,
						R.layout.view_lv_cell_nearby, null);
			}
			holder = this.getHolder(convertView);
			PersonInfo person = persons.get(position);
			int sex = person.getSex();
			holder.img_nearby_sex.setImageResource(sex == 1 ? R.drawable.boy
					: R.drawable.girl);
			holder.tv_nearby_name.setText(person.getFirstName()
					+ (sex == 1 ? "先生" : "小姐"));
			holder.tv_nearby_distance.setText(person.getDistance());
			holder.tv_experince.setText(person.getExperince());
			holder.tv_detail.setText(person.getDetail());
			return convertView;
		}
	}

}
