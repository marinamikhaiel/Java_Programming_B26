package day07_unary_operators;

public class SalaryCalculator{
    public static void main(String[] args) {
        int salary = 100_000;
        double stateTaxRate = 0.08, federalTaxRate = 0.21, stateTax = salary * stateTaxRate, federalTax = salary * federalTaxRate, totalTax = federalTax + stateTax, salaryAfterTax = salary - totalTax;

        String wholeSalary = "the tax rates for the state is " + stateTaxRate + " and for the federal is " + federalTaxRate + ".\n Your total salary is $" + salary + ", the amount of tax for state $" + stateTax + " and federal $" + federalTax + ".\nThe total tax amount $" + totalTax + ", and your salary after all taxes $" + salaryAfterTax;

        System.out.println(wholeSalary);


    }

    }
