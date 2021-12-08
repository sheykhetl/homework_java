import java.util.StringTokenizer;

public class address {

    private String country, region, city, street, house, block, flat;

    private address(
            String country,
            String region,
            String city,
            String street,
            String house,
            String block,
            String flat
    ) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.house = house;
        this.block = block;
        this.flat = flat;
    }

    public static address parseWithSplit(String address, String delimiter){
        String[] split = address.split(delimiter + " ");
        return new address(split[0], split[1], split[2], split[3], split[4], split[5], split[6]);
    }

    public static address parseWithStringTokenizer(String address, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(address, " " + delimiter);
        return new address(
                tokenizer.nextToken(),
                tokenizer.nextToken(),
                tokenizer.nextToken(),
                tokenizer.nextToken(),
                tokenizer.nextToken(),
                tokenizer.nextToken(),
                tokenizer.nextToken()
        );
    }

    @Override
    public String toString() {
        return "address{" +
                "country = '" + country + '\'' +
                ", region = '" + region + '\'' +
                ", city = '" + city + '\'' +
                ", street = '" + street + '\'' +
                ", house = '" + house + '\'' +
                ", block = '" + block + '\'' +
                ", flat = '" + flat + '\'' +
                '}';
    }
}