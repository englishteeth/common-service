/* ****************************************************************************
 * $Revision: 18656 $
 * $Date: 2016-02-15 15:40:37 +0000 (Mon, 15 Feb 2016) $
 * $Author: grant.flintoff $
 * ****************************************************************************
 * Copyright (C) 2011 - 2016 HD Insurance Ltd. All Rights Reserved.
 * ****************************************************************************
 */
package org.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommonApplication
{

  public static void main(String[] args) throws Exception
  {
    SpringApplication.run(CommonApplication.class, args);
  }

}
