package at.fh.swengb.smartphonelist;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import at.fh.swengb.smartphonelist.model.Smartphone;

public class ShowSmartphoneActivity extends AppCompatActivity {
    private Smartphone phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_smartphone);

        Intent intent = getIntent();
        phone = (Smartphone)intent.getExtras().get("phone");

        TextView viewModel=(TextView) findViewById(R.id.textViewModel);
        TextView viewColor=(TextView) findViewById(R.id.textViewColor);
        TextView viewYear=(TextView) findViewById(R.id.textViewYear);
        TextView viewNumber=(TextView) findViewById(R.id.textViewNumber);

        viewModel.setText(phone.getModel());
        viewColor.setText(phone.getColor());
        viewYear.setText(phone.getYear());
        viewNumber.setText(phone.getSerialnumber());

    }

    public void showWebpage(View view) {

        Uri address = Uri.parse("https://www.google.at/webhp?&ie=UTF-8#q="+(phone.getModel().replace(" ","%20")));
        Intent webIntent = new Intent(Intent.ACTION_VIEW, address);
        startActivity(webIntent);
    }

    public void call(View view) {
        //Uri number = Uri.parse("tel:"+user.getPhoneNumber());
        //Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        //startActivity(callIntent);
    }

}
