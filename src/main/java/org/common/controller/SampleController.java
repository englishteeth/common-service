/* ****************************************************************************
 * $Revision: 18656 $
 * $Date: 2016-02-15 15:40:37 +0000 (Mon, 15 Feb 2016) $
 * $Author: grant.flintoff $
 * ****************************************************************************
 * Copyright (C) 2011 - 2016 HD Insurance Ltd. All Rights Reserved.
 * ****************************************************************************
 */
package org.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController
{

  @RequestMapping("/")
  @ResponseBody
  String home()
  {
    return "Hello Wurld!";
  }

}