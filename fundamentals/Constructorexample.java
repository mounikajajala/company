class Constructorex {
    String domainName;
    public Company(){
        domainName = "Welcome World";
    }
}

public class CompanyImplementation {
    
    public static void main(String[] args) {
        Company companyObj = new Company();
        System.out.println("Domain name = "+ companyObj.domainName);
    }
}