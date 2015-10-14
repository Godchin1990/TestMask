package cn.zhuyuli.testmask;

import java.util.Calendar;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.view.Gravity;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.TextView;


public class MaskProgressDialog extends Dialog {
	private long lastClickTime;

	public MaskProgressDialog(Context context) {
		super(context);
	}

	public MaskProgressDialog(Context context, int theme) {
		super(context, theme);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			long currentTime = Calendar.getInstance().getTimeInMillis();
			if (currentTime - lastClickTime < 1000) {
				return true;
			}
			lastClickTime = currentTime;
			this.dismiss();
			break;
		}
		return super.onTouchEvent(event);
	}

}
