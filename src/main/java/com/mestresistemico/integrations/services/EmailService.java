package com.mestresistemico.integrations.services;

import com.mestresistemico.integrations.dto.EmailDTO;

public interface EmailService {
	
	void sendEmail (EmailDTO dto);

}