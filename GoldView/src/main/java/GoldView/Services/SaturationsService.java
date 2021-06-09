package GoldView.Services;

import GoldView.Repositories.SaturationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaturationsService {

    @Autowired
    SaturationsRepository saturationsRepository;
}
