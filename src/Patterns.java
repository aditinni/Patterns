public class Patterns {

    public void printPatterns(){
        /* Pattern 1
        *  * * * *
           * * * *
           * * * *
           * * * *


        for(int i=0; i<4; i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }   */


        /*   Pattern 2
        *           *
                    * *
                    * * *
                    * * * *
        *
        *

        for(int i=0;i<4;i++)
        {
            for(int j =0; j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        } */

        /*
                Pattern 3

                1
                1 2
                1 2 3
                1 2 3 4
                1 2 3 4 5

         */

      /*  for(int i=0;i<5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" "+(j+1));
            }
            System.out.println();
        } */


        /*
                1
                2 2
                3 3 3
                4 4 4 4
                5 5 5 5 5
         */

      /*  for(int i=0;i<5;i++)
        {
            for(int j =0;j<=i;j++)
            {
                System.out.print(" "+(i+1));
            }

            System.out.println();
        } */


        /*
               * * * *
               * * *
               * *
               *
         */

     /*   for(int i= 0;i<4;i++)
        {
            for(int j=0;j<(4-(i+1)+1);j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        } */

        /*
                1 2 3 4 5
                1 2 3 4
                1 2 3
                1 2
                1
         */

   /*     for(int i= 0;i<4;i++)
        {
            for(int j=0;j<(4-(i+1)+1);j++)
            {
                System.out.print("  "+(j+1));
            }
            System.out.println();
        }
    } */

        /*
                        *
                      * * *
                    * * * * *
         */

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5-i+1;j++)
            {
                System.out.println();
            }

            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
            }
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.println();
            }
            }
        System.out.println();
        }




}
