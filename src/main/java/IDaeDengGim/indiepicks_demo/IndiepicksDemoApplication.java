package IDaeDengGim.indiepicks_demo;

import IDaeDengGim.indiepicks_demo.movie_tag.MovieTagService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootApplication
public class IndiepicksDemoApplication {

	@Autowired
	private MovieTagService movieTagService;

	public static void main(String[] args) {
		SpringApplication.run(IndiepicksDemoApplication.class, args);
	}

	@PostConstruct
	public void init() {
		// 상대 경로를 사용하여 파일 경로를 설정합니다.
		Path relativePath = Paths.get("temp.xlsx");
		String absolutePath = relativePath.toAbsolutePath().toString();
		System.out.println("절대 경로: " + absolutePath);

		try {
			movieTagService.loadDataFromXLSX(absolutePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
