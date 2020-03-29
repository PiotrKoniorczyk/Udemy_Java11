package JavaForBeginner.Practice_06_Invoice;


public class Invoice {
    public static void main(String[] args) {

        //----- NUMBER AND DATE----
        String invoiceNumber = "01/2020";
        String invoiceDate = "01.02.2020";

        //----- SELER DETAILS-------
        String selerName = "ABC COMPANY";
        String sellerAdressStreetAndNumber = "Mickiewicza 10a";
        String sellerAdressCityName = "Krakow";
        String sellerAdressPostCode = "90-900";
        String selerNIP = "6735639283";


        //----- BUYER DETAILS-------
        String buyerName = "XYZ COMPANY";
        String buyerAdressStreetAndNumber = "Chopina 10a";
        String buyerAdressCityName = "Warszawa";
        String buyerAdressPostCode = "30-780";
        String buyerNIP = "4959672343";


        //----- DESCRIPTION-------

        // 1-st Product
        String productName_1 = "Watch";
        int productQuantity_1 = 1;
        double productNetValue_1 = 1500;
        double productVAT_1 = 0.23;


        // 2-nd Product
        String productName_2 = "Pencile";
        int productQuantity_2 = 3;
        double productNetValue_2 = 7.5;
        double productVAT_2 = 0.23;

        // 3-rd Product
        String productName_3 = "Printer";
        int productQuantity_3 = 2;
        double productNetValue_3 = 750;
        double productVAT_3 = 0.23;

        // 4-th Product
        String productName_4 = "Mouse";
        int productQuantity_4 = 4;
        double productNetValue_4 = 30;
        double productVAT_4 = 0.23;


        // 5-th Product
        String productName_5 = "USB-C Charger";
        int productQuantity_5 = 12;
        double productNetValue_5 = 15;
        double productVAT_5 = 0.23;


        Cleint_Invoice sellerDetails = new Cleint_Invoice();
        CompanyAddress sellerAdress = new CompanyAddress();

        sellerDetails.setCompanyName(selerName);
        sellerAdress.setStreetAndNumber(sellerAdressStreetAndNumber);
        sellerAdress.setCityName(sellerAdressCityName);
        sellerAdress.setPostCode(sellerAdressPostCode);
        sellerDetails.setNIP(selerNIP);


        Cleint_Invoice BuyerDetails = new Cleint_Invoice();
        CompanyAddress BuyerAdress = new CompanyAddress();

        BuyerDetails.setCompanyName(buyerName);
        BuyerAdress.setStreetAndNumber(buyerAdressStreetAndNumber);
        BuyerAdress.setCityName(buyerAdressCityName);
        BuyerAdress.setPostCode(buyerAdressPostCode);
        BuyerDetails.setNIP(buyerNIP);



        //Product 1

        Description product_1 = new Description();

        product_1.setName(productName_1);
        product_1.setQuantity(productQuantity_1);
        product_1.setNetValue(productNetValue_1);
        product_1.setVAT(productVAT_1);

        //Product 2

        Description product_2 = new Description();

        product_2.setName(productName_2);
        product_2.setQuantity(productQuantity_2);
        product_2.setNetValue(productNetValue_2);
        product_2.setVAT(productVAT_2);

        //Product 3

        Description product_3 = new Description();

        product_3.setName(productName_3);
        product_3.setQuantity(productQuantity_3);
        product_3.setNetValue(productNetValue_3);
        product_3.setVAT(productVAT_3);

        //Product 4

        Description product_4 = new Description();

        product_4.setName(productName_4);
        product_4.setQuantity(productQuantity_4);
        product_4.setNetValue(productNetValue_4);
        product_4.setVAT(productVAT_4);

        //Product 5

        Description product_5 = new Description();

        product_5.setName(productName_5);
        product_5.setQuantity(productQuantity_5);
        product_5.setNetValue(productNetValue_5);
        product_5.setVAT(productVAT_5);



        //Total


        double NetTotal = product_1.getNetValueTotal()+
                product_2.getNetValueTotal()+
                product_3.getNetValueTotal()+
                product_4.getNetValueTotal()+
                product_5.getNetValueTotal();

        double VATTotal = product_1.getVATTotal()+
                product_2.getVATTotal()+
                product_3.getVATTotal()+
                product_4.getVATTotal()+
                product_5.getVATTotal();

        double GrossTotal = product_1.getGrossValueTotal()+
                product_2.getGrossValueTotal()+
                product_3.getGrossValueTotal()+
                product_4.getGrossValueTotal()+
                product_5.getGrossValueTotal();


        //print invoice number and date

        System.out.println("Invoice number: " + invoiceNumber);
        System.out.println("Invoice date: " + invoiceDate);

        System.out.println();
        System.out.println();

        //print Seller
        System.out.println("Seller");
        System.out.println("------");
        System.out.println(sellerDetails.getCompanyName());
        System.out.println(sellerAdress.getStreetAndNumber());
        System.out.println(sellerAdress.getPostCode() +" "+ sellerAdress.getCityName());
        System.out.println(sellerDetails.getNIP());

        System.out.println();
        System.out.println();


        //print Buyer
        System.out.println("Buyer");
        System.out.println("------");
        System.out.println(sellerDetails.getCompanyName());
        System.out.println(sellerAdress.getStreetAndNumber());
        System.out.println(sellerAdress.getPostCode() +" "+ sellerAdress.getCityName());
        System.out.println(sellerDetails.getNIP());


        System.out.println();
        System.out.println();

        //print  DESCRIPTION


        System.out.println("Description");
        System.out.println("------");
        System.out.print("1. "+ product_1.getName() +"         quantity- "+ product_1.getQuantity()
                +"         Net Value- "+ product_1.getNetValue()+"zł"
                +"         VAT- "+ product_1.getVAT()
                +"         Gross Value "+ product_1.getGrossValue()+"zł");
        System.out.println();
        System.out.print("2. "+ product_2.getName() +"         quantity- "+ product_2.getQuantity()
                +"         Net Value- "+ product_2.getNetValue()+"zł"
                +"         VAT- "+ product_2.getVAT()
                +"         Gross Value "+ product_2.getGrossValue()+"zł");
        System.out.println();
        System.out.print("3. "+ product_3.getName() +"         quantity- "+ product_3.getQuantity()
                +"         Net Value- "+ product_3.getNetValue()+"zł"
                +"         VAT- "+ product_3.getVAT()
                +"         Gross Value "+ product_3.getGrossValue()+"zł");
        System.out.println();
        System.out.print("4. "+ product_4.getName() +"         quantity- "+ product_4.getQuantity()
                +"         Net Value- "+ product_4.getNetValue()+"zł"
                +"         VAT- "+ product_4.getVAT()
                +"         Gross Value "+ product_4.getGrossValue()+"zł");
        System.out.println();
        System.out.println("5. "+ product_5.getName() +"         quantity- "+ product_5.getQuantity()
                +"         Net Value- "+ product_5.getNetValue()+"zł"
                +"         VAT- "+ product_5.getVAT()
                +"         Gross Value "+ product_5.getGrossValue()+"zł");
        //print Total

        System.out.println();
        System.out.println();

        System.out.println("Total Values");
        System.out.println("------");
        System.out.format("Net Value total = : %.2f", NetTotal);
        System.out.println();
        System.out.format("VAT Value total = : %.2f", VATTotal);
        System.out.println();
        System.out.format("Gross Value total = : %.2f", GrossTotal);
    }


}