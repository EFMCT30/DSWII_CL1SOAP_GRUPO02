package pe.edu.cibertec.DSWII_CL1SOAP_GRUPO02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_CL1SOAP_GRUPO02.model.Paciente;
import pe.edu.cibertec.DSWII_CL1SOAP_GRUPO02.repository.PacienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    //listar
    public List<Paciente> obtenerPacientes(){
        return pacienteRepository.findAll();
    }

    //buscarxid
    public Paciente obtenerPacienteXId(Integer id){
        Optional<Paciente> paciente = pacienteRepository.findById(id);
        if(paciente.isEmpty()){
            return null;
        }
        return paciente.get();
    }

    //crear
    public Paciente guardarPaciente(Paciente paciente){
        return pacienteRepository.save(paciente);
    }

}
