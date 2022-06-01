package com.bridgelabz.Java_Day9;

public class EmpWageBuilder {
    public static final int IS_PRESENT = 1;
    public static final int IS_PART_TIME = 2;

    private final String company;
    private final int empWagePerHour, maxMonthlyHours, maxWorkingDays;

    public EmpWageBuilder(String company, int empWagePerHour, int maxMonthlyHours, int maxWorkingDays){
        this.company = company;
        this.empWagePerHour = empWagePerHour;
        this.maxMonthlyHours = maxMonthlyHours;
        this.maxWorkingDays = maxWorkingDays;
    }

    private int calcWage() {

        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

        while(empHrs <= maxMonthlyHours && totalWorkingDays <= maxWorkingDays) {
            totalWorkingDays++;

            int empCheck = (int)Math.floor(Math.random()*10)%3;
            if(empCheck == IS_PRESENT){
                System.out.println("Employee is Present!");
            }else if(empCheck == IS_PART_TIME) {
                System.out.println("Employee is Part-time!");
            }else {
                System.out.println("Employee is Absent!");
            }

            if (empCheck == IS_PRESENT) {
                empHrs = 8;
            } else if (empCheck == IS_PART_TIME) {
                empHrs = 4;
            }else {
                empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day No.: "+ totalWorkingDays +", Employee hrs: "+empHrs);
        }
        return totalEmpHrs * empWagePerHour;
    }

    public static void main(String[] args) {
        EmpWageBuilder dMart = new EmpWageBuilder("DMart",20, 40,5);
        EmpWageBuilder jio = new EmpWageBuilder("Jio",15, 20, 4);

        System.out.println("Total Employee Wage for "+ dMart.company +" is "+dMart.calcWage());
        System.out.println("Total Employee Wage for "+ jio.company +" is "+jio.calcWage());
    }
}
