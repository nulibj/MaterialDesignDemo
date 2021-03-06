package ren.solid.materialdesigndemo.fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ren.solid.materialdesigndemo.R;
import ren.solid.materialdesigndemo.adapter.CatViewPagerAdapter;
import ren.solid.materialdesigndemo.fragment.base.BaseFragment;

/**
 * Created by _SOLID
 * Date:2016/3/30
 * Time:11:29
 */
public class MainFragment extends BaseFragment {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;


    @Override
    protected int setLayoutResourceID() {
        return R.layout.fragment_main;
    }

    @Override
    protected void initView() {
        mTabLayout = customFindViewById(R.id.sliding_tabs);
        mViewPager = customFindViewById(R.id.viewpager);


        List<String> titles = new ArrayList<>();
        titles.add("找书籍");
        titles.add("找电影");

        CatViewPagerAdapter viewPagerAdapter = new CatViewPagerAdapter(getMContext(), titles, getFragmentManager());
        mViewPager.setAdapter(viewPagerAdapter);

        mTabLayout.addTab(mTabLayout.newTab().setText("读书"));
        mTabLayout.addTab(mTabLayout.newTab().setText("电影"));
        mTabLayout.setupWithViewPager(mViewPager);

        dynamicAddSkinView(mTabLayout, "tabIndicatorColor", R.color.colorAccent);
    }
}
