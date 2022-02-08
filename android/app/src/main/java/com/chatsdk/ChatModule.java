package com.chatsdk; // replace com.your-app-name with your app’s name
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;
import io.customerly.Customerly;
import android.util.Log;
import android.app.Activity;
import android.app.AlertDialog;
import android.widget.Toast;  


public class ChatModule extends ReactContextBaseJavaModule {
// ReactApplicationContext reactContex;
   ChatModule(ReactApplicationContext context) {
       super(context);
        this.reactContex= context;
   }

   @Override
   public String getName() {
    return "ChatModule";
   }

   @ReactMethod
   public void createCalendarEvent(String name, String location) {
    // Log.d("CalendarModule", "Create event called with name: " + name
    // + " and location: " + location);
    // AlertDialog.Builder builder1 = new AlertDialog.Builder(ReactApplicationContext context);
    // builder1.setMessage("Write your message here.");
    // builder1.setCancelable(true);
    Customerly.openSupport(getCurrentActivity());
    //  Toast.makeText(getReactApplicationContext(),"Hello Javatpoint", Toast.LENGTH_SHORT).show();  
}
}