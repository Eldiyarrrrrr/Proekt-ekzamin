package service.impl;

import dao.SocialMediaDao;
import dao.daoImpl.SocialMediaDaoImpl;
import model.SocialMedia;
import service.SocialMediaService;

import java.util.List;

public class SocialMediaImpl implements SocialMediaService {

    SocialMediaDaoImpl socialMediaDao = new SocialMediaDaoImpl();

    @Override
    public void assignSocialMediaToPerson(Long personId, Long id) {
        socialMediaDao.assignSocialMediaToPerson(personId, id);
    }

    @Override
    public String saveSocialMedia(SocialMedia media) {
        return socialMediaDao.saveSocialMedia(media);
    }

    @Override
    public SocialMedia getSocialMediaById(Long id) {
        return socialMediaDao.getSocialMediaById(id);
    }

    @Override
    public List<SocialMedia> getAllSocialMediaByPersonId(Long id) {
        return socialMediaDao.getAllSocialMediaByPersonId(id);
    }

    @Override
    public void deleteAllSocialMediaByPersonId(Long id) {
        socialMediaDao.deleteAllSocialMediaByPersonId(id);
    }

    @Override
    public void deleteSocialMediaById(Long id) {
        socialMediaDao.deleteSocialMediaById(id);
    }
}

