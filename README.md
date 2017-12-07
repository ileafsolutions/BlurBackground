# BlurBackground
This library can be used to make blur background image. User can change the blur intensity according to the requirement.

### Setup

##### Dependencies
```groovy
dependencies {
    compile 'com.github.ileafsolutions:BlurBackground:1.0.1'
}
```
### Functions

This will return a blurred bitmap

```java
BlurUtil.with(getApplicationContext()).load(R.drawable.bg).intensity(10).getImageBlur();
```

**Blur Options**

- Intensity - Ranging from 8 to 25

Requirements
--------------
Android 4.4+

## Author

iLeaf Solutions
[http://www.ileafsolutions.com](http://www.ileafsolutions.com)

