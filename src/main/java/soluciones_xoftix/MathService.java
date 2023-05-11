package soluciones_xoftix;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MathService {
    @Autowired
    private VariableRepository variableRepository;
    
    @Autowired
    private FunctionRepository functionRepository;
    
    public Variable createVariable(Variable variable) {
        return variableRepository.save(variable);
    }
    
    public Optional<Variable> getVariable(String name) {
        return variableRepository.findByName(name);
    }
    
    public List<Variable> getAllVariables() {
        return variableRepository.findAll();
    }
    
    public void deleteVariable(String name) {
        variableRepository.deleteByName(name);
    }
    
    public Function createFunction(Function function) {
        return functionRepository.save(function);
    }
    
    public Optional<Function> getFunction(String name) {
        return functionRepository.findByName(name);
    }
    
    public List<Function> getAllFunctions() {
        return functionRepository.findAll();
    }
    
    public void deleteFunction(String name) {
        functionRepository.deleteByName(name);
    }
}
