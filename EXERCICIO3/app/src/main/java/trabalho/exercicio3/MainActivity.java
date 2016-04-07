package trabalho.exercicio3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text1 = editText.getText().toString();

                Intent intent = new Intent(MainActivity.this, tela2.class);
                intent.putExtra("text1", text1);
                intent.putExtra("envio1", true);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onRestart() {
        Bundle extras = getIntent().getExtras();
        String txt2 = extras.getString("text2");
        textView.setText(txt2);

        super.onRestart();
    }
}
