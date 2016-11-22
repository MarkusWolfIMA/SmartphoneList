package at.fh.swengb.smartphonelist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import at.fh.swengb.smartphonelist.model.Smartphone;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private List<Smartphone> listSmartphones;
    private ListView myListView;
    private CustomAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = (ListView) findViewById(R.id.mySmartphoneList);


        listSmartphones = new ArrayList<>();
        listSmartphones.add(new Smartphone("iPhone 6s",2014,"Space Grey","OLKJFDSA12345"));
        listSmartphones.add(new Smartphone("iPhone 6",2014,"Rose Gold","OLKJFDSA12345"));
        listSmartphones.add(new Smartphone("Oneplus One", 2014, "Sandstone Black", "1234567ASDF"));
        listSmartphones.add(new Smartphone("Oneplus Two", 2015, "Sandstone Black", "1234567JKLO"));


        myAdapter = new CustomAdapter(this,listSmartphones);

        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Smartphone selectedSmartphone = listSmartphones.get(i);
        Intent intent = new Intent(view.getContext(),ShowSmartphoneActivity.class);
        intent.putExtra("phone",selectedSmartphone);
        startActivity(intent);

    }
}