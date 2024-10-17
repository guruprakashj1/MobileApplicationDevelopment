# Android Position Sensors Example

This project demonstrates how to use position sensors (accelerometer and magnetometer) in an Android app using Kotlin. It shows real-time sensor data and calculates device orientation.

## Overview

The app uses two primary sensors:

1. **Accelerometer**: Measures the acceleration forces applied to the device, including gravity.
2. **Magnetometer**: Measures the ambient magnetic field in all three axes.

Using data from these sensors, the app also calculates the device's orientation in terms of azimuth, pitch, and roll.

## Key Components

### MainActivity.kt

This is the main activity of the app, responsible for:

- Initializing sensors
- Registering and unregistering sensor listeners
- Processing sensor data
- Updating the UI

Key concepts:

1. **SensorManager**: System service to access device sensors.
2. **SensorEventListener**: Interface to receive notifications from the SensorManager when sensor values change.
3. **onSensorChanged()**: Callback method that's invoked when sensor values change.
4. **getRotationMatrix()**: Computes the device's rotation matrix based on accelerometer and magnetometer data.
5. **getOrientation()**: Computes the device's orientation angles from the rotation matrix.

### activity_main.xml

This layout file defines the UI of the app, which consists of three TextViews to display:

1. Accelerometer data
2. Magnetometer data
3. Calculated orientation angles

### strings.xml

Contains string resources used in the app, including placeholders for sensor data display.

### AndroidManifest.xml

Declares the app's components and permissions. Note that no special permissions are required to use these sensors.

## Sensor Concepts

### Accelerometer

- Measures acceleration forces in m/s² on three axes:
  - X: Lateral movement
  - Y: Longitudinal movement
  - Z: Vertical movement
- Always includes the force of gravity (9.81 m/s²)

### Magnetometer

- Measures the ambient magnetic field in μT (microteslas) on three axes
- Used in conjunction with the accelerometer to determine device orientation

### Orientation Calculation

- **Azimuth**: Angle between the magnetic north direction and the y-axis, around the z-axis (0 to 359 degrees)
- **Pitch**: Rotation around x-axis (-180 to 180 degrees)
- **Roll**: Rotation around y-axis (-90 to 90 degrees)

The `getRotationMatrix()` method combines accelerometer and magnetometer data to create a rotation matrix, which is then used by `getOrientation()` to calculate these angles.

## Usage

1. Clone the repository
2. Open the project in Android Studio
3. Run the app on a device or emulator with the necessary sensors

The app will display real-time data from the accelerometer and magnetometer, as well as the calculated orientation angles.

## Limitations

- The accuracy of the orientation calculation depends on the quality of the device's sensors.
- Magnetometer readings can be affected by nearby magnetic fields or large metal objects.
- The app doesn't implement any smoothing or filtering of sensor data, which might be necessary for some applications.

## Further Improvements

1. Implement low-pass filtering to smooth sensor data
2. Add calibration for the magnetometer
3. Visualize the orientation data using 3D graphics
4. Implement sensor fusion algorithms for more accurate orientation estimation
