public class MyClass {
    public String classifyTrainingPoint(int trainingPoint) {
        String result = "";

        if(trainingPoint >= 0 && trainingPoint < 50) {
            result = "Yeu";
        }
        else if (trainingPoint >= 50 && trainingPoint < 65) {
            result = "Trung binh";
        }
        else if (trainingPoint >= 65 && trainingPoint < 80) {
            result = "Kha";
        }
        else if (trainingPoint >= 80 && trainingPoint < 90) {
            result = "Tot";
        }
        else if (trainingPoint >= 90 && trainingPoint <= 100) {
            result = "Xuat sac";
        }
        else {
            result = "Khong hop le";
        }
        return result;
    }
}
