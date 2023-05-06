package day07_ifStatements;

public class NetIncomeCalc {

    public static void main(String[] args) {

        int salary = 100_000;
        double taxRate =  0;
        boolean isMarried = false;


        if(salary >= 130_000){ // if the salary is 130_000 or more, then the tax rate should be 35%
            taxRate = 0.35;
        }

        if(salary >= 100_000 && salary <= 129_999){ // if the salary is between 100_000 to 130_000 (excluded) then the tax rate should be 30%
            taxRate = 0.3;
        }

        if(salary >= 80_000 && salary <= 99_999){ // if the salary is between 80_000 to 100_000 (excluded) then the rax rate should be 25%
            taxRate = 0.25;
        }

        if(salary <= 79_999){    // if the salary is less than 80_000 then the tax should be 20%
            taxRate = 0.2;
        }


        if(isMarried){  // if the person is married
            taxRate -= 0.05; // tax is reduced by 5%
        }

        double netIncome = salary * (1-taxRate);

        System.out.println(netIncome);

        double totalTax = salary * taxRate;
     //   double netIncome = salary - totalTax;

        System.out.println("salary = " + salary);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);








    }
}



/*
3. Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129,999k
                        25% for salary of 80K to 99,999K
                        20% for salary of 79K or less
                in addition:
                	if the person is married, he/she will pay 5% less tax
 */