package edu.temple.testbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;

import java.util.List;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if (getSupportActionBar() != null) {
//            getSupportActionBar().setTitle("Browser Tester");
//        }
//        android.widget.Button button = new android.widget.Button(this);
//        button.setText("Click Here to open Temple's website!");
//        button.setOnClickListener(new android.view.View.OnClickListener() {
//            @Override
//            public void onClick(android.view.View v) {
//
//                Intent baseIntent = new Intent(Intent.ACTION_VIEW);
//                baseIntent.setData(Uri.parse("https://www.temple.edu"));
//                Intent chooserIntent = Intent.createChooser(baseIntent, "Select Application");
//                startActivity(chooserIntent);
//            }
//        });
//        setContentView(button);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Browser Tester");
        }
        android.widget.Button button = new android.widget.Button(this);
        button.setText("Click Here to open Temple's website!");
        button.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                startActivity(new android.content.Intent(android.content.Intent.ACTION_VIEW, android.net. Uri.parse("http://www.temple.edu")));
            }
        });
        setContentView(button);
    }
}