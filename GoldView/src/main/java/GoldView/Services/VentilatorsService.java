package GoldView.Services;

import GoldView.Repositories.VentilatorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentilatorsService {

    @Autowired
    private VentilatorsRepository ventilatorsRepository;
}
