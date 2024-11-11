 package br.com.thidi.middleware.controllers;
 
 import io.swagger.v3.oas.annotations.Hidden;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.RestController;
 import org.springframework.web.servlet.mvc.support.RedirectAttributes;
 import org.springframework.web.servlet.view.RedirectView;
 
 @RestController
 @Hidden
 public class DefaultController
 {
   @GetMapping({"/"})
   public RedirectView redirectWithUsingRedirectView(RedirectAttributes attributes) {
     return new RedirectView("/swagger-ui/index.html");
   }
 }

<<<<<<< HEAD

/* Location:              C:\DevWorkspace\Thidi\conex-hikvision\hikvision_1.1.2.jar!\br\com\thidi\middleware\controllers\DefaultController.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */
=======
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import io.swagger.v3.oas.annotations.Hidden;

@RestController
@Hidden
public class DefaultController {
	@GetMapping("/")
	public RedirectView redirectWithUsingRedirectView(RedirectAttributes attributes) {
		return new RedirectView("/swagger-ui/index.html");
	}
}
>>>>>>> ccbe5f431a38f01813c625c116d14dff72c2494c
