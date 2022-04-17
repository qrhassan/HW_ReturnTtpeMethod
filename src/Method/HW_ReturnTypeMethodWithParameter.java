package Method;

public class HW_ReturnTypeMethodWithParameter {

    //Single Parameter
    public String getPassportNumber(String passportNumber) {
        System.out.println("What is the passport number: " + passportNumber);
        return passportNumber;
    }

    public int doAddition(int num1, int num2) {
        int addition = num1+num2;
        System.out.println("The addition of two number is: " + addition);
        return addition;
    }

    public double getAnnualSalary (int salary, double bonus, double tax) {
        double grossSalary = (salary*12) + (bonus*2);
        double netSalary = grossSalary+ (grossSalary*tax);
        double roundOff = Math.round(netSalary*100.0)/100.0;
        System.out.println("The annual net salary is: $" + roundOff);
        return roundOff;
    }

    //Multi Parameter
    public String geDisplay(String certificate, int year, String school) {
        String graduation = ("Graduation details: " + certificate + " - " + year + " - " + school);
        return graduation;
    }

    public double getCarPrice (int carPrice, double salesTax, double cityTax, double insurance, int dmvCost) {
        double costAfterTax = carPrice+salesTax+cityTax;
        double totalCost = costAfterTax+insurance+dmvCost;
        System.out.println("The total cost of the car is: $" + totalCost);
        return totalCost;
    }

    public static void main(String[] args) {

        HW_ReturnTypeMethodWithParameter object = new HW_ReturnTypeMethodWithParameter();
        object.getPassportNumber("ABD44556658");
        object.geDisplay("Master of Arts", 2017, "WKU");
        object.doAddition(250, 500);
        object.getAnnualSalary(7000,3000, 0.10);
        object.getCarPrice(33500,0.07,0.05,900.50,215);
    }
}
