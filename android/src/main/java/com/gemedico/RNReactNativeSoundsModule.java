package com.gemedico;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import android.media.ToneGenerator;
import android.media.AudioManager;

public class RNReactNativeSoundsModule extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;
    private ToneGenerator toneGenerator = new ToneGenerator(AudioManager.STREAM_SYSTEM, 100);
    public RNReactNativeSoundsModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNReactNativeSounds";
    }

    @ReactMethod
    public void PlaySysSound(int soundID) {
        toneGenerator.startTone(soundID);
    }

    @ReactMethod
    public void StopSysSound() {
        toneGenerator.stopTone();
    }
}
