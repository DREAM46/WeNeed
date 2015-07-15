package com.fruntime.weneed.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import com.fruntime.weneed.R;

/**
 * 横向单选按钮
 * 
 * @author 温坤哲
 * @date 2015-7-13
 */
public class HorizontalRadioGroup extends RelativeLayout implements
		android.widget.RadioGroup.OnCheckedChangeListener {

	private RadioButton mRb1;
	private RadioButton mRb2;

	private static final String ATTR_SCHEMA = "http://schemas.android.com/apk/res/com.fruntime.weneed";

	public HorizontalRadioGroup(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context, attrs);
	}

	private void init(Context context, AttributeSet attrs) {

		View view = View.inflate(context, R.layout.view_radiogroup, this);

		mRb1 = (RadioButton) view.findViewById(R.id.rb1);
		mRb2 = (RadioButton) view.findViewById(R.id.rb2);

		Resources resources = context.getResources();

		String rb1_text = resources.getString(Integer.parseInt(attrs
				.getAttributeValue(ATTR_SCHEMA, "rb1_text").substring(1)));
		mRb1.setText(rb1_text);

		String rb2_text = resources.getString(Integer.parseInt(attrs
				.getAttributeValue(ATTR_SCHEMA, "rb2_text").substring(1)));
		mRb2.setText(rb2_text);

		RadioGroup rg = (RadioGroup) view.findViewById(R.id.rg_hor);
		rg.setOnCheckedChangeListener(this);
	}

	/**
	 * 单选按钮按下的监听器
	 * 
	 * @author 温坤哲
	 * @date 2015-7-13
	 */
	public interface OnCheckedChangeListener {
		/**
		 * 当单选按钮1按下时回调此方法
		 */
		void onRBtn1CheckedChange();

		/**
		 * 当单选按钮2按下时回调此方法
		 */
		void onRBtn2CheckedChange();
	}

	private OnCheckedChangeListener onCheckedChangeListener;

	public void setOnCheckedChangeListener(
			OnCheckedChangeListener onCheckedChangeListener) {
		this.onCheckedChangeListener = onCheckedChangeListener;
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		switch (checkedId) {
		case R.id.rb1:
			if (onCheckedChangeListener != null)
				onCheckedChangeListener.onRBtn1CheckedChange();
			break;
		case R.id.rb2:
			if (onCheckedChangeListener != null)
				onCheckedChangeListener.onRBtn2CheckedChange();
			break;
		}
	}
}
