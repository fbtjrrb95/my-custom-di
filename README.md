version: 21.46.3.0 


build.gradle  
- sourceCompatibility = JavaVersion.VERSION_11  
- targetCompatibility = JavaVersion.VERSION_11  

명시하지 않을 경우 maven repository 에 publish 할 때 default 로 java lts 로 컴파일한다.  
빌드한 jar 파일을 사용하는 환경이 컴파일 환경과 다르면 안 되기 때문에 버전 명시를 해주는 것이 좋다.  
나는 자바 11 버전에서 개발해서 jar 로 빌드해서 maven repository 에 떨어뜨리면 java 11 버전으로 컴파일 된 jar 가 있을 줄 알았는 데, 그렇지 않고
```
error: class file version has wrong version
```
에러가 발생해서 꽤 고생했다.   
이렇게 컴파일 버전을 명시하지 않으면 컴파일 환경과 자꾸 이 jar 파일을 가져다 쓰는 실행환경이 달라지는 경우가 생길 가능성이 있기 때문에 명시해주는 것이 좋아보인다.   