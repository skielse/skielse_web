package com.ski.estate.oldhouse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author skielse
 * @date 2024/12/10
 */
@RestController
@RequestMapping("old-house")
public class OldHouseController {

    @RequestMapping("scan")
    public String getOldHouse(){
        return "old house";
    }
}
