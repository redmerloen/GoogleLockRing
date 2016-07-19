package com.wearespindle.spindlelockring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.wearespindle.spindlelockring.library.LockRing;
import com.wearespindle.spindlelockring.library.OnTriggerListener;

public class MainActivity extends AppCompatActivity implements OnTriggerListener {

    LockRing mLockRing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLockRing = (LockRing) findViewById(R.id.lock_ring);
        mLockRing.setOnTriggerListener(this);
        mLockRing.setShowTargetsOnIdle(false);
    }

    @Override
    public void onGrabbed(View view, int handle) {}

    @Override
    public void onReleased(View view, int handle) {}

    @Override
    public void onTrigger(View view, int target) {
        final int resId = mLockRing.getResourceIdForTarget(target);
        switch (resId) {
            case R.drawable.ic_lock_ring_answer:
                Toast.makeText(this, "Anwser selected", Toast.LENGTH_SHORT).show();
                break;

            case R.drawable.ic_lock_ring_decline:
                Toast.makeText(this, "Decline selected", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onGrabbedStateChange(View view, int handle) {}

    @Override
    public void onFinishFinalAnimation() {}
}
