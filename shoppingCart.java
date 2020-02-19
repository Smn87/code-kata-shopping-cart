

public class shoppingCart {

    public static int checkOut(String Item) {
        int A = 50;
        int B = 30;
        int C = 20;
        int D = 10;
        int promotionA = 130;
        int promotionB = 37;
        int totalA = 0;
        int totalB = 0;
        int totalC = 0;
        int totalD = 0;
        int totProducts = 0;


        //Initialize a loop to check which letter has been typed

        for (int e = 0; e <= Item.length() - 1; e++) {
            char product = Item.charAt(e);
            if (product == 'A') {
                totalA += 1;
            } else if (product == 'B') {
                totalB += 1;
            } else if (product == 'C') {
                totalC += 1;
            } else if (product == 'D') {
                totalD += 1;
            }
        }
        //Check if how many A are present in the parameter and if the reminder of the division is 0 then apply the promo discount
        for (int q = 0; q <= Item.length() -1; q++){
            if (totalA > 0) {
                for (int w = 1; w <= totalA; w++) {
                    if (w % 3 == 0) {
                        totProducts += promotionA;
                        totalA -= 3;
                    }else if (totalA < 3) {
                        totProducts += totalA * A;
                        totalA = 0;
                        break;
                    }
                }
            }
            //Check if how many B are present in the parameter and if the reminder of the division is 0 then apply the promo discount
            if (totalB > 0) {
                for (int e = 1; e <= totalB; e++) {
                    if (e % 2 == 0) {
                        totProducts += promotionB;
                        totalB -= 2;
                    }else if (totalB < 2) {
                        totProducts += totalB *B;
                        totalB = 0;
                    }
                }
            }
            if (totalC > 0 || totalD > 0) {
                totProducts += (totalC * C) + (totalD * D);
                break;
            }
        }
        return totProducts;
    }
}