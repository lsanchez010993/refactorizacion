//REFACT8: Mètode Inline Code:
//        public String obtenirAdrecaCompleta() {
//            StringBuilder result = new StringBuilder();
//            return result
//                    .append(country)
//                    .append(", ")
//                    .append(city)
//                    .append(", ")
//                    .append(street)
//                    .append(", ")
//                    .append(house)
//                    .append(" ")
//                    .append(quarter).toString();
//        }
//REFACT7: Mètode Inline Code:
//    public static class Human {
//        private String name;
//        private String age;
//        private String country;
//        private String city;
//        private String street;
//        private String house;
//        private String quarter;
//
//REFACT7: Mètode Inline Code:
public class Human {
    private String name, age, country, city, street, house, quarter;
    //REFACT8: Mètode Inline Code:
    public String obtenIRAdrecaCompleta() {
        return String.join(", ", country, city, street, house + " " + quarter);
    }
}