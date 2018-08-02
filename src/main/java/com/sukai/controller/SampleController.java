package com.sukai.controller;

import com.sukai.basic.Code;
import com.sukai.basic.Result;
import com.sukai.vo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@Api(description = "一个简易demo")
@RestController
public class SampleController {

    @RequestMapping(value = "/", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    @ApiOperation(value = "主页", notes = "应用主页")
    public Result home() {

        return new Result(Code.OK);
    }

    @RequestMapping(value = "/getName",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "获取姓名", notes = "获取姓名的一个方法")
    public Result getName() {

        return new Result(Code.OK, new User(1000, "sukai"));
    }

    @RequestMapping(value = "/setName",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "设置姓名", notes = "参数：<br/>   name: 姓名")
    public Result getName(
            @ApiParam(name = "name", value = "姓名")
            @RequestParam String name) {

        return new Result(Code.OK, new User(1000, name));
    }
}


