# ColorStrings

A light weight library which handles multiple colors in a single TextView for Android.

## How to 
To get this project into your build:
### Step 1
Open project level gradle file 
Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```java
allprojects {
    repositories {
    	...
    	maven { url 'https://jitpack.io'}
    }
}
```
### Step 1
Open app module gradle file and add the dependency 
```java
dependencies {
	implementation 'com.github.UmairKhalid786:ColorStrings:1.0.1'
}
```
### How to use it ?
After following above mentioned steps you are ready to code , Sample code is pasted from example given in this repo.
```java
TextView textView = (TextView) findViewById(R.id.attributed_tv);
List<ColoredString> coloredStringsList  = new ArrayList<>();

//Add create your colored String objects
ColoredString coloredString1 = new ColoredString(Color.BLACK , "Hello ");
ColoredString coloredString2 = new ColoredString(Color.RED , "Colored ");
ColoredString coloredString3 = new ColoredString(Color.BLACK , "World");

//add them to array of this objects
coloredStringsList.add(coloredString1);
coloredStringsList.add(coloredString2);
coloredStringsList.add(coloredString3);

//And then call this function to get SpannableStringBuilder
SpannableStringBuilder builder = StringPainter.getColoredText(coloredStringsList);

//Set this builder to textView without converting using toString() method on builder
textView.setText(builder , BufferType.SPANNABLE);
```
### Output
[![smoutput](https://ibb.co/jX2Tzy "smoutput")](https://ibb.co/jX2Tzy "smoutput")
