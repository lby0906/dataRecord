package com.dataRecord.controller;

import com.dataRecord.domain.AjaxResult;
import com.dataRecord.domain.entity.Spces;
import com.dataRecord.mapper.SpcesMapper;
import com.dataRecord.service.SpcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author iboyang
 * @date 2023年12月12日 20:31
 * desc:
 */
@RestController
@RequestMapping("/spces")
public class SpcesController {

    @Autowired
    private SpcesService spcesService;

    @GetMapping("/list")
    public AjaxResult getSpcesList(){
        List<Spces> spcesList = spcesService.getSpcesList();
        return AjaxResult.success(spcesList);
    }

    @PostMapping("/addSpces")
    public AjaxResult addSpces(Spces spces){
        if(spcesService.addSpces(spces)){
            return AjaxResult.success("新增成功！");
        }
        return AjaxResult.error();
    }

    @PostMapping("/exitSpces")
    public AjaxResult exitSpces(Spces spces){
        if(spcesService.updateSpces(spces)){
            return AjaxResult.success("编辑成功！");
        }
        return AjaxResult.error();
    }

    @PostMapping("/delete")
    public AjaxResult deleteSpces(Integer id){
        if(spcesService.deleteSpces(id)){
            return AjaxResult.success("删除成功！");
        }
        return AjaxResult.error();
    }


}
