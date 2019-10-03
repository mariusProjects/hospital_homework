import com.sda.entities.*;
import com.sda.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    private static SessionFactory sessionFactory;
    public static void main(String[] args) {

        sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Physician physician1= new Physician();
        Physician physician2= new Physician();

        physician1.setName("David");
        physician1.setPosition("Surgeon");
        physician1.setSsn(2233);
        physician2.setName("John");
        physician2.setPosition("Dentist");
        physician2.setSsn(4455);



        Nurse nurse1 = new Nurse();
        Nurse nurse2 = new Nurse();

        nurse1.setName("Ella");
        nurse1.setPosition("Surgeon");
        nurse1.setRegistred(true);
        nurse1.setSsn(123);
        nurse2.setName("Alma");
        nurse2.setPosition("Dentist");
        nurse2.setRegistred(false);
        nurse2.setSsn(321);


        Patient patient1 = new Patient();
        Patient patient2 = new Patient();

        patient1.setName("Michelle");
        patient1.setAdress("Ontario");
        patient1.setPhone("0442257");
        patient1.setInsuranceId(1810211);
        patient1.setPhysician(physician2);
        patient2.setName("John Doe");
        patient2.setAdress("Texas");
        patient2.setPhone("0314587");
        patient2.setInsuranceId(1820214);
        patient2.setPhysician(physician1);



        Department department1 = new Department();
        Department department2 = new Department();

        department1.setName("Cardiology");
        department1.setHead(physician1);
        department2.setName("Critical Care");
        department2.setHead(physician2);

        AffiliatedWith affiliatedWith1 = new AffiliatedWith();
        AffiliatedWith affiliatedWith2 = new AffiliatedWith();

        affiliatedWith1.setPhysician(physician2);
        affiliatedWith1.setDepartment(department1);
        affiliatedWith1.setPrimaryAffiliation(true);
        affiliatedWith1.setPhysician(physician1);
        affiliatedWith1.setDepartment(department2);
        affiliatedWith1.setPrimaryAffiliation(false);

        Block block1 = new Block();
        Block block2 = new Block();

        block1.setBlockfloor(2);
        block1.setBlockcode(211);
        block2.setBlockfloor(2);
        block2.setBlockcode(112);

        session.save(physician1);
        session.save(physician2);
        session.save(nurse1);
        session.save(nurse2);
        session.save(patient1);
        session.save(patient2);
        session.save(department1);
        session.save(department2);
        session.save(affiliatedWith1);
        session.save(affiliatedWith2);
        session.save(block1);
        session.save(block2);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
