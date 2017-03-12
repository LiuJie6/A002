package cn.edu.cqu.survey;

/*import android.app.Activity;
import android.app.ListActivity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.List;*/
import java.util.ArrayList;

import java.util.List;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class FourthActivity extends Activity {
      TextView display;
   /* private String[] data = {"apple", "banana", "orange", "watermelon", "pear", "grape", "pineapple", "strawberry",
            "cherry", "mango","1","1","1","1","1","1","1","1","1","1"};*/
    private List<Country> countryList=new ArrayList<Country>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity04);
        display=(TextView) findViewById(R.id.tex4);
       /* ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                FourthActivity.this, android.R.layout.simple_list_item_1, data);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);*/

        initCountry();
        CountryAdapter adapter=new CountryAdapter(FourthActivity.this,R.layout.country_layout,countryList);
         ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new OnItemClickListener(){
        public void onItemClick(AdapterView<?> parent, View view, int position,
        long id) {
            Country country=countryList.get(position);
            Toast.makeText(FourthActivity.this,
              country.getName(), Toast.LENGTH_SHORT).show();
            display.setText("Is your country "+String.valueOf(country.getName()+"?"));
        }
    });

}
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
public void initCountry(){
Country Austria =new Country("Austria");
    countryList.add(Austria);
    Country Andorra=new Country("Andorra");
    countryList.add(Andorra);
    Country Albania=new Country("Albania");
    countryList.add(Albania);
    Country Ireland=new Country("Ireland");
    countryList.add(Ireland);
    Country Belarus=new Country("Belarus");
    countryList.add(Belarus);
    Country Belgium=new Country("Belgium");
    countryList.add(Belgium);
    Country Denmark=new Country("Denmark");
    countryList.add(Denmark);
    Country France=new Country("France ");
    countryList.add(France);
    Country Finland=new Country("Finland");
    countryList.add(Finland);
    Country Croatia=new Country("Croatia");
    countryList.add(Croatia);
    Country Romania=new Country("Romania");
    countryList.add(Romania);
    Country English =new Country("English");
    countryList.add(English);
    Country  Russia  =new Country(" Russia");
    countryList.add( Russia);
    Country Germany =new Country(" Germany ");
    countryList.add(Germany);
    Country Korea =new Country("Korea");
    countryList.add(Korea);
    Country Netherlands =new Country("Netherlands ");
    countryList.add(Netherlands);
    Country Canada =new Country("Canada");
    countryList.add(Canada);
    Country Cameroon =new Country("Cameroon");
    countryList.add(Cameroon);
    Country Qatar =new Country("Qatar");
    countryList.add(Qatar);
    Country Kenya  =new Country("Kenya ");
    countryList.add(Kenya);
    Country Lithuania =new Country("Lithuania");
    countryList.add(Lithuania);
    Country Mongolia =new Country("Mongolia");
    countryList.add(Mongolia);
}
    public void btn4(View v){
        Intent intent = new Intent(getApplicationContext(),
                Activity05.class);
        startActivity(intent);
    }
}

