
import java.util.ArrayList;

class PatientDirectory {
    private static ArrayList<Patients> patientDirectory = new ArrayList<>();

    public static void addArrayListItem(int id,String patientName,String patientEmail,String patientContact,String patientGender,int patientAgeC,String patientCommunity,String patientPassword){
        patientDirectory.add(new Patients(id,patientName,patientEmail,patientContact,patientGender,patientAgeC,patientCommunity,patientPassword));
        System.out.println(patientDirectory);
    }
    
    public static ArrayList<Patients> arrayReturn(){
        System.out.println("Array list"+patientDirectory);
        return patientDirectory;
    }
    
    public static int arrayListLength(){
        return patientDirectory.size();
    }
    

}
