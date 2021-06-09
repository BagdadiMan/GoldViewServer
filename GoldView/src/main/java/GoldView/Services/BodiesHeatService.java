package GoldView.Services;

import GoldView.Repositories.BodiesHeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BodiesHeatService {

    @Autowired
    BodiesHeatRepository bodiesHeatRepository;
}
