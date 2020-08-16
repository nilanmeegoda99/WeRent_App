package com.example.werent;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class item_listing_page extends Activity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_listing_page);

        Spinner myspinner = (Spinner) findViewById(R.id.spinner);
        Spinner myspinner2 = (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(item_listing_page.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.item_cat));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner.setAdapter(myAdapter);


        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(item_listing_page.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.areas));
        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner2.setAdapter(myAdapter2);


        button = (Button) findViewById(R.id.button9);
        button.setOnClickListener(new View.OnClickListener()
                                  {
                                      @Override
                                      public  void onClick(View v)
                                      {
                                          openItempage();
                                      }
                                  }
        );
    }

    public void  openItempage()
    {
        Intent intent = new Intent(this, item_page.class);
        startActivity(intent);
    }

}
