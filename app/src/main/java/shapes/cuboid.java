package shapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.volume_calculater.R;

public class cuboid extends AppCompatActivity {

    EditText ed1,ed2,ed3;
    Button btn3;
    TextView val1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuboid);

        ed1=findViewById(R.id.cuboid_edittext);
        ed2=findViewById(R.id.cuboid_edittext2);
        ed3=findViewById(R.id.cuboid_edittext3);
        btn3=findViewById(R.id.button_cuboid);
        val1=findViewById(R.id.cuboid_value);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt=ed1.getText().toString();
                String txt2=ed2.getText().toString();
                String txt3=ed3.getText().toString();
                if(txt.equals("") || txt2.equals("") || txt3.equals("")){
                    Toast.makeText(cuboid.this, "Enter Some Value", Toast.LENGTH_SHORT).show();
                    val1.setText("_____");
                }
                else {
                    double num=Integer.parseInt(txt);
                    double num3=Integer.parseInt(txt2);
                    double num4=Integer.parseInt(txt3);
                    double num2=num*num3*num4;
                    String str=String.format("%.2f", num2)+" m3";
                    val1.setText(str);
                }

            }
        });
    }
}