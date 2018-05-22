package cn.edu.gdmec.android.demo2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by apple on 18/5/22.
 */

public class FgNewsListFragment extends Fragment {
    private int type;
    private TextView tv_news;
    public static FgNewsListFragment newInstance(int type){
        Bundle args=new Bundle();
        FgNewsListFragment fragment=new FgNewsListFragment();
        args.putInt("type",type);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fg_new_list,null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        type=getArguments().getInt("type");
        tv_news=view.findViewById(R.id.tv_news);
        switch (type){
            case FgNewsFragment.NEWS_TYPE_TOP:
                tv_news.setText("top");
                break;
            case FgNewsFragment.NEWS_TYPE_NBA:
                tv_news.setText("nba");
                break;
            case FgNewsFragment.NEWS_TYPE_JOKES:
                tv_news.setText("joke");
                break;
        }
    }
}
