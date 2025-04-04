package com.redweber.amemtst;




import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KitService {

    private final KitRepository kitRepository;

    public KitService(KitRepository kitRepository) {
        this.kitRepository = kitRepository;
    }

    public Kit saveKit(Kit kit) {
        return kitRepository.save(kit);
    }

    public List<Kit> getAllKits() {
        return kitRepository.findAll();
    }
}

