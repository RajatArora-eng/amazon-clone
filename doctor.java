import java.util.ArrayList;

public class doctor implements Comparable<doctor> {


    public int doctorid;
    public String name;
    public String specialization;
    public String email;
    public int fees;


    public doctor(int doctorid,String name,String specialization,String email,int fees ) {

        this.doctorid=doctorid;
        this.name=name;
        this.specialization=specialization;
        this.email=email;
        this.fees=fees;
    }
    @Override
    public String toString() {
        return "doctor [doctorid=" + doctorid + ", name=" + name + ", specialization=" + specialization + ", email="
                + email + ", fees=" + fees + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + doctorid;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((specialization == null) ? 0 : specialization.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + fees;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        doctor other = (doctor) obj;
        if (doctorid != other.doctorid)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (specialization == null) {
            if (other.specialization != null)
                return false;
        } else if (!specialization.equals(other.specialization))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (fees != other.fees)
            return false;
        return true;
    }
    @Override
    public int compareTo( doctor o) {
        return (int) (this.fees- o.fees);
    }
    public static ArrayList<doctor> getDoctorsBySpecialization(ArrayList<doctor> doctors, String specialization) {
        ArrayList<doctor> result = new ArrayList<>();
        for (doctor doc : doctors) {
            if (doc.specialization.equalsIgnoreCase(specialization)) {
                result.add(doc);
            }
        }
        return result;
    }
   
    }

  
    
    

