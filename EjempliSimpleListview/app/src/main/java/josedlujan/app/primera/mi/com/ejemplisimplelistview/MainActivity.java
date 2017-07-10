package josedlujan.app.primera.mi.com.ejemplisimplelistview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {
    ListView lista;
    String[] elementos = new String[]{"Elemento 1","Elemento 2","Elemento 3","Elemento 4", "Elemento 5", "Elemento 6", "Elemento 7",
                                        "Elemento 8", "Elemento 9", "Elemento 10", "Elemento 11", "Elemento 12", "Elemento 13",
                                      "Elemento 14", "Elemento 15", "Elemento 16", "Elemento 17", "Elemento 18", "Elemento 19"  };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView) findViewById(R.id.lista);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,android.R.id.text1,elementos);

        lista.setAdapter(adapter);

        lista.setOnItemClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        String pos = String.valueOf(position);
        Toast.makeText(this,"Le diste click a:"+pos,Toast.LENGTH_SHORT).show();
    }
}
