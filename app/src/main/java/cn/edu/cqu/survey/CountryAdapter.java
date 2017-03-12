package cn.edu.cqu.survey;
import java.util.List;
import java.util.concurrent.Callable;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
/**
 * Created by Administrator on 2017/3/11.
 */

public class CountryAdapter extends ArrayAdapter<Country> {
    private int resourceId;

    public CountryAdapter(Context context, int textViewResourceId,

                        List<Country> objects) {

        super(context, textViewResourceId, objects);
        resourceId=textViewResourceId;
    }


    public View getView(int position, View convertView, ViewGroup parent) {


       Country country=getItem(position);//获取当前项的Fruit实例


        View view=LayoutInflater.from(getContext()).inflate(resourceId, null);
        TextView countryName=(TextView) view.findViewById(R.id.Country_name);
        countryName.setText(country.getName());
        return view;
    }
}
