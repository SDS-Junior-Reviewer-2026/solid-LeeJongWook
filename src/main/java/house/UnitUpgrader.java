package house;

public class UnitUpgrader {
    public void upgrade(Apartment apartment) {
        apartment.setSquareFootage(apartment.squareFootage+40);
        apartment.setNumberOfBedrooms(apartment.numberOfBedrooms+1);
//        apartment.squareFootage += 40;
//
//        if (apartment.getClass() != Studio.class)
//            apartment.numberOfBedrooms += 1;
    }
}