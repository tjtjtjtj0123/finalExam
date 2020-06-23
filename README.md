# Final Exam
Sample project for the final exam

### STS 또는 Eclipse에 import하는 방법 

1. File >> Import... >> Git - Projects from Git >> Clone URI 선택
2. URI 입력(예: https://github.com/cspark0/finalExam.git)  
3. master branch 선택  
4. Browse 버튼을 클릭하여 local repository를 저장할 폴더 선택(예: C:\Users\사용자\git)  
5. Project import를 위한 wizard를 선택하는 창에서 "Cancel"을 선택하여 중단   
6. Window >> Perspective >> Open Perspective >> Other... >> Git 선택  
7. 왼쪽 repository 목록에서 finalExam이 생성되었는지 확인하고, 이름을 마우스 우클릭하고 메뉴에서 Imports Project... 선택
8. open된 Imports Project 창에서 Finish 선택  
9. Eclipse 우측 상단의 "Java EE" perspective 아이콘을 클릭하여 프로젝트가 import되었는지 확인
10. pom.xml에 등록된 library들이 모두 다운로드되고 프로젝트가 빌드 완료될 때까지 기다림   

### 프로젝트 실행 방법
1. Apache Tomcat v9.0을 다운로드 및 설치하고, Eclipse의 Servers 창에 등록함   
2. 프로젝트를 Tomcat server에 deploy(drag&drop)하고 Synchronized 상태인지 확인한 후 server를 start함
3. 프로젝트 이름을 right-click 후 Run As > Run On Server를 실행하여  웹 브라우저를 띄우고 접속함     
(URL을 외부의 Chrome brower 등에서 직접 입력해도 됨)

