import java.util.*;
public class Maptest4 {
    public static void main(String[] args) {
        HashMap<String,doctor> doct=new HashMap<>();
        doctor doc;

        try{
            ReadEmp r =new ReadEmp();
            String x=r.getdr();
            while (x!=null) {
                System.out.println(x);
                String[]y=x.split("-");
                doc=new doctor(Integer.parseInt(y[0]), y[1], y[2],y[3] ,Integer.parseInt(y[4]));
                doct.put(y[0],doc);
                  x=r.getdr();
                   
                }
            }

        catch (Exception e) {
            e.printStackTrace();
          }
        ArrayList<doctor> doctorList = new ArrayList<>(doct.values());
        ArrayList<doctor> specializedDoctors = doctor.getDoctorsBySpecialization(doctorList, "cardiologist");
        for (doctor d : specializedDoctors) {
            System.out.println(d);
       }
   
          
          
          if( doct.containsKey("101"))
          {

        System.out.println("found");
          }
          else
          
            System.out.println("not found");
      
            doc = doct.compute("101", (k,v) -> new doctor(v.doctorid, v.name, v.specialization, v.email,  v.fees+2000));
            System.out.println(doc); 
           
        }
    }

