import java.util.*;

public class CreateTwoLists {
    public static void main(String[] args) {
        ArrayList<String>   arrList = new ArrayList<String>();
        LinkedList<String>  arrLink = new LinkedList<String>();
        long puttingListDelay;
        long puttingLinkDelay;

        long gettingListDelay;
        long gettingLinkDelay;

        System.out.println("\n-----------------------------------");
        System.out.println("-----------TESTING_PROG------------");
        System.out.println("-----------------------------------\n");

        //------------------LIST-------------------

        System.out.println("Putting in ArrayList in process...");

        Date puttingListStart = new Date();
        for (int i = 0; i < 100000; ++i) {
            arrList.add("Putting #" + i);
        }
        Date puttingListEnd = new Date();
        puttingListDelay = puttingListEnd.getTime() - puttingListStart.getTime();

        System.out.println("puttingListDelay: " + puttingListDelay + " in ms.\n" );


        System.out.println("Getting elements from ArrayList in process...");
        Date gettingListStart = new Date();
        String var;
        for (int i = 0; i < 100000; ++i) {
            var = arrList.get(i);
        }
        Date gettingListEnd = new Date();
        gettingListDelay = gettingListEnd.getTime() - gettingListStart.getTime();

        System.out.println("gettingListDelay: " + gettingListDelay + " in ms.");




        //------------------LIST--------------------





        //------------------LINK--------------------
        System.out.println("\nPutting in LinkedList in process...");

        Date puttingLinkStart = new Date();
        for (int i = 0; i < 100000; ++i) {
            arrLink.add("Putting #" + i);
        }
        Date puttingLinkEnd = new Date();
        puttingLinkDelay = puttingLinkEnd.getTime() - puttingLinkStart.getTime();

        System.out.println("puttingListDelay: " + puttingLinkDelay + " in ms." );


        System.out.println("\nGetting elements from LinkedArray in process...");
        Date gettingLinkStart = new Date();
        String var1;
        for (int i = 0; i < 100000; ++i) {
            var = arrLink.get(i);
        }
        Date gettingLinkEnd = new Date();
        gettingLinkDelay = gettingLinkEnd.getTime() - gettingLinkStart.getTime();

        System.out.println("gettingLinkDelay: " + gettingLinkDelay + " in mas");

        //------------------LINK--------------------





    }
}