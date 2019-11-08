package tw.org.iii.iiiand03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("brad","Welcome die");
    }
}
