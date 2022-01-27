package pl.flaaaxxx;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class Controller {

    @GetMapping("/")
    @PreAuthorize("hasAuthority('APPROLE_ADMIN')")
    public String home(Principal principal) {
        return principal.getName();
    }
}
