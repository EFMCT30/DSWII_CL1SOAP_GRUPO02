package pe.edu.cibertec.DSWII_CL1SOAP_GRUPO02.converter;


import org.springframework.stereotype.Component;
import pe.edu.cibertec.DSWII_CL1SOAP_GRUPO02.model.Paciente;
import pe.edu.cibertec.ws.objects.Pacientews;

import java.util.ArrayList;
import java.util.List;



@Component
public class PacienteConvert {

    public Paciente convertPacientewsToPaciente(Pacientews pacientews){
        Paciente paciente = new Paciente();
        paciente.setIdpaciente(pacientews.getIdpaciente());
        paciente.setNompaciente(pacientews.getNompaciente());
        paciente.setApepaciente(pacientews.getApepaciente());
        paciente.setDocpaciente(pacientews.getDocpaciente());
        paciente.setFechanacpaciente(pacientews.getFechanacpaciente());
        paciente.setEmailpaciente(pacientews.getEmailpaciente());
        return paciente;
    }

    public Pacientews convertPacienteToPacientews(Paciente paciente){
        Pacientews pacientews = new Pacientews();
        pacientews.setIdpaciente(paciente.getIdpaciente());
        pacientews.setNompaciente(paciente.getNompaciente());
        pacientews.setApepaciente(paciente.getApepaciente());
        pacientews.setDocpaciente(paciente.getDocpaciente());
        pacientews.setFechanacpaciente(paciente.getFechanacpaciente());
        pacientews.setEmailpaciente(paciente.getEmailpaciente());
        return pacientews;
    }

    public List<Paciente> convertPacientewsToPaciente(List<Pacientews> pacientewsList){
        List<Paciente> pacienteList = new ArrayList<>();
        for (Pacientews pacientews : pacientewsList) {
            pacienteList.add(convertPacientewsToPaciente(pacientews));
        }
        return pacienteList;
    }

    public List<Pacientews> convertPacienteToPacientews(List<Paciente> pacienteList){
        List<Pacientews> pacientewsList = new ArrayList<>();
        for (Paciente paciente : pacienteList) {
            pacientewsList.add(convertPacienteToPacientews(paciente));
        }
        return pacientewsList;
    }
}

