package IDaeDengGim.indiepicks_demo.tag;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TagController {

    private final TagService tagService;

}
