package NavdeepKaur_C0785549_A5A6;

import javax.swing.*;

public class NavdeepKaur_C0785549_A5A6 {
    public static final float PRICE_PACKAGE_A = 100;
    public static final float PRICE_PACKAGE_B = 150;
    public static final float PRICE_STORAGE_SMALL = 8;
    public static final float PRICE_Storage_LARGE = 20.11f;
    public static final float PRICE_BOX_SMALL = 2.50f;
    public static final float PRICE_BOX_LARGE = 4.50f;

    public NavdeepKaur_C0785549_A5A6() {
        JOptionPane.showMessageDialog(null, "Welcome to Will's Moving");
    }

    public NavdeepKaur_C0785549_A5A6(String s) {
        JOptionPane.showMessageDialog(null, s);
    }

    /**
     * @param option1 name of the product1
     * @param price1  price of the product1
     * @param option2 name of the product 2
     * @param price2  price of the product 2
     * @param prompt1 prompt for slecting type of product
     * @param prompt2 prompt for geting input for quantity of the selected products
     * @return returns the cost for product 1 and product 2 and their quantities.
     */
    // All in one method
    public float getCost(String option1, float price1, String option2, float price2, String prompt1, String prompt2) {
        String per = "";
        JCheckBox checkPacA = new JCheckBox(option1);
        JCheckBox checkPacB = new JCheckBox(option2);
        Object[] components = {prompt1, checkPacA, checkPacB};
        int input = JOptionPane.showConfirmDialog(null, components, "Will's Moving", JOptionPane.OK_CANCEL_OPTION);
        if (input == JOptionPane.OK_OPTION) {
            JTextField quantityA = new JTextField();
            JTextField quantityB = new JTextField();
            float qtA = 0, qtB = 0;
            if (checkPacA.isSelected() && checkPacB.isSelected())
                components = new Object[]{prompt2 + "(" + option1 + ")", quantityA, prompt2 + "(" + option2 + ")", quantityB};
            else if (checkPacA.isSelected())
                components = new Object[]{prompt2 + "(" + option1 + ")", quantityA};
            else if (checkPacB.isSelected())
                components = new Object[]{prompt2 + "(" + option2 + ")", quantityB};
            else {
                JOptionPane.showMessageDialog(null, "Please Select an option!");
                return getCost(option1, price1, option2, price2, prompt1, prompt2);
            }

            int click = JOptionPane.showConfirmDialog(null, components, "Will's Moving", JOptionPane.OK_CANCEL_OPTION);
            if (click == JOptionPane.OK_OPTION) {
                try {
                    if (!quantityA.getText().trim().equals(""))
                        qtA = Float.parseFloat(quantityA.getText().trim());
                    if (!quantityB.getText().trim().equals(""))
                        qtB = Float.parseFloat(quantityB.getText().trim());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Wrong input! try again!");
                    return getCost(option1, price1, option2, price2, prompt1, prompt2);
                }
                return qtA * price1 + qtB * price2; // Cost ex: service cost, options cost, items cost etc.
            }
        }
        return 0;
    }
}
