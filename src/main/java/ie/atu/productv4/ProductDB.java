package ie.atu.productv4;


public class ProductDB {
    public static Product getProduct(String productCode){

        Product myItem = null;
        if (productCode.equalsIgnoreCase("java")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            myItem=myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            myItem=myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            myItem=myBook;
        }
        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            myItem=mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            myItem=mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            myItem=mySoftware;
        }
        if (productCode.equalsIgnoreCase("pink")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Dark Side of The Moon");
            myMusic.setPrice(30.50);
            myMusic.setArtist("Pink Floyd");
            myMusic.setLabel("Columbia group");
            myItem=myMusic;
        } else if (productCode.equalsIgnoreCase("brock")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Saturation 1");
            myMusic.setPrice(15.10);
            myMusic.setArtist("Brockhampton");
            myMusic.setLabel("America group");
            myItem=myMusic;
        } else if (productCode.equalsIgnoreCase("doom")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("The Mouse & The Mask");
            myMusic.setPrice(55.70);
            myMusic.setArtist("MF Doom");
            myMusic.setLabel("Dangerdoom");
            myItem=myMusic;
        }
        if (productCode.equalsIgnoreCase("kdl43")) {
            Tv myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("Sony Bravia Smart TV KDL43");
            myTv.setPrice(889.0);
            myTv.setManufacture("Sony");
            myTv.setScreenSize("55''");
            myItem=myTv;
        } else if (productCode.equalsIgnoreCase("pol")) {
            Tv myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("Intel Super Smart TV POL444");
            myTv.setPrice(900.40);
            myTv.setManufacture("Sony");
            myTv.setScreenSize("30''");
            myItem=myTv;
        } else if (productCode.equalsIgnoreCase("klum")) {
            Tv myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("HP Ultra Extreme Smart TV KLUM858");
            myTv.setPrice(850.70);
            myTv.setManufacture("Sony");
            myTv.setScreenSize("55''");
            myItem=myTv;
        }
        return myItem;
    }
   // public static Book or Software getProduct(String productCode) {
    // In a more realistic application, this code would get the data for the product from a file or database
    // For now, this code just uses if/else statements to return the correct product data

    //We need all the book and software objects, but what kind of object do we return?
    //}
}
