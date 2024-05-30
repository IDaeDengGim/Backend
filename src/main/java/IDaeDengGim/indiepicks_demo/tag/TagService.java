package IDaeDengGim.indiepicks_demo.tag;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TagService {

    private final TagRepository tagRepository;

    public List<TagDTO> getRandomTags(int limit) {
        List<Tag> randomTags = tagRepository.findRandomTags(limit);
        return randomTags.stream()
                .map(tag -> new TagDTO(tag.getId(), tag.getName()))
                .collect(Collectors.toList());
    }
    public void saveUserKeywords(List<Long> keywordIds) {
        // Implementation for saving user keywords
    }
}
