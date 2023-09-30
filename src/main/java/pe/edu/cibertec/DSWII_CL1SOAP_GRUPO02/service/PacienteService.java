package pe.edu.cibertec.DSWII_CL1SOAP_GRUPO02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_CL1SOAP_GRUPO02.model.Paciente;
import pe.edu.cibertec.DSWII_CL1SOAP_GRUPO02.repository.PacienteRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

   // public Paciente buscarPaciente(String nombre, String apellido) {
  //      return pacienteRepository.findByNomPacienteAndApePaciente(nombre, apellido);
  //  }

    public Paciente actualizarPaciente(Integer id, Paciente pacienteActualizado) {
        Optional<Paciente> paciente = pacienteRepository.findById(id);
        if (paciente.isEmpty()) {
            return null;
        }
        Paciente pacienteExistente = paciente.get();
        pacienteExistente.setNompaciente(pacienteActualizado.getNompaciente());
        pacienteExistente.setApepaciente(pacienteActualizado.getApepaciente());
        pacienteExistente.setDocpaciente(pacienteActualizado.getDocpaciente());
        pacienteExistente.setFechanacpaciente(pacienteActualizado.getFechanacpaciente());
        pacienteExistente.setEmailpaciente(pacienteActualizado.getEmailpaciente());

        return pacienteRepository.save(pacienteExistente);
   }

    public List<Paciente> findByNomPaciente(String nombre) {
        // Utiliza el método findAll del repositorio y luego filtra los resultados por nombre.
        return pacienteRepository.findAll()
                .stream()
                .filter(paciente -> paciente.getNompaciente().equalsIgnoreCase(nombre))
                .collect(Collectors.toList());
    }


    }
