package com.hoxfon.react.RNTwilioVoice.fcm;

import android.content.Intent;
import android.util.Log;

import static com.hoxfon.react.RNTwilioVoice.TwilioVoiceModule.ACTION_FCM_TOKEN;
import static com.hoxfon.react.RNTwilioVoice.TwilioVoiceModule.TAG;

public class VoiceFirebaseInstanceIDService {

    /**
     * Called if InstanceID token is updated. This may occur if the security of
     * the previous token had been compromised. Note that this is called when the InstanceID token
     * is initially generated so this is where you would retrieve the token.
     */
    // [START refresh_token]
    public void onTokenRefresh() {
        // // Get updated InstanceID token.
        // String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        // Log.d(TAG, "Refreshed token: " + refreshedToken);

        // // Notify Activity of FCM token
        // Intent intent = new Intent(ACTION_FCM_TOKEN);
        // LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }
    // [END refresh_token]

    /**
     * Persist token to third-party servers.
     *
     * Modify this method to associate the user's FCM InstanceID token with any server-side account
     * maintained by your application.
     *
     * @param token The new token.
     */
    private void sendRegistrationToServer(String token) {
        // TODO: Implement this method to send token to your app server.
    }
}
