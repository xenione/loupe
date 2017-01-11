#Loupe effect (Magnifying glass) 
 Nice zoom for your images.

 [![Download](https://api.bintray.com/packages/xenione/maven/loupe/images/download.svg) ](https://bintray.com/xenione/maven/loupe/_latestVersion)


![loupe](https://cloud.githubusercontent.com/assets/4138527/21819975/2f9a57ba-d76e-11e6-8afc-fc21a118088c.gif)

Add it on your project:
Gradle:
```java 
compile 'com.xenione.widgets:loupe:1.0.0'
```

Add LoupView into layout:

```java 
    <com.xenione.widget.loupe.LoupeView
        android:id="@+id/image_view"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@drawable/bg_image" />
```
LoupeView extends ImageView .

Public methods:

    public void setMFactor(int factor): Set the magnificent factor, 2 for amplify x2 and so on.

    public void setRadius(int radius): Set the radius of the magnificent glass.


# License
-------
    Copyright 2016 Eugeni Josep Senent i Gabriel

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


