/*package com.inti.restConroller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Ref;
import com.inti.entities.Utilisateur;
<<<<<<< HEAD
//import com.inti.service.interfaces.IRefService;
//import com.inti.service.interfaces.IUtilisateurService;
//
//
//@RestController
//public class RefController {
//	@Autowired				// on fais appelle au bon service . NB : Ref c'était Utilisateur
//	IRefService userService;
//
//	@RequestMapping(value = "users", method = RequestMethod.GET)
//	public List<Ref> findAll() {
//		return userService.findAll();
//	}
//
//	@RequestMapping(value = "users/{idRef}", method = RequestMethod.GET)
//	public Ref findOne(@PathVariable("idRef") Long id) {
//		return userService.findOne(id);
//	}
//
//	@RequestMapping(value = "users", method = RequestMethod.POST)
//	public Ref saveRef(@RequestBody Ref user) {
//		return userService.save(user);
//	}
//
//	@RequestMapping(value = "users/{idRef}", method = RequestMethod.DELETE)
//	public void deleteRef(@PathVariable("idRef") Long id) {
//		userService.delete(id);
//	}
//	@RequestMapping(value = "users/{idRef}", method = RequestMethod.PUT)
//	public Ref updateRef(@PathVariable("idRef") Long id, @RequestBody Ref user) {
//		Ref currentRef= userService.findOne(id);
//		currentRef.setNomRef(user.getNomRef());
//		currentRef.setPrenomRef(user.getPrenomRef());
//		currentRef.setUsername(user.getUsername());
//		currentRef.setPassword(user.getPassword());
//		currentRef.setDateNaissance(user.getDateNaissance());
//		currentRef.setEmail(user.getEmail());
//		currentRef.setImage(user.getImage());
//		currentRef.setRoles(user.getRoles());
//		return userService.save(currentRef);
//	}
//	
//	// partie pour le login
//	@RestController
//	@RequestMapping(value = "/login")
//	public class LoginConroller {
//		@Autowired
//		IUtilisateurService utilisateurService;
//		
//		public Utilisateur login(Principal principal) {
//			return utilisateurService.findOneByUsername(principal.getName());
//		}
//	}
//}
=======
import com.inti.service.interfaces.IRefService;
import com.inti.service.interfaces.IUtilisateurService;


@RestController
public class RefController {
	@Autowired				// on fais appelle au bon service . NB : Ref c'était Utilisateur
	IRefService userService;

	@RequestMapping(value = "users", method = RequestMethod.GET)
	public List<Ref> findAll() {
		return userService.findAll();
	}

	@RequestMapping(value = "users/{idRef}", method = RequestMethod.GET)
	public Ref findOne(@PathVariable("idRef") Long id) {
		return userService.findOne(id);
	}

	@RequestMapping(value = "users", method = RequestMethod.POST)
	public Ref saveRef(@RequestBody Ref user) {
		return userService.save(user);
	}

	@RequestMapping(value = "users/{idRef}", method = RequestMethod.DELETE)
	public void deleteRef(@PathVariable("idRef") Long id) {
		userService.delete(id);
	}
	@RequestMapping(value = "users/{idRef}", method = RequestMethod.PUT)
	public Ref updateRef(@PathVariable("idRef") Long id, @RequestBody Ref user) {
		Ref currentRef= userService.findOne(id);
		currentRef.setNomRef(user.getNomRef());
		currentRef.setPrenomRef(user.getPrenomRef());
		currentRef.setUsername(user.getUsername());
		currentRef.setPassword(user.getPassword());
		currentRef.setDateNaissance(user.getDateNaissance());
		currentRef.setEmail(user.getEmail());
		currentRef.setImage(user.getImage());
		currentRef.setRoles(user.getRoles());
		return userService.save(currentRef);
	}
	
	// partie pour le login
	@RestController
	@RequestMapping(value = "/login")
	public class LoginConroller {
		@Autowired
		IUtilisateurService utilisateurService;
		
		public Utilisateur login(Principal principal) {
			return utilisateurService.findOneByUsername(principal.getName());
		}
	}
}*/

