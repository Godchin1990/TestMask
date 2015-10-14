package cn.zhuyuli.testmask;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

public class MainActivity extends Activity {

    private MaskProgressDialog maskProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.showMask).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                maskProgressDialog = new MaskProgressDialog(MainActivity.this,
                        R.style.MaskProgressDialog);
                maskProgressDialog.setContentView(R.layout.mask_progress_dialog);
                maskProgressDialog.getWindow().getAttributes().gravity = Gravity.BOTTOM;
                maskProgressDialog.setCancelable(true);
                maskProgressDialog.setCanceledOnTouchOutside(true);
                maskProgressDialog.show();
            }
        });
    }
}
