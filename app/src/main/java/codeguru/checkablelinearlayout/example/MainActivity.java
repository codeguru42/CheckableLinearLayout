package codeguru.checkablelinearlayout.example;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    private static final String[] words = { "lorem", "ipsum", "dolor",
            "sit", "amet", "consectetuer", "adipiscing", "elit", "morbi",
            "vel", "ligula", "vitae", "arcu", "aliquet", "mollis", "etiam",
            "vel", "erat", "placerat", "ante", "porttitor", "sodales",
            "pellentesque", "augue", "purus" };
    private ListView mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mList = (ListView) findViewById(android.R.id.list);
        ListAdapter adapter = new ArrayAdapter<>(this, R.layout.row, R.id.word, words);
        mList.setAdapter(adapter);

        mList.setChoiceMode(AbsListView.CHOICE_MODE_MULTIPLE_MODAL);
        mList.setMultiChoiceModeListener(new ExampleMultiChoiceModeListener(this));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void toastWords() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < words.length; ++i) {
            if (mList.isItemChecked(i)) {
                builder.append(words[i]).append("\n");
            }
        }

        Toast.makeText(this, builder.toString(), Toast.LENGTH_LONG).show();
    }

}
