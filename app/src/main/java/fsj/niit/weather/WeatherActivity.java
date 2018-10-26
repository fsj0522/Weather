package fsj.niit.weather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WeatherActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        btnHome=findViewById(R.id.btn_home);

        btnHome.setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_home:
                Intent intentCity=new Intent(WeatherActivity.this,CityActivity.class);
                //intentLogin.putExtra("username",name);
                startActivity(intentCity);
                break;
        }
    }


}
