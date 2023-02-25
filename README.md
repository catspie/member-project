# member-project

Spring Boot, Gradle, h2를 활용한 회원 관리 사이트입니다. <br>

# 🖥️프로젝트 요약 
- 메인
<img src="https://user-images.githubusercontent.com/102503668/221341055-a42a8897-58fc-4b6d-9648-82c5ac573c38.png" width="400" height="400">
- 등록
<img src="https://user-images.githubusercontent.com/102503668/221341066-8e3b40ab-1501-46d5-ad51-ad59da07eec6.png" width="400" height="400">
- 조회
<img src="https://user-images.githubusercontent.com/102503668/221341069-951a3420-f6c0-4f3a-b020-b9e204b3797e.png" width="400" height="400">


# ⏰소요 기간
2022-02-24~25 (이틀)

# 🚀About Project
1. 회원가입 버튼을 누르면 회원가입 페이지로 이동
2. 이름을 입력하면 db에 이름이 저장되고, 메인 페이지로 이동
3. 회원 목록 확인

- controller, service, model 관계에 대한 얕은 이해
- h2 데이터베이스 등록, 저장, 조회
- git ssh key 생성 및 spring boot 연동 
- 일반적인 웹 애플리케이션 계층 구조 이해 
<img src="https://user-images.githubusercontent.com/102503668/221341369-79a68f0d-fea9-4789-97e2-9c385aa72cc0.png" width="500" height="300">

- 테스트 케이스 작성법 학습
  1. AfterEach
  2. BeforeEach
  3. 컴포넌트 스캔 (생성자에 @Autowired가 있으면 스프링이 연관된 객체를 스프링 컨테이너에서 찾아 넣어준다.)
  4. SpringBootTest
  5. Transactional 
  (테스트 시작 전에 트랜잭션 시작, 테스트 완료 후에 항상 롤백: 다음 테스트에 영향을 주지 않음)
