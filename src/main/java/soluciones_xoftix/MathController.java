package soluciones_xoftix;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MathController {
    @Autowired
    private MathService mathService;
    
    @PostMapping("/variables")
    public Variable createVariable(@RequestBody Variable variable) {
        return mathService.createVariable(variable);
    }
    
    @GetMapping("/variables/{name}")
    public ResponseEntity<Variable> getVariable(@PathVariable String name) {
        Optional<Variable> variable = mathService.getVariable(name);
        if (variable.isPresent()) {
            return ResponseEntity.ok(variable.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @GetMapping("/variables")
    public List<Variable> getAllVariables() {
        return mathService.getAllVariables();
    }
    
    @DeleteMapping("/variables/{name}")
    public void deleteVariable(@PathVariable String name) {
        mathService.deleteVariable(name);
    }
    
    @PostMapping("/functions")
    public Function createFunction(@RequestBody Function function) {
        return mathService.createFunction(function);
    }
    
    @GetMapping("/functions/{name}")
    public ResponseEntity<Function> getFunction(@PathVariable String name) {
        Optional<Function> function = mathService.getFunction(name);
        if (function.isPresent()) {
            return ResponseEntity.ok(function.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @GetMapping("/functions")
    public List<Function> getAllFunctions() {
        return mathService.getAllFunctions();
    }
    
    @DeleteMapping("/functions/{name}")
    public void deleteFunction(@PathVariable String name) {
        mathService.deleteFunction(name);
    }
}
