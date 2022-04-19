package ma.emsi.patientmvc;

import ma.emsi.patientmvc.entities.Patient;
import ma.emsi.patientmvc.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientMvcApplication {


    public static void main(String[] args) {
         SpringApplication.run(PatientMvcApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(
                    new Patient(null,"Hamza",new Date(),false,112));
            patientRepository.save(
                    new Patient(null,"Mourad",new Date(),true,120));
            patientRepository.save(
                    new Patient(null,"Hanane",new Date(),false,140));
            patientRepository.save(
                    new Patient(null,"Abdo",new Date(),true,160));
            
            
            patientRepository.findAll().forEach(p->{
                System.out.println(p.getNom());
            });
        };
    }

}
