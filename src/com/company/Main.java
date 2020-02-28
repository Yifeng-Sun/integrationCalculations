package com.company;

public class Main {

    public static void main(String[] args) {
	// this program calculates the sum of the area of the right trapezoids.
        //the target integration is the integral of X in [Y = 3X^2 - 4X + 2], from 9 to 25.



        // first try, set the ▲x to 8
        System.out.println(estimation(8f));
        // set the ▲x to 4
        System.out.println(estimation(4f));
        // set the ▲x to 1
        System.out.println(estimation(1f));
        // set the ▲x to .25
        System.out.println(estimation(.25f));
        // set the ▲x to .1
        System.out.println(estimation(.1f));
        // set the ▲x to .01
        System.out.println(estimation(.01f));
    }




//the estimation formula
    public static float estimation(float deltaX){
        float sum = 0;//the sum of the areas added
        float lowerBound;
        lowerBound = 9.0f;//the global lower bound is 9
        float l1;//height 1
        float l2;//height 2
        float area;//current area
        while(true){
            if(lowerBound + deltaX < 25.0){
                l1 = MyFunction.getY(lowerBound);
                l2 = MyFunction.getY(lowerBound += deltaX);
                area = (l1 + l2) * deltaX / 2;
                sum += area;
            }else{
                l1 = MyFunction.getY(lowerBound);
                l2 = MyFunction.getY(16);
                area = (l1 + l2) * (25 - lowerBound) / 2;//the rest of the x
                sum += area;
                break;
            }
        }
        return sum;

    }

}