package dao.daoImpl;

import dao.SocialMediaDao;
import database.DataBase;
import model.Person;
import model.SocialMedia;

import java.util.List;

public class SocialMediaDaoImpl implements SocialMediaDao {

    @Override
    public void assignSocialMediaToPerson(Long personId, Long id) {
        for (Person person : DataBase.people) {
            if (person.getId().equals(personId)) {
                for (SocialMedia socialMedia : DataBase.socialMedia) {
                    if (socialMedia.getId().equals(id)) {
                        person.getSocialMedia().add(socialMedia);
                        System.out.println("successfully assigns");
                        return;
                    }

                }
            }
        }
        throw new RuntimeException("not found");
    }

    @Override
    public String saveSocialMedia(SocialMedia media) {
        DataBase.socialMedia.add(media);
        return "successfully added";
    }

    @Override
    public SocialMedia getSocialMediaById(Long id) {
        for (SocialMedia socialMedia : DataBase.socialMedia) {
            if (socialMedia.getId().equals(id)) {
                return socialMedia;
            }

        }
        throw new RuntimeException("not found");
    }

    @Override
    public List<SocialMedia> getAllSocialMediaByPersonId(Long id) {
        for (Person person : DataBase.people) {
            if (person.getId().equals(id)) {
                return person.getSocialMedia();
            }
        }
        throw new RuntimeException("not found");
    }

    @Override
    public void deleteAllSocialMediaByPersonId(Long id) {
        for (Person person : DataBase.people) {
            if (person.getId().equals(id)) {
                DataBase.people.remove(person.getSocialMedia());
                System.out.println("successfully deleted");
                return;
            }
        }
        throw new RuntimeException("not found");
    }


    @Override
    public void deleteSocialMediaById(Long id) {
        for (Person person : DataBase.people) {
            for (SocialMedia socialMedia : person.getSocialMedia()) {
                if (socialMedia.getId().equals(id)){
                    person.getSocialMedia().remove(socialMedia);
                    System.out.println("successfully deleted");
                    return;
                }
            }
        }
        throw new RuntimeException("not found");
    }
}

