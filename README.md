Nora Java Library at managing Marven repogitory for Gradle Project



## Create marven repo for gradle project

1. create repogitories 

  gradle assemble uploadArchives


2. cd repogitories 


3. git init


4. git remote add origin {this github repo}


5. git add -A


6. git commit -m ".."


7. git checkout -b gh-pages


8. git push origin gh-pages


## Example

https://github.com/kyorohiro/java.lib_hello/tree/example


```
dependencies {

	..
	..

    compile 'com.example.kyorohiro:java.lib_hello:0.0.1'
}

// In this section you declare where to find the dependencies of your project
repositories {
	..
	..
    maven { url 'https://kyorohiro.github.io/java.lib_hello'}
}
```