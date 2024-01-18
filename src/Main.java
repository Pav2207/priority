import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Patient implements Comparable<Patient> {
    private String name;
    private Severity severity;

    public Patient(String name, Severity severity) {
        this.name = name;
        this.severity = severity;
    }
    public String getName() {
        return name;
    }

    public Severity getSeverity() {
        return severity;
    }

    @Override
    public int compareTo(Patient other) {
        // Patients are compared based on their severity levels
        return this.severity.compareTo(other.severity);
    }
}
enum Severity {
    HIGH,
    MEDIUM,
    LOW
}
public class Main {
    public static void main(String[] args) {
        List<Patient> patientList = new ArrayList<>();

        patientList.add(new Patient("pavi", Severity.HIGH));
        patientList.add(new Patient("pooja", Severity.MEDIUM));
        patientList.add(new Patient("srija", Severity.LOW));
        patientList.add(new Patient("nivi", Severity.HIGH));

        Collections.sort(patientList);
        for (Patient patient : patientList) {
            System.out.println("Attending to patient: " + patient.getName() +
                    " (Severity: " + patient.getSeverity() + ")");
        }
    }
}
