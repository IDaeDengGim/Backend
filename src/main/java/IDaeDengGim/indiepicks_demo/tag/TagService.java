package IDaeDengGim.indiepicks_demo.tag;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TagService {

    private final TagRepository tagRepository;

    public List<Tag> getRandomTags() {
        return tagRepository.findRandomTags();
    }

    public void saveUserKeywords(List<Long> keywordIds) {

    }
}
