package IDaeDengGim.indiepicks_demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 모든 경로에 대해 접근 허용
                .allowedOrigins("http://localhost:3000") // 도메인 설정
                .allowedMethods("*") // 모든 메소드 허용
                .allowCredentials(true) // 자격 증명 요청 허용
                .maxAge(3600); // 요청 캐시 시간 1시간으로  설정
    }
    /*
    jwt 인증토큰 사용 시 아래 코드 추가 필요
    .allowedHeaders("Authorization", "Content-Type") // 헤더를 통한 프->백 토큰 전송 허용
    .exposedHeaders("Authorization") // 백->프 토큰 읽을 수 있도록 허용
    */

}
