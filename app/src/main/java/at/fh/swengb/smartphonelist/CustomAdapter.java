package at.fh.swengb.smartphonelist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import at.fh.swengb.smartphonelist.model.Smartphone;

/**
 * Created by Markus on 22.11.2016.
 */


public class CustomAdapter extends BaseAdapter {
    List<Smartphone> listSmartphones;
    Context context;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, List<Smartphone> listSmartphones) {
        this.context = applicationContext;
        this.listSmartphones= listSmartphones;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return listSmartphones.size();
    }

    @Override
    public Object getItem(int i) {
        return listSmartphones.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {
            view = inflter.inflate(R.layout.row_item, null);//set layout for displaying items
        }
        TextView viewModel=(TextView)view.findViewById(R.id.textViewListModel);
        TextView viewColor=(TextView)view.findViewById(R.id.textViewListColor);
        TextView viewYear=(TextView)view.findViewById(R.id.textViewListYear);
        TextView viewNumber=(TextView)view.findViewById(R.id.textViewListNumber);


        Smartphone phone = listSmartphones.get(i);
        viewModel.setText(phone.getModel());
        viewColor.setText(phone.getColor());
        viewYear.setText(phone.getYear());
        viewNumber.setText(phone.getSerialnumber());

        return view;
    }
}