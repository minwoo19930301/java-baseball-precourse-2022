# 숫자야구 게임 구현해야할 것들

- [x]  Launcher로 구분하고 BaseBallGuessingGame, Computer, Player, Balls 기본 클래스 구조 생성, 표준으로 써야할 값들은 상수로 두기 ex) 스트라이크, 낫싱, 맞추는 횟수 등
- [x]  BaseBallGuessingGame 클래스 : Computer, Player 세팅 후 Player는 맞출 때 까지 Ball 생성하고 맞추기
- [x]  Balls 클래스 : int[]를 가지며 1~9, length는 3개, 자체적으로 validation 후 IllegalArguement
- [x]  User 클래스 : 입력을 받아 balls 생성, 입력 메소드  - 입력 오류 시 IllegalArguementException 던지기
- [x]  Computer 클래스 : balls 생성, 자동으로 숫자 생성하여 넣기
- [x]  BallsMatch 클래스(신규 추가) : 일종의 심판 기능을 수행하는 클래스    
- [ ]  BaseBallGuessingGame 클래스 : 게임이 종료되면 사용자의 입력을 받아 다시 시작 혹은 완전히 종료시킬 수 있게. - 입력 오류 시 IllegalArguementException 던지기

# 신경써야할 점들

- Java8 로 실행 가능토록 신경 쓸 것. - ex)모르고 11에서 돌릴 때 while 문 시 Console.readLine() 함수가 오류를 냄
- 들여쓰기 2 넘지 않도록 구현 (google style - 파일 받아서 아예 intelliJ preferences 에 수정해서 넣었음)
- Stream 사용하지 않기
- else나 switch 사용하지 않고 if return  식으로 구현
- function은 10 줄 이상 지양 + 1 가지 일만 하도록 지향 - 커밋 단위로도 활용
- 단위테스트 시 assert 활용
- 이미 있는 Test Case는 모두 성공해야 함.