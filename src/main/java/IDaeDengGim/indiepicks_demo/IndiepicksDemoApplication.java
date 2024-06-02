package IDaeDengGim.indiepicks_demo;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URL;

@SpringBootApplication
@RequiredArgsConstructor
public class IndiepicksDemoApplication {

	@Autowired
	private DatabaseInitializer databaseInitializer;

	public static void main(String[] args) {
		SpringApplication.run(IndiepicksDemoApplication.class, args);
	}

	@PostConstruct
	public void init() {
		// 상대 경로를 사용하여 파일 경로를 설정
		// resources 디렉토리에 있는 파일 읽어오기
		URL resource = getClass().getClassLoader().getResource("temp.xlsx");
		if (resource == null) {
			System.err.println("파일을 찾을 수 없습니다.");
			return;
		}
		String filePath = resource.getPath();
		System.out.println("파일 경로: " + filePath);

		try {
			databaseInitializer.loadDataFromXLSX(filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
