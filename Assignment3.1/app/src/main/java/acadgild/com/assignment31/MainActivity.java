package acadgild.com.assignment31;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

     EditText editText ;
     Button button;
     String url = "www.google.com";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.et1);
    }
    public void search(View v){

        Intent i = new Intent(Intent.ACTION_WEB_SEARCH);
       /* i.setData(Uri.parse(url));*/
        String query = editText.getText().toString();
        i.putExtra(SearchManager.QUERY,query);
        startActivity(i);

    }
}
