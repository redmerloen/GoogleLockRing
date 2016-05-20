package com.wearespindle.googlelockviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.wearespindle.googlelockring.GoogleLockRingView;
import com.wearespindle.googlelockring.OnTriggerListener;

public class MainActivity extends Activity implements OnTriggerListener {

    private GoogleLockRingView mGoogleLockView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGoogleLockView = (GoogleLockRingView) findViewById(R.id.google_lock_ring_view);

        mGoogleLockView.setOnTriggerListener(this);

        // uncomment this to make sure the glowpad doesn't vibrate on touch
        // mGlowPadView.setVibrateEnabled(false);

        // uncomment this to hide targets
        mGoogleLockView.setShowTargetsOnIdle(true);
    }

    @Override
    public void onGrabbed(View v, int handle) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onReleased(View v, int handle) {
        mGoogleLockView.ping();

    }

    @Override
    public void onTrigger(View v, int target) {
        final int resId = mGoogleLockView.getResourceIdForTarget(target);
        switch (resId) {
            case R.drawable.ic_item_camera:
                Toast.makeText(this, "Camera selected", Toast.LENGTH_SHORT).show();
                break;

            case R.drawable.ic_item_google:
                Toast.makeText(this, "Google selected", Toast.LENGTH_SHORT).show();

                break;
            default:
                // Code should never reach here.
        }

    }

    @Override
    public void onGrabbedStateChange(View v, int handle) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onFinishFinalAnimation() {
        // TODO Auto-generated method stub

    }

}
