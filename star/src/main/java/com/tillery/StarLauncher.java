package com.tillery;

import com.tillery.record.Star;

import java.math.BigDecimal;

public class StarLauncher {

    public static void main(String... args) {
        new StarLauncher().announceNewStar();;
    }

    private void announceNewStar() {
        System.out.println("StarLauncher - new star drop");

        //var must be initialized when defined
        //var star;

        //legal usage/reassignment
        var star = new Star("Star1", BigDecimal.valueOf(123l), 456l);
        System.out.println("Star = [" + star + "]");
        star = new Star("Star2", BigDecimal.ZERO, 0l);
        System.out.println("Star = [" + star + "]");
        star = null; //reference type == cool

        // cannot reassign var to another type
        //star = BigDecimal.ONE;

        //var is legal to use as a name, it is not a keyword
        var var = Integer.valueOf(1);
        System.out.println("Var = [" + var + "]");
        //reference type - var is still Integer
        var = 5;
        System.out.println("Var = [" + var + "]");
        var = null; //reference type == cool
        //cannot reassign to another type
        //var = "5";
        //var = 5l;

        var primitive = 1;
        System.out.println("primitive = [" + primitive + "]");
        //Integer is unboxed, primitive is still a primitive
        primitive = Integer.valueOf(5);
        System.out.println("primitive = [" + primitive + "]");
        //can't assign primitive a null reference
        //primitive = null;

        System.out.println("StarLauncher - we're done");
    }
}
