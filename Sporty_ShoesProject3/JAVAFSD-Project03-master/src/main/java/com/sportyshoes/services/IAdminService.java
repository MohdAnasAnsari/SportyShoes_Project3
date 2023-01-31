package com.sportyshoes.services;

import com.sportyshoes.exceptions.ResourceNotFound;
import com.sportyshoes.models.Admin;

public interface IAdminService {

    public Admin insertAdminInDB(Admin admin);
    public void updateAdminInDB(Admin admin,Long adminId) throws ResourceNotFound;

}
