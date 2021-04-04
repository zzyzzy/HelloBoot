# HelloBoot Project

### 0. git initialize
+ git config --global user.email "you@example.com"
+ git config --global user.name "Your Name"

### 1. initialize Project
+ select Spring DevTools
+ select SpringWeb
+ /src/main/resources/static/index.html 
+ /src/main/java -> IndexController (/index1)

### 2. initialize JSP
+ add tomcat-embed-jasper, jstl dependency (pom.xml)
+ add mvc view prefix, suffix (application.properties)
+ add webapp/WEB-INF/views folder
+ add index.jsp
+ /src/main/java -> JstlController (/index2)

### 3. initialize Tiles
+ add Tiles3 (pom.xml)
+ add TilesConfig.java
+ add WEB-INF/tiles.xml
+ add header, footer, template in WEB-INF/tiles
+ add TilesController.java


