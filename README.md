# board-web-project
## <프로젝트 개요>
- vuejs와 spring을 중심으로 게시판 사이트 기능 구현
- 온라인 게시판 웹 사이트 개발. (생성/읽기/수정/삭제)
- 프로젝트 개발은 Vue, Spring 기술을 사용할 수 있도록 한다.
- Model 2 MVC 아키텍처를 사용
- 데이터베이스로 Oracle 11g을 이용
- 만들어진 웹 사이트는 반드시 사용자 친화적이며 웹 표준을 준수한다.

## <요구사항 정의>
시스템명 : 게시판<br>
- 기능 1 : 회원가입 시 아이디와 비밀번호 유효성 검사를 진행하고, 중복이 아닌 계정만 데이터베이스에 저장해야 함

- 기능 2 : 로그인 시 클라이언트가 던지는 아이디와 비밀번호를 통해 로그인 체크를 할 수 있어야 함

- 기능 3 : 글은 생성, 읽기, 수정, 삭제 기능이 있어야 하며, 수정 및 삭제는 글을 작성한 사용자만 가능해야 함

- 기능 4 : 게시판의 페이지는 10개 단위로 쪼개어 최신 작성 글부터 정렬되어야 함

## <개발 환경>

## <프로그래밍 형식>
- 블록 형식의 머리 주석을 다세요.

- 각각의 코드에 대한

- 적절한 변수와 함수 이름을 다세요.

- 적절한 들여 쓰기를 하세요.

- 세부사항은 각 언어별 코딩 컨벤션을 따라주세요.

## <계획서>

## <UML>
![화면 캡처 2022-01-05 103016](https://user-images.githubusercontent.com/45321171/148146415-816d72a9-ee5a-40b4-b7dc-ef1d6c38a601.png)

![화면 캡처 2022-01-05 103029](https://user-images.githubusercontent.com/45321171/148146419-92ac93c7-f507-4789-b12e-b7c248b67ada.png)

## <테스트 케이스>
|번호|시나리오|내용|입력|예상 결과|
|:---:|:---:|---|:---:|---|
|1|회원가입|정확한 정보를 입력하고<br> 회원가입을 합니다.|올바른 회원가입|고객이 회원가입 성공 페이지로 이동합니다.|
|2|회원가입|중복된 정보를 입력하고<br> 회원가입을 합니다.|중복된 회원가입|고객에게 오류 메시지를 보여줍니다.|
|3|로그인|올바른 로그인 정보로<br> 로그인을 합니다.|올바른 로그인|로그인 성공 페이지로 이동합니다.|
|4|로그인|잘못된 로그인 정보로<br> 로인을 합니다.|잘못된 로그인|로그인 실패 페이지로 이동합니다.|
|5|게시물등록|양식에 맞게 게시물을<br> 등록합니다.|올바른 게시물등록|등록 성공 페이지로 이동합니다.|
|6|게시물등록|양식에 맞지않게 게시물을<br> 등록합니다.|잘못된 게시물등록|고객에게 오류 메시지를 보여줍니다.|
|7|게시물수정|양식에 맞게 게시물을<br> 수정합니다.|올바른 게시물수정|수정 성공 페이지로 이동합니다.|
|8|게시물수정|양식에 맞게않게 게시물을<br> 수정합니다.|잘못된 게시물수정|고객에게 오류 메시지를 보여줍니다.|
|9|게시물삭제|게시물을 등록한 사용자만가<br> 게시물을 삭제합니다.|올바른 게시물삭제|삭제 성공 페이지로 이동합니다.|
