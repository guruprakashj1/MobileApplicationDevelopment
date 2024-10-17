# Environmental Sensor App

This Android application demonstrates how to use environmental sensors in Kotlin. The app specifically uses the ambient temperature sensor as an example, but the concepts can be applied to other environmental sensors as well.

## Overview

The app consists of a single activity that displays the current ambient temperature. It uses the Android Sensor Framework to access and read data from the device's temperature sensor.

## Key Components

### MainActivity.kt

This is the main activity of the app, which implements the `SensorEventListener` interface. Here's a breakdown of its key functions:

- `onCreate()`: Initializes the UI and sensor manager.
- `onResume()`: Registers the sensor listener when the app is in the foreground.
- `onPause()`: Unregisters the sensor listener when the app is in the background.
- `onSensorChanged()`: Callback method that's triggered when new sensor data is available.
- `onAccuracyChanged()`: Callback method for changes in sensor accuracy (not used in this example).

### activity_main.xml

This is the layout file for the main activity. It contains a single `TextView` that displays the temperature reading.

### AndroidManifest.xml

The manifest file declares the app's components and required features. It includes a `<uses-feature>` tag to specify that the app requires a temperature sensor.

### build.gradle

This file specifies the app's dependencies and build configurations.

## Key Concepts

1. **Sensor Manager**: The `SensorManager` class is used to access the device's sensors. It's obtained using `getSystemService(Context.SENSOR_SERVICE)`.

2. **Sensor Types**: Android supports various sensor types. In this example, we use `Sensor.TYPE_AMBIENT_TEMPERATURE` for the ambient temperature sensor.

3. **SensorEventListener**: This interface is implemented to receive notifications from the `SensorManager` when sensor values change.

4. **Sensor Registration**: Sensors are registered in `onResume()` and unregistered in `onPause()` to conserve battery when the app is not in use.

5. **Sensor Events**: Sensor data is received in the `onSensorChanged()` method. The `SensorEvent` object contains the sensor's values.

## Using Other Environmental Sensors

To use other environmental sensors:

1. Change the sensor type in `MainActivity.kt`. For example, to use the light sensor:
   ```kotlin
   lightSensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT)
   ```

2. Update the `<uses-feature>` tag in `AndroidManifest.xml`:
   ```xml
   <uses-feature android:name="android.hardware.sensor.light" android:required="true" />
   ```

3. Modify the `onSensorChanged()` method to handle the new sensor data appropriately.

## Common Environmental Sensors

- Light: `Sensor.TYPE_LIGHT`
- Pressure: `Sensor.TYPE_PRESSURE`
- Relative Humidity: `Sensor.TYPE_RELATIVE_HUMIDITY`
- Ambient Temperature: `Sensor.TYPE_AMBIENT_TEMPERATURE`

## Best Practices

- Always check if a sensor is available before using it, as not all devices have all sensors.
- Unregister sensors when not in use to save battery life.
- Consider the sensor delay (sampling rate) based on your app's needs. Lower delays consume more power.

## Testing

To test the app, run it on a device or emulator that has the required sensor. If testing on an emulator, you may need to simulate sensor data.

## Conclusion

This example demonstrates the basics of working with environmental sensors in Android using Kotlin. By understanding these concepts, you can create more complex applications that utilize various sensors available on Android devices.
