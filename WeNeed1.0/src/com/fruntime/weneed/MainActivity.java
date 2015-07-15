package com.fruntime.weneed;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.fruntime.weneed.fragment.MainContentFragment;

/**
 * 
 * @author ������
 * @date 2015-7-12
 */
public class MainActivity extends FragmentActivity {

	private FragmentManager mManager;

	private MainContentFragment mf;

	/**
	 * ������fragment��tag
	 */
	private static final String MAIN_CONTENT_FRAGMENT_TAG = "main_content";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		this.init();

	}

	/**
	 * ��ʼ���ؼ���Ϊ�ؼ��󶨼�����
	 */
	private void init() {

		mManager = this.getSupportFragmentManager();

		FragmentTransaction ft = mManager.beginTransaction();

		mf = new MainContentFragment();
		ft.replace(R.id.fl_main, mf, MAIN_CONTENT_FRAGMENT_TAG);

		ft.commit();

	}

}
