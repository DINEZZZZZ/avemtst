package com.redweber.amemtst;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/kits")
public class KitController {

    private final KitService kitService;

    public KitController(KitService kitService) {
        this.kitService = kitService;
    }

    @PostMapping
    public Kit addKit(@RequestBody Kit kit) {
        return kitService.saveKit(kit);
    }

    @GetMapping
    public List<Kit> getKits() {
        return kitService.getAllKits();
    }
}

