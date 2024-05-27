package IDaeDengGim.indiepicks_demo.movie_tag;

import IDaeDengGim.indiepicks_demo.tag.Tag;
import IDaeDengGim.indiepicks_demo.tag.TagRepository;
import IDaeDengGim.indiepicks_demo.movie.Movie;
import IDaeDengGim.indiepicks_demo.movie.MovieRepository;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Service
public class MovieTagService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private TagRepository tagRepository;

    @Transactional
    public void loadDataFromXLSX(String filePath) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0); // 첫 번째 시트 가져오기

        Iterator<Row> rowIterator = sheet.iterator();
        // 첫 번째 행은 헤더로 처리하고 건너뜁니다.
        rowIterator.next();

        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();

            Movie movie = new Movie();

            movie.setTitle(cellIterator.next().getStringCellValue());
            movie.setUrl(cellIterator.next().getStringCellValue());
            movie.setYear(String.valueOf(cellIterator.next().getNumericCellValue()));
            movie.setGenre(cellIterator.next().getStringCellValue());
            movie.setDirector(cellIterator.next().getStringCellValue());
            movie.setActor(cellIterator.next().getStringCellValue());
            movie.setCompany(cellIterator.next().getStringCellValue());
            movie.setTime(cellIterator.next().getStringCellValue());
            movie.setGrade(cellIterator.next().getStringCellValue());
            movie.setColor(cellIterator.next().getStringCellValue());

            String[] tags = cellIterator.next().getStringCellValue().split("#");
            Set<Tag> tagSet = new HashSet<>();
            for (String tagName : tags) {
                if (!StringUtils.isEmpty(tagName.trim())) {
                    Tag tag = tagRepository.findByName(tagName.trim());
                    if (tag == null) {
                        tag = new Tag();
                        tag.setName(tagName.trim());
                        tagRepository.save(tag);
                    }
                    tagSet.add(tag);
                }
            }
            movie.setTags(tagSet);

            movie.setSynopsys(cellIterator.next().getStringCellValue());
            movie.setIntent(cellIterator.next().getStringCellValue());
            movie.setImg(cellIterator.next().getStringCellValue());

            movieRepository.save(movie);
        }

        workbook.close();
        fileInputStream.close();
    }
}