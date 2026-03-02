package Bai4;

public class EmergencyQueue {
    private EmergencyPatient[] emergency;
    private EmergencyPatient[] normal;
    private int eFront = 0, eRear = -1;
    private int nFront = 0, nRear = -1;
    private int size = 100;
    public EmergencyQueue() {
        emergency = new EmergencyPatient[size];
        normal = new EmergencyPatient[size];
    }
    public void addPatient(EmergencyPatient p) {
        if (p.getPriority() == 1) {
            eRear++;
            emergency[eRear] = p;
        } else {
            nRear++;
            normal[nRear] = p;
        }
        System.out.println("Da them benh nhan.");
    }
    public EmergencyPatient callNextPatient() {
        if (eFront <= eRear) {
            EmergencyPatient p = emergency[eFront];
            eFront++;
            return p;
        }
        if (nFront <= nRear) {
            EmergencyPatient p = normal[nFront];
            nFront++;
            return p;
        }
        return null;
    }
    public void displayQueue() {
        System.out.println("Danh sach cap cuu:");
        for (int i = eFront; i <= eRear; i++) {
            emergency[i].display();
        }
        System.out.println("Danh sach thuong:");
        for (int i = nFront; i <= nRear; i++) {
            normal[i].display();
        }
    }
}
