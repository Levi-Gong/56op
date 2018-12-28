package com.sinoservices.op.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/vrp")
public class VrpController {

  /*
  private VehicleRouteAnalysisBiz vehicleRouteAnalysisBiz;

  @Autowired
  public void setVehicleRouteAnalysisBiz(VehicleRouteAnalysisBiz vehicleRouteAnalysisBiz) {
    this.vehicleRouteAnalysisBiz = vehicleRouteAnalysisBiz;
  }

  @RequestMapping(value = "{version}/asyncScheduling",method = RequestMethod.POST)
  public String asyncScheduling(@PathVariable("version") Integer version, VrpParamBean vrpParamBean) {

    return "";
  }*/
  @PostMapping(path = "/asyncScheduling")
  @ResponseBody
  public String asyncScheduling(@RequestParam(name = "param") String param) {

    return param;
  }
}
