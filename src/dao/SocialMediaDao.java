package dao;

import model.SocialMedia;

import java.util.List;

public interface SocialMediaDao {
    void assignSocialMediaToPerson(Long personId,Long id);
    String saveSocialMedia( SocialMedia media);
    SocialMedia getSocialMediaById(Long id);
    List<SocialMedia> getAllSocialMediaByPersonId(Long id);
    void deleteAllSocialMediaByPersonId(Long id);
    void deleteSocialMediaById(Long id);
}

