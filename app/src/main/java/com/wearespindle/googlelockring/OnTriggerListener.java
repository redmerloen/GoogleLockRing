package com.wearespindle.googlelockring;

import android.view.View;

public interface OnTriggerListener {
    int NO_HANDLE = 0;
    int CENTER_HANDLE = 1;

    void onGrabbed(View v, int handle);

    void onReleased(View v, int handle);

    void onTrigger(View v, int target);

    void onGrabbedStateChange(View v, int handle);

    void onFinishFinalAnimation();
}