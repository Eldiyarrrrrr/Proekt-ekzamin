import database.GeneredId;
import model.Car;
import model.Person;
import model.SocialMedia;
import service.CarService;
import service.SocialMediaService;
import service.impl.CarServiceImpl;
import service.impl.PersonServiceImpl;
import service.impl.SocialMediaImpl;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PersonServiceImpl personService = new PersonServiceImpl();
        CarService carService = new CarServiceImpl();
        SocialMediaService socialMediaService = new SocialMediaImpl();

        while (true){
            System.out.println("""
               1. save person             6. save media                   12. save car         
               2. get all person          7. assign media to person       13. get car by person id
               3. get person by name      8. get social media by id       14. update car by id
               4. update person bu id     9. get all media                15. delete cr=ar by id
               5. deleted person by id    10. delete media by person id
                                          11. delete media by id""");
            try {
                switch (new Scanner(System.in).nextInt()){
                    case 1->{
                        Person person = new Person();
                        System.out.println("write person name");
                        person.setFirstName(new Scanner(System.in).nextLine());
                        System.out.println("write last name");
                        person.setLastName(new Scanner(System.in).nextLine());
                        System.out.println("write age");
                        person.setAge(new Scanner(System.in).nextInt());
                        System.out.println("write email");
                        person.setEmail(new Scanner(System.in).nextLine());
                        person.setId(GeneredId.getPersonId());
                        personService.savePerson(person);
                    }
                    case 2->{
                        System.out.println(personService.getAllPerson());
                    }
                    case 3->{
                        System.out.println("write person name");
                        System.out.println(personService.getPersonByName(new Scanner(System.in).nextLine()));
                    }
                    case 4->{
                        System.out.println("write person id which you want to update");
                        Long id = new Scanner(System.in).nextLong();
                        Person person = new Person();
                        System.out.println("write person name");
                        person.setFirstName(new Scanner(System.in).nextLine());
                        System.out.println("write last name");
                        person.setLastName(new Scanner(System.in).nextLine());
                        System.out.println("write age");
                        person.setAge(new Scanner(System.in).nextInt());
                        System.out.println("write email");
                        person.setEmail(new Scanner(System.in).nextLine());
                        System.out.println(personService.updatePersonById(id, person));
                    }
                    case 5->{
                        System.out.println("write person id which you want to delete");
                        Long id = new Scanner(System.in).nextLong();
                        System.out.println(personService.deletePersonById(id));
                    }
                    case 6->{
                        SocialMedia socialMedia = new SocialMedia();
                        System.out.println("write name");
                        socialMedia.setName(new Scanner(System.in).nextLine());
                        socialMedia.setId(GeneredId.getMediaId());
                        System.out.println(socialMediaService.saveSocialMedia(socialMedia));
                    }
                    case 7->{
                        System.out.println("write person id ");
                        Long id = new Scanner(System.in).nextLong();
                        System.out.println("write social media id ");
                        Long mediaId = new Scanner(System.in).nextLong();
                        socialMediaService.assignSocialMediaToPerson(id,mediaId);
                    }
                    case 8->{
                        System.out.println("write social media id ");
                        Long mediaId = new Scanner(System.in).nextLong();
                        System.out.println(socialMediaService.getSocialMediaById(mediaId));
                    }
                    case 9->{
                        System.out.println("write person id ");
                        Long id = new Scanner(System.in).nextLong();
                        System.out.println(socialMediaService.getAllSocialMediaByPersonId(id));
                    }
                    case 10->{
                        System.out.println("write person id ");
                        Long id = new Scanner(System.in).nextLong();
                        socialMediaService.deleteAllSocialMediaByPersonId(id);
                    }
                    case 11->{
                        System.out.println("write social media id ");
                        Long mediaId = new Scanner(System.in).nextLong();
                        socialMediaService.deleteSocialMediaById(mediaId);
                    }
                    case 12->{
                        Car car =new Car();
                        System.out.println("write name");
                        car.setName(new Scanner(System.in).nextLine());
                        System.out.println("write model");
                        car.setModel(new Scanner(System.in).nextLine());
                        System.out.println("write foundation year");
                        car.setYear(LocalDate.of(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt()));
                        car.setId(GeneredId.getCarId());
                        System.out.println("write person id");
                        Long id = new Scanner(System.in).nextLong();
                        carService.saveCar(id,car);
                    }
                    case 13->{
                        System.out.println("write person id");
                        Long id = new Scanner(System.in).nextLong();
                        System.out.println(carService.getCarById(id));
                    }
                    case 14->{
                        Car car = new Car();
                        System.out.println("write car id ");
                        Long id = new Scanner(System.in).nextLong();
                        System.out.println("write new name");
                        car.setName(new Scanner(System.in).nextLine());
                        System.out.println("write model");
                        car.setModel(new Scanner(System.in).nextLine());
                        System.out.println("write foundation year");
                        car.setYear(LocalDate.of(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt()));
                        carService.updateCarById(id,car);
                    }
                    case 15->{
                        System.out.println("write car id ");
                        Long id = new Scanner(System.in).nextLong();
                        System.out.println(carService.deleteCarById(id));
                    }

                }
            }catch (RuntimeException e){
                System.out.println(e.getMessage());
            }catch (Exception e){
                System.out.println(" exception ");
            }



        }

    }
}