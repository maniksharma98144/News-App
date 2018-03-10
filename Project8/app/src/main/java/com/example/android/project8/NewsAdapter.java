package com.example.android.project8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Manik on 17-04-2017.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> newss) {
        super(context, 0, newss);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }
        News currentNews = getItem(position);

        TextView TitleView = (TextView) listItemView.findViewById(R.id.title);
        TitleView.setText(currentNews.getTitle());

        TextView DescView = (TextView) listItemView.findViewById(R.id.section);
        DescView.setText(currentNews.getSection());
        return listItemView;
    }
}
