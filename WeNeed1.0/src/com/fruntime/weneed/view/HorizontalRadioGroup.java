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
 * ����ѡ��ť
 * 
 * @author ������
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
	 * ��ѡ��ť���µļ�����
	 * 
	 * @author ������
	 * @date 2015-7-13
	 */
	public interface OnCheckedChangeListener {
		/**
		 * ����ѡ��ť1����ʱ�ص��˷���
		 */
		void onRBtn1CheckedChange();

		/**
		 * ����ѡ��ť2����ʱ�ص��˷���
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
