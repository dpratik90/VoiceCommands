package com.example.voicecommands;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.util.Log;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;

public class Service extends AccessibilityService {
	
	private static String TAG = Service.class.getName() ;
	@Override
	public void onAccessibilityEvent(AccessibilityEvent event) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void onCreate() {
		Log.d("VoiceCommandService", "Service created!");
	}

	@Override
	public void onInterrupt() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public boolean onKeyEvent(KeyEvent event) {
		Log.d("VoiceCommandService", event.toString());
		return false;
	}

	@Override
	public void onServiceConnected() {
		Log.d("VoiceCommandService", "Service connected!");
		AccessibilityServiceInfo info = new AccessibilityServiceInfo();
	    info.eventTypes = AccessibilityEvent.TYPE_NOTIFICATION_STATE_CHANGED;
	    info.feedbackType = AccessibilityServiceInfo.FEEDBACK_ALL_MASK;
	    info.notificationTimeout = 100;
	    setServiceInfo(info);
	}
}
