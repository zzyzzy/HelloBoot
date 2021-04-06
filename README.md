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
+ add Tiles3 dependency (pom.xml)
+ add TilesConfig.java
+ add WEB-INF/tiles.xml
+ add header, footer, template in WEB-INF/tiles
+ add TilesController.java (/index3)
 
### 4. initialize static content
+ add static content path (application.properties)
+ Build - Rebuild project

### 5. initialize mybatis + H2
+ add mybatis, h2 dependency (pom.xml)
+ add h2 datasource strings (application.properties)
+ connect local h2 console and create member table
+ add MyBatisConfig.java
+ add /src/main/resources/mybatis3/MemberMapper.xml

### 6. initialize dynamic content
+ add dynamic content (join, login, board)
+ modify TilesController
+ add MemberVO, MemberService, MemberDAO (include interface)
+ add joinMember, loginMember in interface
+ modify WEB-INF/views/tiles/header.jsp  
+ modify WEB-INF/views/myinfo.jsp  
+ Build - Rebuild project


