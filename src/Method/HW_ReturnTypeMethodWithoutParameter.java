package Method;

public class HW_ReturnTypeMethodWithoutParameter {

    public void getDisplay() {

        System.out.println("This is a return type of method");
        System.out.println("This is without a parameter");
    }

    public double getAddition() {
        int num1 = 180;
        double num2 = 200.50;
        double addition = num1 + num2;
        System.out.println("The addition of two numbers is: " + addition);
        return addition;
    }

    public int getSubtraction() {
        int num3 = 250;
        int num4 = 400;
        int subtraction = num3 - num4;
        System.out.println("The subtraction of two numbers is: " + subtraction);
        return subtraction;
    }

    public double getMultiplication() {
        int num5 = 44;
        double num6 = 30.99;
        double multiplication = num5 * num6;
        System.out.println("The multiplication of two numbers is: " + multiplication);
        return multiplication;
    }

    public int getDivision() {
        int num7 = 5000;
        int num8 = 700;
        double roundOffDivision = Math.round((num7 / num8) * 100.0) / 100.0;
        System.out.println("The division of two numbers is: " + roundOffDivision);
        return (int) roundOffDivision;
    }

    public boolean isRaining() {
        boolean isRaining = false;
        System.out.println("I think is not going to rain: " + isRaining);
        return isRaining;
    }

    public String getStudentInfo() {
        String name = "Kazi Aizah";
        String grade = "PK";
        int stdId = 100;
        String information = name + " - " + grade + " - " + stdId;
        System.out.println("Student information is: " + information);
        return information;
    }

    public static void main(String[] args) {
        //Object Creation:
        HW_ReturnTypeMethodWithoutParameter object = new HW_ReturnTypeMethodWithoutParameter();

        //Outcome
        object.getDisplay();
        object.getAddition();
        object.getSubtraction();
        object.getDivision();
        object.isRaining();
        object.getStudentInfo();
    }
}


