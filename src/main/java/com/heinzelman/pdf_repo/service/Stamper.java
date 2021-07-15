package com.heinzelman.pdf_repo.service;

import java.io.FileOutputStream;

public class Stamper {

    public void stamp( String path ) {
        /*
        try {

            String FilenameIn = args[0];
            String FilenameOut = FilenameIn.replace(".pdf", "_NEW.pdf");
            String Write = args[1];


            //Create PdfReader instance.
            PdfReader pdfReader = new PdfReader( FilenameIn ) ; //"C:\\Users\\pheinzelman\\Desktop\\TestFile.pdf");

            //Create PdfStamper instance.
            PdfStamper pdfStamper = new PdfStamper(pdfReader,  new FileOutputStream( FilenameOut )) ; // "C:\\Users\\pheinzelman\\Desktop\\ModifiedTestFile.pdf"));

            byte[] userPass =  null; //args[2].getBytes();
            byte[] ownerPass = args[2].getBytes();

            pdfStamper.setEncryption( userPass, ownerPass, 4, PdfEncryption.STANDARD_ENCRYPTION_128);
            // 0 - zablokowany druk
            // only printing allowed



            //Create BaseFont instance.
            BaseFont baseFont = BaseFont.createFont(
                    BaseFont.TIMES_ROMAN,
                    BaseFont.CP1252, BaseFont.NOT_EMBEDDED);

            //Get the number of pages in pdf.
            int pages = pdfReader.getNumberOfPages();

            //Iterate the pdf through pages.
            for(int i=1; i<=pages; i++) {
                //Contain the pdf data.
                PdfContentByte pageContentByte = pdfStamper.getOverContent(i);

                pageContentByte.beginText();
                //Set text font and size.
                pageContentByte.setFontAndSize(baseFont, 14);
                pageContentByte.setCMYKColorFill(100,0,100,0);

                pageContentByte.setTextMatrix(5, 5);

                Rectangle pageSize = ( pdfReader.getPageSize(i) );

                pageContentByte.setTextMatrix( 1,2, 3,4,5, 5 ); // pageSize.getWidth()-10


                //Write text
                pageContentByte.showText( Write ) ; //"napis!");
                pageContentByte.endText();

                //pageContentByte.
            }




            //Close the pdfStamper.
            pdfStamper.close();

            System.out.println("PDF modified successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
    }
}
