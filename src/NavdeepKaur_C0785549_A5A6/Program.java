package NavdeepKaur_C0785549_A5A6;

import javax.swing.*;
public class Program {

    public static class ProgramClass {
        public static final int SUCCESS = 1;
        public static final int FAIL = 0;
        public static void main(String[] args){

            NavdeepKaur_C0785549_A5A6 quote = new NavdeepKaur_C0785549_A5A6();
            if(getCredential() == SUCCESS){
                float serviceCost = quote.getCost("Package A", NavdeepKaur_C0785549_A5A6.PRICE_PACKAGE_A, "Package B", NavdeepKaur_C0785549_A5A6.PRICE_PACKAGE_B, "Select Packages", "Enter the number of hours you want package for: ");
                float storageCost = quote.getCost("Small Storage", NavdeepKaur_C0785549_A5A6.PRICE_STORAGE_SMALL,  "Large Storage", NavdeepKaur_C0785549_A5A6.PRICE_Storage_LARGE, "Select Storage", "Enter the number of days you want storage for: ");
                float itemsCost = quote.getCost("Small Boxes", NavdeepKaur_C0785549_A5A6.PRICE_BOX_SMALL,  "Large Boxes", NavdeepKaur_C0785549_A5A6.PRICE_BOX_LARGE, "Select boxes", "Enter the number of boxes you want: ");

                String outputString = "Your service cost = "+serviceCost;
                outputString+= "\nStorage cost = "+storageCost;
                outputString+= "\nItems cost = "+itemsCost;
                outputString+= "\nTotal = "+(serviceCost+storageCost+itemsCost);

                JOptionPane.showMessageDialog(null, outputString);
            }

        }

        /**
         *
         * @return returns true if the Credentials are valid, otherwise false
         */
        public static int getCredential(){

            JOptionPane.showMessageDialog(null, "Credentials\n\nfirst name = navdeep\nlast name = kaur");

            for(int i=0;i<3;i++){
                try {
                    String firstName = JOptionPane.showInputDialog("Enter your first name");
                    if (firstName.toLowerCase().trim().equals("navdeep")) {
                        String lastName = JOptionPane.showInputDialog("Enter your last name");
                        if (lastName.toLowerCase().trim().equals("kaur")) {
                            return SUCCESS;
                        }
                    }
                }catch (Exception e){
                    return FAIL;
                }
                if(i<2)
                    JOptionPane.showMessageDialog(null, "Wrong detail try agian!");
            }
            JOptionPane.showMessageDialog(null, "Number of attempts expired!");

            return FAIL;
        }

    }

}
