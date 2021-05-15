# ToasterLibrary

<h3>Step 1. Add the Toatster Library to your build file </h3>

Add it in your root build.gradle at the end of repositories:

	allprojects {
			repositories {
				...
				maven { url 'https://jitpack.io' }
			}
		}
	
<br>
<h3>Step 2. Add the dependency</h3>

	dependencies {
	        implementation 'com.github.KingSujeet:ToasterLibrary:1.0'
	}

<h5> All done here </h5>

<h4> Examples: </h4>

<h2>ToasterMessage.s(getApplicationContext(), "This is Short Toast"); </h2> -> This shows short time Toast meassage.

<br>

<h2>ToasterMessage.l(getApplication(),"This is Long Toast"); </h2> -> This shows Long time Toast message.

