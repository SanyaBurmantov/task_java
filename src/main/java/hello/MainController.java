package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;


@RestController
public class MainController {

    @Autowired
    private NameWithValueRepository nameWithValueRepository;

    @PostMapping("/add")
    public Response add(@RequestBody Request request) {
        NameWithValueEntity n = new NameWithValueEntity();
        n.setName(request.getName());
        n.setValue(request.getValue());
        nameWithValueRepository.save(n);

        return new Response(0, "OK");
    }

    @PostMapping("/remove")
    public Response remove(@RequestBody Request request) {
        NameWithValueEntity n = new NameWithValueEntity();
        n.setName(request.getName());
        n.setValue(request.getValue());
        nameWithValueRepository.delete(n);

        return new Response(0, "OK");
    }
/*
    @PostMapping("/sum")
    public Response sum(@RequestBody Request request) {
        NameWithValueEntity n = new NameWithValueEntity();
        NameWithValueEntity m = new NameWithValueEntity();
        n.setName(request.getName());
        n.setValue(request.getValue());
        nameWithValueRepository.(n);
        n.setName(request.getName());
        n.setValue(request.getValue());
        nameWithValueRepository.(n);

        return NewResponse(sum, 0, "OK");
    }

*/




}








