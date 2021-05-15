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
	        implementation 'com.github.KingSujeet:ToasterLibrary:Tag'
	}

<h5> All done here </h5>

<h4> Examples: </h4>

ToasterMessage.s(getApplicationContext(), "This is Short Toast");  -> This shows short time Toast meassage.

ToasterMessage.l(getApplication(),"This is Long Toast");  -> This shows Long time Toast message.

