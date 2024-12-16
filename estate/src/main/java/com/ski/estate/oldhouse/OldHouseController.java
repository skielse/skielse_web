package com.ski.estate.oldhouse;

import com.ski.estate.oldhouse.bean.Region;
import com.ski.estate.oldhouse.processor.RegionProcessor;
import com.ski.estate.utils.IDGenerator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import us.codecraft.webmagic.Spider;

import java.util.List;

/**
 * @author skielse
 * @date 2024/12/10
 */
@RestController
@RequestMapping("old-house")
public class OldHouseController {

    @RequestMapping("scan")
    public String getOldHouse(){
        String oldHouseHomeUrl = "https://zz.lianjia.com/";
        RegionProcessor regionProcessor = new RegionProcessor();
        Spider.create(regionProcessor).addUrl(oldHouseHomeUrl + "ershoufang/").thread(1).run();
        List<Region> regionList = regionProcessor.getRegionList();
        long taskId = IDGenerator.getTaskId();
        for (Region region : regionList) {
            String regioonHouoseUrl = oldHouseHomeUrl + region.getRegionUrl() + "pg1";
            System.out.println(regioonHouoseUrl);
            HouseProcessor houseProcessor = new HouseProcessor("郑州", region.getRegionName());
            Spider.create(houseProcessor).addUrl(regioonHouoseUrl).thread(3).run();
            List<House> houseList = houseProcessor.getHouseList();
            new HouseDao().inseertHoue(houseList, "郑州", region.getRegionName(), taskId);
        }
        return "old house";
    }
}
