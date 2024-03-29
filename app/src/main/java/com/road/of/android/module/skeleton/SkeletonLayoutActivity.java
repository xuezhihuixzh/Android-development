package com.road.of.android.module.skeleton;

import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;

import com.road.of.android.R;
import com.td.framework.base.activity.CandyBaseActivity;

/**
 * @Author: 薛志辉
 * @Date: 2019/11/6 9:26
 * @Description:
 */
public class SkeletonLayoutActivity extends CandyBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initSkeletonLayout(R.layout.activity_skeleton_layout));

        // 随机
        if (hashCode() % 2 == 0) {
            mSkeletonLayout.setEmptyLayoutId(R.layout.cust_skeleton_base_empty);
            mSkeletonLayout.setRetryLayoutId(R.layout.cust_skeleton_base_retry);
            mSkeletonLayout.setLoadingLayoutId(R.layout.cust_skeleton_base_loading);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_skeleton, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mShowLoading:
                showSkeletonLoading();
                break;
            case R.id.mShowEmpty:
                showSkeletonEmpty();
                break;
            case R.id.mShowContent:
                showSkeletonContent();
                break;
            case R.id.mShowRetry:
                showSkeletonRetry();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onSkeletonRetry() {
        showToast("开始重试");
        showSkeletonLoading();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //加载成功
                showToast("加载成功");
                showSkeletonContent();
            }
        }, 1500);
    }
}
