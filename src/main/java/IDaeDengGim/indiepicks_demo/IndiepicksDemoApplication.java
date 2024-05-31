package IDaeDengGim.indiepicks_demo;

import IDaeDengGim.indiepicks_demo.movie_tag.MovieTagService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootApplication
@RequiredArgsConstructor
public class IndiepicksDemoApplication {

	@Autowired
	private MovieTagService movieTagService;

	public static void main(String[] args) {
		SpringApplication.run(IndiepicksDemoApplication.class, args);
	}

	@PostConstruct
	public void init() {
		if (!movieTagService.isDataLoaded()) { // 데이터가 이미 로드되지 않은 경우에만 로드
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
				movieTagService.loadDataFromXLSX(filePath);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("데이터가 이미 로드되어 있습니다.");
		}
	}
}
