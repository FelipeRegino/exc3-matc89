package trabalho.exercicio3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class tela2 extends AppCompatActivity {
    private Button button2;
    private EditText editText2;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        button2 = (Button) findViewById(R.id.button2);
        editText2 = (EditText) findViewById(R.id.editText2);
        textView2 = (TextView) findViewById(R.id.textView2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text2 = editText2.getText().toString();

                Intent intent = new Intent();
                intent.putExtra("text2", text2);
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });
        Bundle envio = getIntent().getExtras();
        if(envio.getBoolean("envio1")) {
            Bundle extras = getIntent().getExtras();
            String txt1 = extras.getString("text1");
            textView2.setText(txt1);
        }
    }

}
