package chapterFive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoPolicyTest {



    public static void main(String[] args) {
        // create two AutoPolicy objects
        AutoPolicy policy1 = new AutoPolicy(11111111, "Toyota Camry", "NJ");
        AutoPolicy policy2 = new AutoPolicy(22222222, "Ford Fusion", "MA");

        //We invoked the methods to display the two policies here
        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }

//    Method that displays the state of AutoPolicy
//static methods can be invoked without an object.
    public static void policyInNoFaultState(AutoPolicy policy){
        System.out.println("The auto policy: ");
        System.out.printf("Account #: %d;  Car: %s; State %s %s is a no-fault state%n%n",
        policy.getAccountNumber(),
        policy.getMakeAndModel(),
        policy.getState(),
                (policy.isNoFaultState() ? "is" : "is not" )
        );
    }
}