/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.olingo.odata2.client.core.uri;

import org.apache.olingo.odata2.client.api.uri.SegmentType;

/**
 * The objects of this class provide the uri segment type and value
 *
 */
public class Segment {

  private final SegmentType type;

  private final String value;

  /**
   * 
   * @param type
   * @param value
   */
  public Segment(final SegmentType type, final String value) {
    this.type = type;
    this.value = value;
  }

  public SegmentType getType() {
    return type;
  }

  public String getValue() {
    return value;
  }
}
