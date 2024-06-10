# IndiePicks
## 🌱Backend
|🍀|🍀|
|:---:|:---:|
|[김근주](https://github.com/tdddt)| [원재영](https://github.com/jaeyeong13)|
| CSV to JPA<br> REST API 설게 | REST API 설게 |
<br>

## ✏️프로젝트 개요
SpringBoot를 이용하여 IndiePicks 홈페이지의 백엔드 부분을 설계한다.

<br>

## 🚀진행 상황
- `Get Random Keyword` 부분 API 설계 완료
- `Get Random Movies` 부분 API 설계 완료
<br>

## 🗂️ 백 프로젝트 폴더 구조
```
📂 src/main/java/IDaeDengGim/indiepicks_demo
├─ 📂 genre  ▶️ genre 관련 파일 모음(entity, repository)
├─ 📂 movie  ▶️ movie 관련 파일 모음(entity, controller, DTO, repository, service)
├─ 📂 tag  ▶️ tag 관련 파일 모음(entity, controller, DTO, repository, service)
├─ BasicController 
├─ CorsConfig ▶️ react 연동을 위한 cors 설정
├─ DatabaseInitializer ▶️ 크롤링한 파일 DB에 저장
└─ IndiepicksDemoApplication
```
<br>

## 🛠️사용된 기술 스택
- <img src="https://img.shields.io/badge/Spring%20Boot-6DB33F?style=flat-square&logo=springboot&logoColor=white">
- <img src="https://img.shields.io/badge/Postman-FF6C37?style=flat-square&logo=postman&logoColor=white">
