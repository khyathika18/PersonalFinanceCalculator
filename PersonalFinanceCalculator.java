package phase_0_mini_project;

import java.util.*;

public class PersonalFinanceCalculator {

    public static void main(String [] args)
    {
         Scanner sc=new Scanner(System.in);
       

         System.out.println("Enter the montly income: ");
         double income=sc.nextDouble();

         System.out.println("Enter food expenses: ");
         double foodExpense=sc.nextDouble();

         System.out.println("Enter travel expenses: ");
         double travelExpense=sc.nextDouble();

         System.out.println("Enter education expenses: ");
         double educationExpense=sc.nextDouble();

         System.out.println("Enter others expenses: ");
         double othersExpense=sc.nextDouble();

        Expense food=new Expense("food", foodExpense);
        Expense travel=new Expense("travel", travelExpense);
        Expense education=new Expense("education", educationExpense);
        Expense others=new Expense("others", othersExpense);

        FinanceManager manager=new  FinanceManager();


         double totalExpenses=manager.calculateTotalExpenses(food,travel,education,others);

         double remaining=manager.calculateRemaining(income, totalExpenses);

        //  double savingPercent=(remaining/income)*100;

         System.out.println("------Financial Summary------");

         System.out.println("Income: "+income+" rps");
         System.out.println("Total Expenses: "+totalExpenses+" rps");
         System.out.println("Remaining: "+remaining+" rps");
         System.out.println("Saving Percentage: "+manager.calculateSavingPercent(income, remaining)+" %");
    }
    
}

class Expense  {
    private String category;
    private double amount;

    public Expense(String category,double amount)
    {
       this.category=category;
       this.amount=amount; 
    }

    public double getAmount()
    {
        return amount;
    }
}

class FinanceManager
{
    double totalExpenses=0;
    double remaining=0;
    public double calculateTotalExpenses(Expense food,Expense travel, Expense education, Expense others )
    {
         totalExpenses=food.getAmount()+travel.getAmount()+education.getAmount()+others.getAmount();

        return totalExpenses;
    }

    public double calculateRemaining(double income,double totalExpenses){
         remaining=income-totalExpenses;

         return remaining;

    }

    public  double calculateSavingPercent(double income,double remaining)
    {
        double savingPercent=(remaining/income)*100;

        return  savingPercent;
    }
}
