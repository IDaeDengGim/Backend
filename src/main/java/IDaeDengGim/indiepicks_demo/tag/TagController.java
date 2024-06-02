package IDaeDengGim.indiepicks_demo.tag;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.valves.rewrite.RewriteCond;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TagController {

    private final TagService tagService;

    @GetMapping("/keyword")
    public ResponseEntity<List<TagDTO>> randomKeyword(){
        try{
            List<TagDTO> tags = tagService.getRandomTags(20);
            return new ResponseEntity<>(tags, HttpStatus.OK);
        } catch(Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
