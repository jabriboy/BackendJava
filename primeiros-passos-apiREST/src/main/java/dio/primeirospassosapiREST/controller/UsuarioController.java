package dio.primeirospassosapiREST.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.primeirospassosapiREST.Model.Usuario;
import dio.primeirospassosapiREST.Repository.UsuarioRepository;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    @GetMapping
    public List<Usuario> getUsuarios(){
        return repository.listAll();
    }
    @GetMapping("/{id}")
    public Usuario getOne(@PathParam("id") Integer id){
        return repository.finById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteOne(@PathParam("id") Integer id){
        repository.remove(id);
    }
    @PostMapping
    public void saveUser(@RequestBody Usuario user){
        repository.save(user);
    }
}
