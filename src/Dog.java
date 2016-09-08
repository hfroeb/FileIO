
/**
 * Created by halleyfroeb on 9/8/16.
 */
public class Dog {
    private String dogName;
    private int age;
    private String breed;
    private String gender;
    private String ownerName;

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void enterAttributes() {
        System.out.println("What is the name of your dog?");
        dogName = Main.scanner.nextLine();
        System.out.println("How old is your dog?");
        age = Integer.parseInt(Main.scanner.nextLine());
        System.out.println("What is your dog's breed?");
        breed = Main.scanner.nextLine();
        System.out.println("Is your dog male or female?");
        gender = Main.scanner.nextLine();
        System.out.println("Please enter the name of the dog's owner");
        ownerName = Main.scanner.nextLine();
    }

    public void updateAttributes() {
        System.out.println("Which attribute would you like to change?\n[1]Dog Name [2]Age" +
                "[3]Breed [4]Gender [5]Owner Name");
        int change = Integer.parseInt(Main.scanner.nextLine());

        switch(change) {
            case 1:
                System.out.println("Enter updated Dog Name");
                dogName = Main.scanner.nextLine();
                break;
            case 2:
                System.out.println("Enter updated Age");
                age = Integer.parseInt(Main.scanner.nextLine());
                break;
            case 3:
                System.out.println("Enter updated breed");
                breed = Main.scanner.nextLine();
                break;
            case 4:
                System.out.println("Enter updated gender");
                gender = Main.scanner.nextLine();
                break;
            case 5:
                System.out.println("Enter updated Owner Name");
                ownerName = Main.scanner.nextLine();
                break;
            default:
                System.out.println("Invalid option");
        }

    }
}
