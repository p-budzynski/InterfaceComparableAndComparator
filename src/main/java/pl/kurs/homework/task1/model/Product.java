package pl.kurs.homework.task1.model;

public class Product implements Comparable<Product> {
    private String name;
    private int grammage;
    private String producer;
    private double price;
    private int shelfLife;
    private String originCountry;
    private int vatRate;

    public Product(String name, int grammage, String producer, double price, int shelfLife, String originCountry, int vatRate) {
        this.name = name;
        this.grammage = grammage;
        this.producer = producer;
        this.price = price;
        this.shelfLife = shelfLife;
        this.originCountry = originCountry;
        this.vatRate = vatRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrammage() {
        return grammage;
    }

    public void setGrammage(int grammage) {
        this.grammage = grammage;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public int getVatRate() {
        return vatRate;
    }

    public void setVatRate(int vatRate) {
        this.vatRate = vatRate;
    }

    @Override
    public int compareTo(Product o) {
        int result = this.name.compareTo(o.name);
        if (result == 0) {
            result = this.producer.compareTo(o.producer);
        }
        if (result == 0) {
            result = Integer.compare(this.grammage, o.grammage);
        }
        if (result == 0) {
            result = Integer.compare(this.shelfLife, o.shelfLife);
        }
        if (result == 0) {
            result = this.originCountry.compareTo(o.originCountry);
        }
        if (result == 0) {
            result = Double.compare(this.price, o.price);
        }
        if (result == 0) {
            result = Integer.compare(this.vatRate, o.vatRate);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Name: [" + name + "], grammage: [" + grammage + " grams], producer: [" + producer + "], price: [" + price +
                "zł], shelf life: [" + shelfLife + " months], country of origin: [" + originCountry + "], VAT rate: [" + vatRate + " %]";
    }
}
