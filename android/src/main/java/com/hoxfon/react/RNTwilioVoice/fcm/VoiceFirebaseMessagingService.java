package com.hoxfon.react.RNTwilioVoice.fcm;

import android.annotation.TargetApi;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import com.facebook.react.ReactApplication;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;

import com.hoxfon.react.RNTwilioVoice.BuildConfig;
import com.hoxfon.react.RNTwilioVoice.CallNotificationManager;
import com.twilio.voice.CallInvite;
// import com.twilio.voice.MessageException;
import com.twilio.voice.MessageListener;
import com.twilio.voice.Voice;

import java.util.Map;
import java.util.Random;

import static com.hoxfon.react.RNTwilioVoice.TwilioVoiceModule.TAG;
import static com.hoxfon.react.RNTwilioVoice.TwilioVoiceModule.ACTION_INCOMING_CALL;
import static com.hoxfon.react.RNTwilioVoice.TwilioVoiceModule.INCOMING_CALL_INVITE;
import static com.hoxfon.react.RNTwilioVoice.TwilioVoiceModule.INCOMING_CALL_NOTIFICATION_ID;
import com.hoxfon.react.RNTwilioVoice.SoundPoolManager;

public class VoiceFirebaseMessagingService {

    private CallNotificationManager callNotificationManager;

    public void onCreate() {
        // super.onCreate();
        callNotificationManager = new CallNotificationManager();
    }

    /**
     * Called when message is received.
     *
     * @param remoteMessage Object representing the message received from Firebase Cloud Messaging.
     */

    // private void handleIncomingCall(ReactApplicationContext context,
    //                                 int notificationId,
    //                                 CallInvite callInvite,
    //                                 Intent launchIntent
    // ) {
    //     sendIncomingCallMessageToActivity(context, callInvite, notificationId);
    //     showNotification(context, callInvite, notificationId, launchIntent);
    // }

    /*
     * Send the IncomingCallMessage to the TwilioVoiceModule
     */
    // private void sendIncomingCallMessageToActivity(
    //         ReactApplicationContext context,
    //         CallInvite callInvite,
    //         int notificationId
    // ) {
    //     Intent intent = new Intent(ACTION_INCOMING_CALL);
    //     intent.putExtra(INCOMING_CALL_NOTIFICATION_ID, notificationId);
    //     intent.putExtra(INCOMING_CALL_INVITE, callInvite);
    //     LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    // }

    /*
     * Show the notification in the Android notification drawer
    //  */
    // @TargetApi(20)
    // private void showNotification(ReactApplicationContext context,
    //                               CallInvite callInvite,
    //                               int notificationId,
    //                               Intent launchIntent
    // ) {
    //     if (callInvite != null && callInvite.getState() == CallInvite.State.PENDING) {
    //         callNotificationManager.createIncomingCallNotification(context, callInvite, notificationId, launchIntent);
    //     } else {
    //         SoundPoolManager.getInstance(context.getBaseContext()).stopRinging();
    //         callNotificationManager.removeIncomingCallNotification(context, callInvite, 0);
    //     }
    // }
}
